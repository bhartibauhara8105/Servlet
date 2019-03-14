package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletServlet
 */
@WebServlet("/servletServlet")
public class servletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<title>Servlet Hello World</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<h1>Request methods</h1>");
		out.println("<h1>Servlet Servletservlet at :"+request.getContextPath()+"</h1>");
		out.println("<h1>Servlet sevletServlet requested uri :"+request.getRequestURI()+"</h1>");
		out.println("<h1>Servlet servletServlet protocol :"+request.getProtocol()+"</h1>");
		out.println("<b>Server Name :</b>"+request.getServerName()+"<br/>");
		out.println("<b>Server Port Number :</b>"+request.getServerPort()+"<br/>");
		out.println("<h3>Random Value for each request :"+Math.random()+"</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
