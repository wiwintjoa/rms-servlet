package com.mitrais.rms.controller;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/users/*")
public class UserServlet extends AbstractController
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String path = getTemplatePath(req.getServletPath()+req.getPathInfo());        

		try {			
			listUser(req, resp, path);			
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}              
    }
    
	private void listUser(HttpServletRequest req, HttpServletResponse resp, String path)
			throws SQLException, IOException, ServletException {

		UserDao userDao = UserDaoImpl.getInstance();
		List<User> users = userDao.findAll();
		req.setAttribute("users", users);
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		dispatcher.forward(req, resp);
	}  
}
