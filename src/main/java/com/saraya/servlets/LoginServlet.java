package com.saraya.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.PlaneService;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	private LoginService loginservice= new LoginService();
	private PlaneService service = new PlaneService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		
			String username= request.getParameter("username");
			String password= request.getParameter("password");
						
			boolean isValid = loginservice.isValidateUser(username, password);
			if(!isValid) {
				
				request.setAttribute("Error","Wrong Pasword or Username! Try again");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}else {
			request.setAttribute("name", username);
			response.sendRedirect("/plane.do");
		}
	}	
}