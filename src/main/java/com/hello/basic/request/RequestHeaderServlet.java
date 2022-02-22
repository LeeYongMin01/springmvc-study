package com.hello.basic.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,
			IOException
	{
		printStartLine(request);
		printHeader(request);
		printHeaderUtils(request);
		printEtc(request);

		response.getWriter().write("ok");
	}

	private void printEtc(HttpServletRequest request)
	{
		System.out.println("--- 기타 조회 start ---");
		System.out.println("[Remote 정보]");
		System.out.println("request.getRemoteHost() = " + request.getRemoteHost());
		System.out.println("request.getRemoteAddr() = " + request.getRemoteAddr());
		System.out.println("request.getRemotePort() = " + request.getRemotePort());

		System.out.println("[Local 정보]");
		System.out.println("request.getLocalName() = " + request.getLocalName());
		System.out.println("request.getLocalAddr() = " + request.getLocalAddr());
		System.out.println("request.getLocalPort() = " + request.getLocalPort());
		System.out.println("--- 기타 조회 end ---");
	}

	private void printHeader(HttpServletRequest request)
	{
		System.out.println("--- Headers - start ---");
	}

	private void printHeaderUtils(HttpServletRequest request)
	{

	}

	private void printStartLine(HttpServletRequest request)
	{

	}
}
