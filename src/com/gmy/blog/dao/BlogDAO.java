package com.gmy.blog.dao;

import com.gmy.blog.entity.Blog;

public interface BlogDAO {
	//	����΢��
	public void sendBlog(Blog blog);
	//	��ȡ����΢����Ϣ
	public Blog getBlogById(int blog_id);
	//	ת��΢��
	public void forwardBlog(Blog blog);
	//	��֤΢������
	public int checkSupport(String user_name, int blog_id);
	//	΢������
	public void support(String user_name, int blog_id);
}
