package com.ysh.mini;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트에 대한 요청 <- request ->  클라이언트에 대한 응답
		String number = request.getParameter("number");
		
		int result = Integer.parseInt(number) * 5;
		
		response.setCharacterEncoding("UTF-8");//컴퓨터는 한글을 잘 못읽기 때문에 잘 이해할 수 있도록 적어준는 것
		response.setContentType("text/html; charset=UTF-8");//한글로 잘 넣어 달라고 써준는 것
		
		PrintWriter write = response.getWriter(); //웹에서 결과를 보여주기 위한 코드
		//response의 바디에 넣는 것을 보여준느 것
		
		write.println("<!DOCTYPE html>"
				+ "<html lang='ko'>"
				+ "<head>"
				+ "<meta charset='UTF-8'>"
				+ "<title>setvlet</title>"
				+ "<body>"
				+ "<hi>"
				+ "보내주신 숫자에 5를 곱한 결과는"
				+ result
				+ "입니다."
				+ "</h1>"
				+ "</body>"
				+ "</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
