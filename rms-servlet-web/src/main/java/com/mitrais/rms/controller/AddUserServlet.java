package com.mitrais.rms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

@WebServlet("/newuser")
public class AddUserServlet extends AbstractController {
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException
    {
		UserDao userDao = UserDaoImpl.getInstance();
		String username = req.getParameter("userName");
		String password = req.getParameter("userPass");

		User newUser = new User(username, password);
		userDao.save(newUser);
		resp.sendRedirect("users/list");
    }
}
