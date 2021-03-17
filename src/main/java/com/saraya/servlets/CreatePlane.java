package com.saraya.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.PlaneService;

@WebServlet(urlPatterns="/create.do")
public class CreatePlane extends HttpServlet{
	
	PlaneService service = new PlaneService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		String planeId=request.getParameter("id");
		int id = Integer.parseInt(planeId);
		String name = request.getParameter("name");
		String model = request.getParameter("model");
		String description = request.getParameter("description");
		String ye = request.getParameter("id");
		int year = Integer.parseInt(ye);
		String picture = request.getParameter("picture");
		String price = request.getParameter("price");
		
		service.addPlane(id,  name, model, year, description, picture, price);
		response.sendRedirect("/plane.do");
	}
}
