package com.hello.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,
			IOException
	{
		String username = request.getParameter("username");

		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("hello " + username);

	}
}
