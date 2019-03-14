package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();	
			String username=request.getParameter("userName").trim();
			String password=request.getParameter("password").trim();
			if(username==null||username.equals("")||password==null||password.equals(""))
			{
			  out.print("Please enter both username "+"and password.<br/><br/>");
			  RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			  rd.include(request, response);
			}	//doGet(request, response);
			else if(username.equals("abhi")&&password.equals("@123"))
			{
				HttpSession session=request.getSession();
				session.setAttribute("username",username);
				session.setAttribute("password",password);
				out.println("Logged In Successfully.<br/>");
				out.println("Click on the below link to see"+"the values of username and password.<br/>");
				out.println("<a href='DisplaySessionValueServlet'>"+"Click Here</a>");
				out.close();
			}
			else
			{
				out.println("Wrong username or password <br/><br/>");
				RequestDispatcher rd=request.getRequestDispatcher("/login.html");
				rd.include(request, response);
			}
	}

}
