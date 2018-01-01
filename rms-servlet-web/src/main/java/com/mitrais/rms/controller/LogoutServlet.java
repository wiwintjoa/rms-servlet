package com.mitrais.rms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends AbstractController
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
				
		HttpSession session=req.getSession();  
		session.invalidate();  
		resp.sendRedirect("index.jsp");			
	}  
}
