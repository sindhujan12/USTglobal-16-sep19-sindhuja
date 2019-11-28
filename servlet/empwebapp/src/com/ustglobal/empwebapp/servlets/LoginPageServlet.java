package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id ="";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null){
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}

		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table allign='center'>");
		out.println("<tr>");
		out.println("<td>Id:</td>");
		out.println("<td><input type= 'number' name = 'id' value='"+id+"'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Password:</td>");
		out.println("<td><input type= 'password' name = 'password'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Remember Me:</td>");
		out.println("<td><input type= 'checkbox' name = 'rememberme' value='checked'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type= 'reset' value = 'reset'></td>");
		out.println("<td><input type= 'submit' value='login'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("<a href='./register.html'>Register</a>");
	}

}
