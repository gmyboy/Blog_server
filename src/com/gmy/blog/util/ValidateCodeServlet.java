package com.gmy.blog.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateCodeServlet extends HttpServlet{
	private static final long serialVersionUID = -3496448928839909171L;
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/"),
				uri.lastIndexOf("."));

		if (action.equals("/getImage")) {
			// 设置响应的类型格式为图片格式
			response.setContentType("image/jpeg");
			//禁止图像缓存。
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			
			HttpSession session = request.getSession();
			
			ValidateCode vCode = new ValidateCode(120,40,5,100);
			session.setAttribute("code", vCode.getCode());
			vCode.write(response.getOutputStream());
			
		}
		
		else if(action.equals("/getCode")){
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			String code = (String)session.getAttribute("code");
			out.println(code);
		}
	}
}
