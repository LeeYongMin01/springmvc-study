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
		System.out.println("Hello World!!");
		System.out.println("request: " + request);
		System.out.println("response: " + response);

		String username = request.getParameter("username");
		System.out.println("username: " + username);
	}
}
