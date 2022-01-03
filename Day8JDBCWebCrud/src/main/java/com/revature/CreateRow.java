package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateRow
 */
@WebServlet("/CreateRow")
public class CreateRow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateRow() {
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
		PrintWriter out = response.getWriter();

		out.println(
				" <a href='CreateRow'>Add New Record </a> <table align='center' border='1'> <form action='InsertRow'>  <tr> <th>Sl No </th> <th> Label </th> <th> Value </th> </tr> ");

		out.print("<tr> <td>1 </td> <td> ID </td> <td> <input type='text' name='id' placeholder='Enter Name Here'/> </td> </tr>");
		out.print("<tr> <td>2 </td> <td> Name </td>  <td> <input type='text' name='name' placeholder='Enter Name Here'/> </td> </tr>");
		out.print("<tr><td>3 </td> <td> Email </td>  <td> <input type='text' name='email' placeholder='Enter Email Here'/> </td> </tr>");
		out.print(
				"<tr> <td colspan='2'> <input type='reset' value='Clear' /> </td>   <td> <input type='submit' value='Insert' /> </td> </tr>");

		out.println(" </form></table>");
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
