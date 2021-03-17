package com.saraya.servlets;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.PlaneService;

@WebServlet(urlPatterns="/delete.do")
public class DeleteServlet extends HttpServlet{
	
		 PlaneService service = new PlaneService();
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		String planeId= request.getParameter("id");
		int id = Integer.parseInt(planeId);
		service.deleteById(id);
			
		response.sendRedirect("/plane.do");
	}
}
