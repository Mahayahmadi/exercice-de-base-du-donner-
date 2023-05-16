package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.InformationDAO;
import beans.InformationDAO.Information;

/**
 * Servlet implementation class mm
 */
@WebServlet("/mm")
public class mm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("t1");
		String prenom = request.getParameter("t2");
		String email = request.getParameter("t5");
		/*PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>MR F</title><head>");
		out.println("<body><h1>"+nom +"</h1><h1>"+prenom +"</h1><h1>"+email +"</h1></body></html>");
		*/ List<Information> informations = InformationDAO.getAllInformations();
	       request.setAttribute("informations", informations);
	        request.getRequestDispatcher("/pp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
