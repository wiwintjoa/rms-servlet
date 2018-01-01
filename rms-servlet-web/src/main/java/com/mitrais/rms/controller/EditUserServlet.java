package com.mitrais.rms.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

@WebServlet("/edituser")
public class EditUserServlet extends AbstractController {
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException
    {	
		UserDao userDao = UserDaoImpl.getInstance();
		long id = Integer.parseInt(req.getParameter("id"));
		String username = req.getParameter("userName");
		String password = req.getParameter("userPass");
		
		User user = new User(id, username, password);
		if (userDao.updateUser(user)) {
			resp.sendRedirect("users/list");
		}else {
			resp.sendRedirect("../error");
		}
    }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		UserDao userDao = UserDaoImpl.getInstance();
		long id = Integer.parseInt(req.getParameter("id"));
		Optional<User> existingUser = userDao.find(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("users/edit");
		req.setAttribute("user", existingUser.get());
		dispatcher.forward(req, resp);
	}
}
