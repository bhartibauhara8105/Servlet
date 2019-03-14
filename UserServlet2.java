package com.niit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet2
 */
@WebServlet("/UserServlet2")
public class UserServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext context =getServletContext();
		Object obj=context.getAttribute("userid");
		PrintWriter out=response.getWriter();
		try{ 
			int c=0;
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");  
			PreparedStatement ps=con.prepareStatement("select * from candidates where id='"+obj.toString()+"'");  
			//ps.setInt(1,Integer.parseInt(request.getParameter("uid")));  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
			out.print("<html><body><h1>First Name: "+rs.getString(2)+"  "+"<br>Last Name: "+rs.getString(3)+"  "+"<br>Phone: "+rs.getString(5)+"  "+"<br>Email: "+rs.getString(6)+"</h1></body></html>");  
			c++;
			}
			if(c==0) {
				out.print("<html><body><h1>No Data Found</h1></body></html>");
			}
			
			
			con.close();  
			}catch(Exception e){e.printStackTrace();}  
			}  	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
