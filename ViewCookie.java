package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewCookie
 */
@WebServlet("/ViewCookie")
public class ViewCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        PrintWriter out = response.getWriter();
		Cookie[] cks=request.getCookies();
		
		String cn = null;
		String cv = null;
	//	String cpp = null;
	//String css = null;
		for(Cookie ck :cks)
		{
			  cn=ck.getName();
			  cv=ck.getValue();
			 
		
	/*	for(Cookie cs :cks)
		{
			 // =cp.getName();
			  css=cs.getValue();
		}*/
		out.println("<b>Cookie Name :"+cn+"</b>\n");
		out.println("<b>Cookie Value :"+cv+"</b>\n");
		//out.println("<b>Cookie Name :"+cpp+"</b>");
		//out.println("<b>Cookie Value :"+css+"</b>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
