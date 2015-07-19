package com.gmy.blog.dao;

import com.gmy.blog.entity.Blog;

public interface BlogDAO {
	//	发送微博
	public void sendBlog(Blog blog);
	//	获取单个微博信息
	public Blog getBlogById(int blog_id);
	//	转发微博
	public void forwardBlog(Blog blog);
	//	验证微博点赞
	public int checkSupport(String user_name, int blog_id);
	//	微博点赞
	public void support(String user_name, int blog_id);
}
