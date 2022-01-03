package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditRow
 */
@WebServlet("/EditRow")
public class EditRow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditRow() {
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
		PrintWriter out = response.getWriter();

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
//			String query = "select * from employee";
			String query = "select * from employee where id =" + id;
			Statement stmt = conn.createStatement();

			// Step 4: Storing & Processing the result
			ResultSet rs = stmt.executeQuery(query);
			out.println(" <a href='CreateRow'>Add New Record </a> <table align='center' border='1'> <form action='UpdateRow?id=" + id
					+ "'>  <tr> <th>Sl No </th> <th> Label </th> <th> Value </th> </tr> ");
			if (rs.next()) {
				out.print("<tr> <td>1 </td> <td> ID </td> <td> <input type='text' readonly name='id' value='"
						+ rs.getInt(1) + "' /> </td> </tr>");
				out.print("<tr> <td>2 </td> <td> Name </td>  <td> <input type='text' name='name' value='"
						+ rs.getString(2) + "'/> </td> </tr>");
				out.print("<tr><td>3 </td> <td> Email </td>  <td> <input type='text' name='email' value='"
						+ rs.getString(3) + "'/> </td> </tr>");
				out.print(
						"<tr> <td colspan='2'> <input type='reset' value='Clear' /> </td>   <td> <input type='submit' value='Update' /> </td> </tr>");
			}
			out.println(" </form></table>");

			// Step 5: Close Resources
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
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
