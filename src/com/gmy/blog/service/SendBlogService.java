package com.gmy.blog.service;

import com.gmy.blog.dao.BlogDAO;
import com.gmy.blog.entity.Blog;
import com.gmy.blog.util.DAOFactory;

public class SendBlogService {
	BlogDAO dao = (BlogDAO)DAOFactory.getInstance("BlogDAO");
	
	public int sendBlog(Blog blog){
		try{
			dao.sendBlog(blog);
			return 0;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 1;
	}
}
