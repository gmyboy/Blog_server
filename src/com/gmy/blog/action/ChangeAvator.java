package com.gmy.blog.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.gmy.blog.entity.User;
import com.gmy.blog.service.ChangeAvatorService;

public class ChangeAvator extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ChangeAvator() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = null;
		String photo = null;
		try {
			// ��ô����ļ���Ŀ������
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// ��ȡ�ļ��ϴ���Ҫ�����·����img�ļ�������ڡ�
			String path = request.getSession().getServletContext()
					.getRealPath("avators");
			File mDir = new File(path);
			if (!mDir.exists()) {
				mDir.mkdir();
			}
			// ������ʱ����ļ��Ĵ洢�ң�����洢�ҿ��Ժ����մ洢�ļ����ļ��в�ͬ����Ϊ���ļ��ܴ�Ļ���ռ�ù����ڴ��������ô洢�ҡ�
			// factory.setRepository(new File(path, "img_" + 0 + ".jpg"));
			// ���û���Ĵ�С�����ϴ��ļ���������������ʱ���ͷŵ���ʱ�洢�ҡ�
			factory.setSizeThreshold(1024 * 1024);
			// �ϴ���������
			ServletFileUpload upload = new ServletFileUpload(factory);

			try {
				// ���� parseRequest��request������ ����ϴ��ļ� FileItem �ļ���list
				// ��ʵ�ֶ��ļ��ϴ���
				@SuppressWarnings("unchecked")
				List<FileItem> list = (List<FileItem>) upload
						.parseRequest(request);
				for (FileItem item : list) {
					// ��ȡ���������֡�
					String name = item.getFieldName();
					// �����ȡ�ı���Ϣ����ͨ���ı���Ϣ����ͨ��ҳ�����ʽ���������ַ�����
					if (item.isFormField()) {
						// ��ȡ�û�����������ַ�����
						username = item.getString();
					}
					// ���������ǷǼ��ַ���������ͼƬ����Ƶ����Ƶ�ȶ������ļ���
					else {
						// ��ȡ·����
						String value = item.getName();
						// ȡ�����һ����б�ܡ�
						int start = value.lastIndexOf("\\");
						// ��ȡ�ϴ��ļ��� �ַ������֡�+1��ȥ����б�ܡ�
						String filename = value.substring(start + 1);
						photo = filename;
						request.setAttribute(name, filename);
						/*
						 * �������ṩ�ķ���ֱ��д���ļ��С� item.write(new File(path,filename));
						 */
						// �յ�д�����յ��ļ��С�
						String mPath = path + "/" + username;
						File dir = new File(mPath);
						if (!dir.exists()) {
							dir.mkdir();
						}
						File file = new File(mPath, filename);
						OutputStream fileout = new FileOutputStream(file);
						InputStream in = item.getInputStream();
						int length = 0;
						byte[] buf = new byte[1024];
						System.out.println("��ȡ�ļ�����������:" + item.getSize());
						while ((length = in.read(buf)) != -1) {
							fileout.write(buf, 0, length);
						}
						in.close();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ChangeAvatorService service = new ChangeAvatorService();
			User user = new User();
			user.setUsername(username);
			user.setPhoto(photo);
			int n = service.change(user);
			String str = "{\"n\":\"" + n + "\"}";
			out.println(str);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
