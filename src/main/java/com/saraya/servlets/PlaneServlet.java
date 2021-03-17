package com.saraya.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.PlaneService;
@WebServlet(urlPatterns="/plane.do")
public class PlaneServlet extends HttpServlet{

	private LoginService loginservice= new LoginService();
	private PlaneService service = new PlaneService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
		request.setAttribute("drissa",service.retrievePlanes());
		request.getRequestDispatcher("/WEB-INF/views/planeList.jsp").forward(request, response);
	}

}
