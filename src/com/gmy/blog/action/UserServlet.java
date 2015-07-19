package com.gmy.blog.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gmy.blog.entity.User;
import com.gmy.blog.service.AttentionService;
import com.gmy.blog.service.ChangePwdService;
import com.gmy.blog.service.CollectBlogService;
import com.gmy.blog.service.LoginService;
import com.gmy.blog.service.PerfectUserService;
import com.gmy.blog.service.RegistService;

public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = -1078839267975376946L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/"),
				uri.lastIndexOf("."));
		
		System.out.println();
		System.out.println("收到请求! UserServlet-uri:" + uri);
		
		/**	用户注册	*/
		//验证用户名
		if(action.equals("/checkUsername")){
			String user_name = request.getParameter("user_name");
			
			System.out.println("用户请求验证用户名...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");
			
			RegistService service = new RegistService();
			try{
				int n = service.checkUser(user_name);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//提交注册请求
		else if(action.equals("/regist")) {
			String user_name = request.getParameter("user_name");
			String pwd = request.getParameter("pwd");
			String email = request.getParameter("email");
			User user = new User(user_name, pwd, email);
			
			System.out.println("用户请求注册...");
			System.out.println("user_name : " + user_name);
			System.out.println("pwd : " + pwd);
			System.out.println("email :" + email);
			System.out.println("获取参数成功！开始返回响应...");
			
			RegistService service = new RegistService();
			try {
				int n = service.addUser(user);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);
				
				System.out.println(str);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/**	用户登录	*/	
		//提交登录请求
		else if(action.equals("/login")){
			String user_name = request.getParameter("user_name");
			String pwd = request.getParameter("pwd");
			
			System.out.println("用户请求登录...");
			System.out.println("user_name : " + user_name);
			System.out.println("pwd : " + pwd);
			System.out.println("获取参数成功！开始返回响应...");
			
			LoginService service = new LoginService();
			try{
				int n = service.login(user_name, pwd);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		/**	登录用户的功能	*/
		//修改密码
		else if(action.equals("/changePwd")){
			String user_name = request.getParameter("user_name");
			String pwd = request.getParameter("pwd");
			String newPwd = request.getParameter("newPwd");
			
			System.out.println("用户请求更改密码...");
			System.out.println("user_name : " + user_name);
			System.out.println("pwd : " + pwd);
			System.out.println("new Pwd : " + newPwd);
			System.out.println("获取参数成功！开始返回响应...");
			
			try{
				ChangePwdService service = new ChangePwdService();
				int n = service.changePwd(user_name, pwd, newPwd);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);
				
				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		
		//完善用户信息
		else if(action.equals("/perfectUser")){
			String user_name = request.getParameter("user_name");
			String sex = request.getParameter("sex");
			String location = request.getParameter("location");
			String intro = request.getParameter("intro");
			String hobby = request.getParameter("hobby");
			String birthday = request.getParameter("birthday");
	
			
			System.out.println("用户请求更改用户信息...");
			System.out.println("user_name : " + user_name);
			System.out.println("sex : " + sex);
			System.out.println("location : " + location);
			System.out.println("intro : " + intro);
			System.out.println("hobby : " + hobby);
			System.out.println("birthday : " + birthday);
			System.out.println("获取参数成功！开始返回响应...");
			
			try{
				PerfectUserService service = new PerfectUserService();
				User user = new User();
				user.setUsername(user_name);
				user.setSex(sex);
				user.setLocation(location);
				user.setIntro(intro);
				user.setHobby(hobby);
				user.setBirthday(birthday);
				int n = service.perfectUser(user);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//添加关注
		else if(action.equals("/attention")){
			String user_name = request.getParameter("user_name");
			String attention_name = request.getParameter("attention_name");
			
			System.out.println("用户请求进行关注操作...");
			System.out.println("user_name : " + user_name);
			System.out.println("attention_name :" + attention_name);
			System.out.println("获取参数成功！开始返回响应...");
			
			try{
				AttentionService service = new AttentionService();
				int n = service.attention(user_name, attention_name);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//删除关注
		else if(action.equals("/deleteAttention")){
			String user_name = request.getParameter("user_name");
			String attention_name = request.getParameter("attention_name");
			
			System.out.println("用户请求取消关注操作...");
			System.out.println("user_name : " + user_name);
			System.out.println("attention_name :" + attention_name);
			System.out.println("获取参数成功！开始返回响应...");
			
			try{
				AttentionService service = new AttentionService();
				int n = service.deleteAttention(user_name, attention_name);
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//添加收藏
		else if(action.equals("/collect")){
			String user_name = request.getParameter("user_name");
			String blog_id = request.getParameter("blog_id");
			
			System.out.println("用户请求进行收藏操作...");
			System.out.println("user_name : " + user_name);
			System.out.println("blog_id : " + blog_id);
			System.out.println("获取参数成功！开始返回响应...");
			
			try{
				CollectBlogService service = new CollectBlogService();
				int n = service.addCollectBlog(user_name, 
						Integer.parseInt(blog_id));
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//删除收藏
		else if(action.equals("/deleteCollect")){
			String user_name = request.getParameter("user_name");
			String blog_id = request.getParameter("blog_id");
			
			System.out.println("用户请求进行删除收藏操作...");
			System.out.println("user_name : " + user_name);
			System.out.println("blog_id : " + blog_id);
			System.out.println("获取参数成功！开始返回响应...");
			
			try{
				CollectBlogService service = new CollectBlogService();
				int n = service.deleteCollectBlog(user_name, 
						Integer.parseInt(blog_id));
				String str = "{\"n\":\""+ n +"\"}";
				out.println(str);

				System.out.println(str);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		System.out.println("Servlet结束!");
		System.out.println();
	}
}
