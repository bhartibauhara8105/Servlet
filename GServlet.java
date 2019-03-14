package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GServlet
 */
@WebServlet("/GServlet")
public class GServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public GServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see servletServlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet :"+this.getServletInfo()+"has started");
	}

	/**
	 * @see servletServlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet : "+this.getServletInfo()+" has stopped");

	}

	/**
	 * @see servletServlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello Generic Servlet</b>");
		out.print("</body></html>");
	}

}
