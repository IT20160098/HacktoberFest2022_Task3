package com.announcement;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







@WebServlet("/AnnouncementInsert")
public class AnnouncementInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("tit");
		String pname = request.getParameter("prod");
		String des = request.getParameter("desc");
		String phone = request.getParameter("cont")
		String email = request.getParameter("mail");
		String date = request.getParameter("dat");
		

		

		boolean isTrue
		
		isTrue = AnnouncementDBUtil.insertdetails(title, pname, des, phone,email,date);
		
		if(isTrue == true) 
			String Title = request.getParameter("tit");

			
			isTrue = AnnouncementDBUtil.validate(Title);
			
			if (isTrue == true) {
				List<Announcement> anuDetails  AnnouncementDBUtil.getAnnouncement(Title);
				request.setAttribute("anuDetails"anuDetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("success.jsp")
				dis.forward(request, response);
			} else {
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
			
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}


}
