package com.mitrais.rms.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

public class UserServletTest {

	@Test
	public void testUserCRUD() {
		UserDao userDao = UserDaoImpl.getInstance();
		User user = new User(null,"Test","12345");
		
		userDao.save(user);
		
		Optional<User> existingUser = userDao.findByUserName("Test");
		assertEquals("Test", existingUser.get().getUserName());
		
		User updateUser = existingUser.get();
		assertNotNull(updateUser);
		updateUser.setUserName("Test1");
		assertEquals("Test1", updateUser.getUserName());
				
		assertTrue(userDao.updateUser(updateUser));
		
		Optional<User> deleteUser = userDao.find(existingUser.get().getId());
		userDao.delete(deleteUser.get());
		
		Optional<User> deletedUser = userDao.find(existingUser.get().getId());
		assertFalse(deletedUser.isPresent());
	}

}
