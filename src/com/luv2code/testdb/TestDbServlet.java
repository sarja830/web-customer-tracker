package com.luv2code.testdb;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setup connection variables
		String userString = "hbstudent";
		String passString = "hbstudent";
		String jdbcUrl= "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver ="com.mysql.cj.jdbc.Driver";
		
		//getting connection to database
		try {
			PrintWriter outPrintWriter =response.getWriter();
			Class.forName(driver);
	Connection myConn =DriverManager.getConnection(jdbcUrl,userString,passString);			
			outPrintWriter.println("Connecting to database:" + jdbcUrl);
			outPrintWriter.print("success");
			myConn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
 	}

	
	

}
