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

import com.gmy.blog.entity.Blog;
import com.gmy.blog.service.CommentService;
import com.gmy.blog.service.ForwardBlogService;
import com.gmy.blog.service.SendBlogService;
import com.gmy.blog.service.SupportService;
import com.gmy.blog.util.ConfigUtil;

public class BlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1220424784228346619L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/"),
				uri.lastIndexOf("."));

		System.out.println();
		System.out.println("�յ�����! BlogServlet-uri:" + uri);

		if (action.equals("/sendBlog")) {
			String user_name = null;
			String content = null;
			String comefrom = "";
			String location="";
			String photo = "";
			String music = "";
			String movie = "";
			System.out.println("�û�������΢��...");
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");
			System.out.println("�����ϴ�...");
			try {

				// ��ô����ļ���Ŀ������
				DiskFileItemFactory factory = new DiskFileItemFactory();
				// ��ȡ�ļ��ϴ���Ҫ�����·����img�ļ�������ڡ�
				String path_img = request.getSession().getServletContext()
						.getRealPath("imgs");
				File mDir_img = new File(path_img);
				if (!mDir_img.exists()) {
					mDir_img.mkdir();
				}
				String path_audio = request.getSession().getServletContext()
						.getRealPath("audios");
				File mDir = new File(path_audio);
				if (!mDir.exists()) {
					mDir.mkdir();
				}
				String path_video = request.getSession().getServletContext()
						.getRealPath("videos");
				File mDir_video = new File(path_video);
				if (!mDir_video.exists()) {
					mDir_video.mkdir();
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
						System.out.println(name);
						// �ļ���
						String filename = "";
						String mPath = "";
						// �����ȡ�ı���Ϣ����ͨ���ı���Ϣ����ͨ��ҳ�����ʽ���������ַ�����
						if (item.isFormField()) {
							// ��ȡ�û�����������ַ�����
							String value = item.getString();

							if (name.equals("user_name")) {
								user_name = value;
							} else if (name.equals("content")) {
								content = value;
							} else if (name.equals("comfrom")) {
								comefrom = value;
							}else if (name.equals("location")) {
								location=value;
							}
						} else {
							String named = String.valueOf(System.nanoTime());
							// ���������ǷǼ��ַ���������ͼƬ����Ƶ����Ƶ�ȶ������ļ���
							if (name.equals(ConfigUtil.FILE_IMG_TYPE)) {
								// ��ȡ·����
								filename = named + ".jpg";
								photo += filename + ";";
								request.setAttribute(name, filename);
								mPath = path_img;
							} else if (name.equals(ConfigUtil.FILE_AUDIO_TYPE)) {
								filename = named + ".mp3";
								music += filename + ";";
								request.setAttribute(name, filename);
								mPath = path_audio;
							} else if (name.equals(ConfigUtil.FILE_VEDIO_TYPE)) {
								filename = named + ".mp4";
								movie += filename + ";";
								request.setAttribute(name, filename);
								mPath = path_video;
							}
							/*
							 * �������ṩ�ķ���ֱ��д���ļ��С� item.write(new
							 * File(path,filename));
							 */
							// �յ�д�����յ��ļ��С�

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
				SendBlogService service = new SendBlogService();
				Blog blog = new Blog();
				blog.setContent(content);
				blog.setUser_name(user_name);
				blog.setComefrom(comefrom);
				blog.setPicture(photo);
				blog.setMovie(movie);
				blog.setMusic(music);
				blog.setLocation(location);
				int n = service.sendBlog(blog);
				String str = "{\"n\":\"" + n + "\"}";
				out.println(str);
				System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equals("/forwardBlog")) {
			String user_name = request.getParameter("user_name");
			String blog_id = request.getParameter("blog_id");

			System.out.println("�û�����ת��΢��...");
			System.out.println("user_name : " + user_name);
			System.out.println("blog_id : " + blog_id);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

			try {
				ForwardBlogService service = new ForwardBlogService();
				int n = service.forwardBlog(Integer.parseInt(blog_id),
						user_name, "");
				String str = "{\"n\":\"" + n + "\"}";
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equals("/comment")) {
			String user_name = request.getParameter("user_name");
			String blog_id = request.getParameter("blog_id");
			String content = request.getParameter("content");

			System.out.println("�û�����������...");
			System.out.println("user_name : " + user_name);
			System.out.println("blog_id : " + blog_id);
			System.out.println("content : " + content);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

			try {
				CommentService service = new CommentService();
				int n = service.sendComment(user_name,
						Integer.parseInt(blog_id), content);
				String str = "{\"n\":\"" + n + "\"}";
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equals("/supportBlog")) {
			String blog_id = request.getParameter("blog_id");
			String user_name = request.getParameter("user_name");
			System.out.println("�û�����΢������...");
			System.out.println("blog_id : " + blog_id);
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

			try {
				SupportService service = new SupportService();
				int n = service.supportBlog(user_name,
						Integer.parseInt(blog_id));
				String str = "{\"n\":\"" + n + "\"}";
				out.println(str);

				System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equals("/supportComment")) {
			String comment_id = request.getParameter("comment_id");
			String user_name = request.getParameter("user_name");
			System.out.println("�û��������۵���...");
			System.out.println("comment_id : " + comment_id);
			System.out.println("user_name : " + user_name);
			System.out.println("��ȡ�����ɹ�����ʼ������Ӧ...");

			try {
				SupportService service = new SupportService();
				int n = service.supportComment(user_name,
						Integer.parseInt(comment_id));
				String str = "{\"n\":\"" + n + "\"}";
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
