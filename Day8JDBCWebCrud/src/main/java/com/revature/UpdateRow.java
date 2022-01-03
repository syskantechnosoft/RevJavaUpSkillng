package com.revature;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UpdateRow
 */
@WebServlet("/UpdateRow")
public class UpdateRow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateRow() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
			
			String query = "update employee set name=?, email=? where id=?";
//			String query = "UPDATE employee  SET name="+name+", email="+email+" where id="+id;
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, id);

			int updateStatus = 0;

			updateStatus = pstmt.executeUpdate();

			if (updateStatus > 0) {
				response.sendRedirect("DbCrud");
			} else {
				System.out.println("Error While Updating!!!");
			}

			// Step 4: Storing & Processing the result
//			ResultSet rs = stmt.executeQuery(query);
//			out.println(
//					" <table align='center' border='1'> <tr> <th>ID </th> <th> Name </th> <th> Email </th> <th> Actions </th> </tr> ");
//			while (rs.next()) {
//				out.println("<tr> <td>" + rs.getInt(1) + " </td> <td> " + rs.getString("name") + " </td> <td>  "
//						+ rs.getString(3) + "</td> <td> <a href='EditRow/id=" + rs.getInt(1)
//						+ "'> Edit </a> || <a href='DeleteRow/id=" + rs.getInt(1) + "'> Delete </a> </td> </tr>");
//			}
//			out.println("</table>");

			// Step 5: Close Resources
//			rs.close();
//			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
