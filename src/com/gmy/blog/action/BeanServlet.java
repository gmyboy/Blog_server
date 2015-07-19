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
		System.out.println("�յ�����! BeanServlet-uri:" + uri);

		/** ��ȡ�û�΢���б�(��ҳ10��) */
		if (action.equals("/getBlogBean")) {
			String user_name = request.getParameter("user_name");
			String page = request.getParameter("page");

			System.out.println("�û������ȡ����΢���б�-��" + page + "ҳ...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�û�����΢���б�(��ҳ10��) */
		else if (action.equals("/showBlogBean")) {
			String user_name = request.getParameter("user_name");
			String page = request.getParameter("page");
			System.out.println("�û������ȡ  ����΢���б�  -  ��" + page + "ҳ...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ����΢���б�(��ҳ10��) */
		else if (action.equals("/showHotBlogBean")) {
			String page = request.getParameter("page");

			System.out.println("�û������ȡ  Hot΢���б�  -  ��" + page + "ҳ...");
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�û��ղ�΢�������� */
		else if (action.equals("/getCollectNum")) {
			String user_name = request.getParameter("user_name");

			System.out.println("�û������ȡ�ղ���...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�û��ղص�ȫ��΢�� */
		else if (action.equals("/showCollectBlogBean")) {
			String user_name = request.getParameter("user_name");
			String page = request.getParameter("page");

			System.out.println("�û������ȡ  �ղ�΢���б�  -  ��" + page + "ҳ...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�û���ϸ��Ϣ�б� */
		else if (action.equals("/getUserBean")) {
			String user_name = request.getParameter("user_name");

			System.out.println("�û������ȡ  �����û�  ��ϸ��Ϣ...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�����û��б�(��ҳ10��) */
		else if (action.equals("/showHotUserBean")) {
			String page = request.getParameter("page");

			System.out.println("�û������ȡ  �����û��б�  ����Ϣ...");
			System.out.println("page : " + page);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�û���ע���ѵ��б�����Ϣ */
		else if (action.equals("/getAttentionUserBean")) {
			String user_name = request.getParameter("user_name");

			System.out.println("�û������ȡ  ��ע�����б�  ����Ϣ...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ��ȡ�û���ע��˿���б�����Ϣ */
		else if (action.equals("/getFansUserBean")) {
			String user_name = request.getParameter("user_name");

			System.out.println("�û������ȡ  ��˿�б�  ����Ϣ...");
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		/** ���� */
		// ��΢�����ݲ���΢��(ģ������)
		else if (action.equals("/searchBlogBean")) {
			String keyword = request.getParameter("keyword");
			String page = request.getParameter("page");

			System.out.println("�û��������΢��  keyword:" + keyword + " �� " + page
					+ "ҳ...");
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		// �����û��������û�(ģ������)
		else if (action.equals("/searchUserBean")) {
			String keyword = request.getParameter("keyword");
			String page = request.getParameter("page");

			System.out.println("�û���������û���Ϣ  keyword:" + keyword + " �� " + page
					+ "ҳ...");
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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
		/** ��ȡ���Ż��� */
		else if (action.equals("/getTopics")) {

			System.out.println("�û������ȡ  �����б� ");
			System.out.println("��ʼ������Ӧ...");

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
		// ͨ��΢��id��ȡ΢����ϸ��Ϣ
		else if (action.equals("/getBlogBeanById")) {
			String blog_id = request.getParameter("blog_id");

			System.out.println("�û������ȡ����΢����Ϣ...");
			System.out.println("blog_id : " + blog_id);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

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

		System.out.println("Servlet����!");
		System.out.println();
	}
}
