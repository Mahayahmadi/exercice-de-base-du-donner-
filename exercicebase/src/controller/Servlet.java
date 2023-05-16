package controller;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import beans.InformationDAO;
import beans.InformationDAO.Information;

import java.io.IOException;
	import java.util.List;

	@WebServlet("/controller")
	public class Servlet extends HttpServlet {
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        List<Information> informations = InformationDAO.getAllInformations();
	        request.setAttribute("informations", informations);
	        request.getRequestDispatcher("/pp.jsp").forward(request, response);
	    }
	}

