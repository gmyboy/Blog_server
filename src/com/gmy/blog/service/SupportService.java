package com.gmy.blog.service;

import com.gmy.blog.dao.BlogDAO;
import com.gmy.blog.dao.CommentDAO;
import com.gmy.blog.util.DAOFactory;

public class SupportService {
	BlogDAO blogdao = (BlogDAO)DAOFactory.getInstance("BlogDAO");
	CommentDAO commentdao = (CommentDAO)DAOFactory.getInstance("CommentDAO");
	
	public int supportBlog(String user_name, int blog_id){
		try{
			if(blogdao.checkSupport(user_name, blog_id)==1){
				return 1;
			}else{
				blogdao.support(user_name, blog_id);
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
	
	public int supportComment(String user_name, int comment_id){
		try{
			if(commentdao.checkSupport(user_name, comment_id)==1){
				return 1;
			}else{
				commentdao.support(user_name, comment_id);
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
}
