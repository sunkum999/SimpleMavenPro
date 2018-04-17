package com.our.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CallServlet
 */
public class CallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("hello Maven Servlet : ");
		
		Date time = new Date();
		System.out.println("<div align=center>");
		out.println("hello Maven Servlet : "+time);
		out.println("<h2 style='color: red; font: italic; font-size: 50><b><p> "+time+"</p></b></h2>");
		out.println("<h2 style='color: red; font: italic; font-size: 50><b><p> CoolServlet </p></b></h2>");
		System.out.println("</div>");
	}

}
