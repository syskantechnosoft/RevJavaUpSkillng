package com.revature;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertRow
 */
@WebServlet("/InsertRow")
public class InsertRow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertRow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id =" + id);

		try {
			// Step 1: Loading and Registering the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/revature";
			String user = "root";
			String password = "root";

			// Step 2: Establishing the connection
			Connection conn = DriverManager.getConnection(url, user, password);
//
//			// Step 3: Create & Execute the query
			
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			String query = "insert into employee (name, email) values (?,?)";
//			String query = "UPDATE employee  SET name="+name+", email="+email+" where id="+id;
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
//			pstmt.setInt(3, id);

			int insertStatus = 0;

			insertStatus = pstmt.executeUpdate();

			if (insertStatus > 0) {
				response.sendRedirect("DbCrud");
			} else {
				System.out.println("Error While Inserting!!!");
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
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
