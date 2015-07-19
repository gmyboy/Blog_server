package com.gmy.blog.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.gmy.blog.bean.BlogBean;
import com.gmy.blog.bean.UserBean;
import com.gmy.blog.entity.Topic;
import com.gmy.blog.service.BeanService;

public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = -6973472302576612482L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/"),
				uri.lastIndexOf("."));

		System.out.println();
		System.out.println("收到请求! BeanServlet-uri:" + uri);

		/** 获取用户微博列表(单页10条) */
		if (action.equals("/getBlogBean")) {
			String user_name = request.getParameter("user_name");
			String page = request.getParameter("page");

			System.out.println("用户请求获取个人微博列表-第" + page + "页...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<BlogBean> list = service.getBlogBean((user_name),
						Integer.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取用户好友微博列表(单页10条) */
		else if (action.equals("/showBlogBean")) {
			String user_name = request.getParameter("user_name");
			String page = request.getParameter("page");
			System.out.println("用户请求获取  好友微博列表  -  第" + page + "页...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<BlogBean> list = service.showBlogBean((user_name),
						Integer.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取热门微博列表(单页10条) */
		else if (action.equals("/showHotBlogBean")) {
			String page = request.getParameter("page");

			System.out.println("用户请求获取  Hot微博列表  -  第" + page + "页...");
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<BlogBean> list = service.showHotBlogBean(Integer
						.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取用户收藏微博的数量 */
		else if (action.equals("/getCollectNum")) {
			String user_name = request.getParameter("user_name");

			System.out.println("用户请求获取收藏数...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				int num = service.getCollect_num(user_name);
				String str = "{\"num\":\"" + num + "\"}";
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取用户收藏的全部微博 */
		else if (action.equals("/showCollectBlogBean")) {
			String user_name = request.getParameter("user_name");
			String page = request.getParameter("page");

			System.out.println("用户请求获取  收藏微博列表  -  第" + page + "页...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<BlogBean> list = service.showCollectBlogBean(user_name,
						Integer.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取用户详细信息列表 */
		else if (action.equals("/getUserBean")) {
			String user_name = request.getParameter("user_name");

			System.out.println("用户请求获取  单个用户  详细信息...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				UserBean userbean = service.getUserBean(user_name);
				JSONObject jsonObj = JSONObject.fromObject(userbean);
				String str = jsonObj.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取热门用户列表(单页10条) */
		else if (action.equals("/showHotUserBean")) {
			String page = request.getParameter("page");

			System.out.println("用户请求获取  热门用户列表  简单信息...");
			System.out.println("page : " + page);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<UserBean> list = service.showHotUserBean(Integer
						.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取用户关注好友的列表及简单信息 */
		else if (action.equals("/getAttentionUserBean")) {
			String user_name = request.getParameter("user_name");

			System.out.println("用户请求获取  关注好友列表  简单信息...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<UserBean> list = service.getAttentionUserBean(user_name);
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 获取用户关注粉丝的列表及简单信息 */
		else if (action.equals("/getFansUserBean")) {
			String user_name = request.getParameter("user_name");

			System.out.println("用户请求获取  粉丝列表  简单信息...");
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<UserBean> list = service.getFansUserBean(user_name);
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 检索 */
		// 按微博内容查找微博(模糊查找)
		else if (action.equals("/searchBlogBean")) {
			String keyword = request.getParameter("keyword");
			String page = request.getParameter("page");

			System.out.println("用户请求检索微博  keyword:" + keyword + " 第 " + page
					+ "页...");
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<BlogBean> list = service.searchBlogBean(keyword,
						Integer.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 按照用户名查找用户(模糊查找)
		else if (action.equals("/searchUserBean")) {
			String keyword = request.getParameter("keyword");
			String page = request.getParameter("page");

			System.out.println("用户请求检索用户信息  keyword:" + keyword + " 第 " + page
					+ "页...");
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<UserBean> list = service.searchUserBean(keyword,
						Integer.parseInt(page));
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/** 获取热门话题 */
		else if (action.equals("/getTopics")) {

			System.out.println("用户请求获取  话题列表 ");
			System.out.println("开始返回响应...");

			try {
				BeanService service = new BeanService();
				List<Topic> list = service.getTopics();
				JSONArray jsonArray = JSONArray.fromObject(list);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 通过微博id获取微博详细信息
		else if (action.equals("/getBlogBeanById")) {
			String blog_id = request.getParameter("blog_id");

			System.out.println("用户请求获取单条微博信息...");
			System.out.println("blog_id : " + blog_id);
			System.out.println("获取参数成功！开始返回响应...");

			try {
				BeanService service = new BeanService();
				BlogBean blogbean = service.getBlogBeanById(Integer
						.parseInt(blog_id));
				JSONObject jsonArray = JSONObject.fromObject(blogbean);
				String str = jsonArray.toString();
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Servlet结束!");
		System.out.println();
	}
}
