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
		
		String number = request.getParameter("number"); 
		//request 객체의 getParameter() 메서드로 사용자가 입력한 데이터를 가져올수있다(int로 사용하고 싶으면 형변환 필요.)
		
		int result = Integer.parseInt(number);

		request.setAttribute("result",result);//(jsp에서 사용할 변수이름, 그대로 넣어준다)
		//result에서 객체를 request에 담아 보낼 경우("객체명", 객체)
		//setAttribute는 메소드는 속성값을 변경시키는 메소드이다.
		//getAttribute는 특정 요소노드 내에 특정  한 속성값을 가져오는 메소드이다.
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
		//==> home으로 들어욌을때 /WEB-INF/intex.jsp 여기를 보여 달라는 의미(jsp는 WEB-INF안에 만들어 주어야 한다)
		//RequestDispatcher == 요청을 발송해주는 역할(url로들어온 요청을 WEB-INF/intex.jsp 여기로 보여준다.)
		
		requestDispatcher.forward(request, response);
		//forward메서는 == WEB-INF/intex.jspdurlfh 여기로
		
//		구구단 힌트
//		servlet
//			-number
//			-number -> jsp
//			-index.jsp
//			
//		jsp
//			-h1 몇단위인지
//			-<% for() {%> 
//			<p> 3*1 =3  //<p>->텍스트 나올때 사용
//			<%}%>
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
