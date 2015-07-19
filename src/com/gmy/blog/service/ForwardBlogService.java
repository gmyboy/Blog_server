package com.gmy.blog.service;

import com.gmy.blog.dao.BlogDAO;
import com.gmy.blog.entity.Blog;
import com.gmy.blog.util.DAOFactory;

public class ForwardBlogService {
	BlogDAO dao = (BlogDAO)DAOFactory.getInstance("BlogDAO");
	
	public int forwardBlog(int blog_id,String user_name,String comefrom){
		try{
			Blog blog = dao.getBlogById(blog_id);
			if(blog.getForward_id()==0){
				blog.setUser_name(user_name);
				blog.setForward_id(blog.getId());
				blog.setComefrom(comefrom);
				dao.forwardBlog(blog);
			}else{
				blog = dao.getBlogById(blog.getForward_id());
				blog.setUser_name(user_name);
				blog.setForward_id(blog.getId());
				blog.setComefrom(comefrom);
				dao.forwardBlog(blog);
			}
			return 0;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 1;
	}
}
