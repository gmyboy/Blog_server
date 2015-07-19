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
		System.out.println("收到请求! BlogServlet-uri:" + uri);

		if (action.equals("/sendBlog")) {
			String user_name = null;
			String content = null;
			String comefrom = "";
			String location="";
			String photo = "";
			String music = "";
			String movie = "";
			System.out.println("用户请求发送微博...");
			System.out.println("获取参数成功！开始返回响应...");
			System.out.println("正在上传...");
			try {

				// 获得磁盘文件条目工厂。
				DiskFileItemFactory factory = new DiskFileItemFactory();
				// 获取文件上传需要保存的路径，img文件夹需存在。
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
				// 设置暂时存放文件的存储室，这个存储室可以和最终存储文件的文件夹不同。因为当文件很大的话会占用过多内存所以设置存储室。
				// factory.setRepository(new File(path, "img_" + 0 + ".jpg"));
				// 设置缓存的大小，当上传文件的容量超过缓存时，就放到暂时存储室。
				factory.setSizeThreshold(1024 * 1024);
				// 上传处理工具类
				ServletFileUpload upload = new ServletFileUpload(factory);

				try {
					// 调用 parseRequest（request）方法 获得上传文件 FileItem 的集合list
					// 可实现多文件上传。
					@SuppressWarnings("unchecked")
					List<FileItem> list = (List<FileItem>) upload
							.parseRequest(request);
					for (FileItem item : list) {
						// 获取表单属性名字。
						String name = item.getFieldName();
						System.out.println(name);
						// 文件名
						String filename = "";
						String mPath = "";
						// 如果获取的表单信息是普通的文本信息。即通过页面表单形式传递来的字符串。
						if (item.isFormField()) {
							// 获取用户具体输入的字符串，
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
							// 如果传入的是非简单字符串，而是图片，音频，视频等二进制文件。
							if (name.equals(ConfigUtil.FILE_IMG_TYPE)) {
								// 获取路径名
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
							 * 第三方提供的方法直接写到文件中。 item.write(new
							 * File(path,filename));
							 */
							// 收到写到接收的文件中。

							File dir = new File(mPath);
							if (!dir.exists()) {
								dir.mkdir();
							}
							File file = new File(mPath, filename);
							OutputStream fileout = new FileOutputStream(file);
							InputStream in = item.getInputStream();
							int length = 0;
							byte[] buf = new byte[1024];
							System.out.println("获取文件总量的容量:" + item.getSize());
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

			System.out.println("用户请求转发微博...");
			System.out.println("user_name : " + user_name);
			System.out.println("blog_id : " + blog_id);
			System.out.println("获取参数成功！开始返回响应...");

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

			System.out.println("用户请求发送评论...");
			System.out.println("user_name : " + user_name);
			System.out.println("blog_id : " + blog_id);
			System.out.println("content : " + content);
			System.out.println("获取参数成功！开始返回响应...");

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
			System.out.println("用户请求微博点赞...");
			System.out.println("blog_id : " + blog_id);
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

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
			System.out.println("用户请求评论点赞...");
			System.out.println("comment_id : " + comment_id);
			System.out.println("user_name : " + user_name);
			System.out.println("获取参数成功！开始返回响应...");

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
		System.out.println("Servlet结束!");
		System.out.println();
	}
}
