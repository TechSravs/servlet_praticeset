package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class FirstServlet extends HttpServlet{
	//@Override
	//public void init() throws ServletException {
		//System.out.println("init() method called");
	//}
	
	//@Override
	//protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			//throws ServletException, IOException {
		//System.out.println("doGet() service method called");
	//}
	//@Override
	//public void destroy() {
		//System.out.println("destroy() method called");
		
	
//}
	
	//scenarios
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//String name = req.getParameter("name");
		//String desig = req.getParameter("desig");
		//String ts = req.getParameter("ts");
//		System.out.println("name = "+name);
//		System.out.println("designation = "+desig);
		//System.out.println("tech skills = "+ts);
		
		//Enumeration<String> pN = req.getParameterNames();
		//while(pN.hasMoreElements()) {
			//System.out.println(pN.nextElement());
		//}
		String name = req.getParameter("name");
		String desig = req.getParameter("desig");
		String[] pV = req.getParameterValues("techskills");
		
		System.out.println("name = "+name);
		System.out.println("designation = "+desig);
		
		for(String i :pV) {
			System.out.println(i);
		}
		
//      send response to client- static
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h3>Thank you for your response "+name +"</h3>\r\n" //dynamic
				+ "</body>\r\n"
				+ "</html>");
	}
}

