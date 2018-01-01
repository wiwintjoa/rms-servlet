package com.mitrais.rms.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends AbstractController
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	HttpSession session = req.getSession(false);
    	
        String path = getTemplatePath(req.getServletPath());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);        
        
        if (session != null) {
        	String name=(String)session.getAttribute("name");
        	if(name==null) {
        		session.invalidate();
        		requestDispatcher.forward(req, resp);
        	}else {
        		resp.sendRedirect("users/list");
        	}
        }
        else {
        	requestDispatcher.forward(req, resp);
        }        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {        
        HttpSession session = req.getSession(false);
        if (session != null) {
        	session.removeAttribute("error_title");
        	session.removeAttribute("error_message");
        }
        
        String name = req.getParameter("userName");
        String password = req.getParameter("userPass");
        
        UserDao userDao = UserDaoImpl.getInstance();
        User user = userDao.findByUserNameAndPassword(name, password).orElse(null);
        
        if(user != null) {
        	HttpSession newSession = req.getSession();
        	newSession.setAttribute("name", user.getUserName());
        	resp.sendRedirect("users/list");
        }else {
        	if (session != null) {
        		session.setAttribute("error_title", "Authentication failed");
        		session.setAttribute("error_message", "Invalid user name or password");        	
        	}else {
            	HttpSession newSession = req.getSession();
            	newSession.setAttribute("error_title", "Authentication failed");
            	newSession.setAttribute("error_message", "Invalid user name or password");        		
        	}
        	resp.sendRedirect("/rms-servlet-web/error");
        }        
    }
}
