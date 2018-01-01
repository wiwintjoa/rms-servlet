package com.mitrais.rms.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

@WebServlet("/deleteuser")
public class DeleteUserServlet extends AbstractController{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException
    {
		UserDao userDao = UserDaoImpl.getInstance();
		long id = Integer.parseInt(req.getParameter("id"));
				
		Optional<User> user = userDao.find(id);
		userDao.delete(user.get()) ;
		resp.sendRedirect("users/list");;
    }
}
