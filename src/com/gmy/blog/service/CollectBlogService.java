package com.gmy.blog.service;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.util.DAOFactory;

public class CollectBlogService {
	UserDAO dao = (UserDAO)DAOFactory.getInstance("UserDAO");
	
	public int addCollectBlog(String user_name, int blog_id){
		try{
			if(dao.checkCollectBlog(user_name, blog_id)==1){
				return 1;
			}else{
				dao.addCollectBlog(user_name, blog_id);
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
	
	public int deleteCollectBlog(String user_name, int blog_id){
		try{
			if(dao.checkCollectBlog(user_name, blog_id)==0){
				return 1;
			}else{
				dao.deleteCollectBlog(user_name, blog_id);
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
	
}
