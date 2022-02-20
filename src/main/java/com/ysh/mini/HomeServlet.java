package com.ysh.mini;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	//프로그램 과정 : home아라는 요청을 했을때 -> /WEB-INF/intex.jsp 응답 ->
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트에 대한 요청 <- request ->  클라이언트에 대한 응답
		
		//ctrl + 1 단축키 ->  inmport
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
		//==> home으로 들어욌을때 /WEB-INF/intex.jsp 여기를 보여 달라는 의미(jsp는 WEB-INF안에 만들어 주어야 한다)
		//RequestDispatcher == 요청을 발송해주는 역할(url로들어온 요청을 WEB-INF/intex.jsp 여기로 보여준다.)
		
		requestDispatcher.forward(request, response);
		//forward메서는 == WEB-INF/intex.jspdurlfh 여기로
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
