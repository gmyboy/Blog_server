package com.gmy.blog.service;

import com.gmy.blog.dao.CommentDAO;
import com.gmy.blog.entity.Comment;
import com.gmy.blog.util.DAOFactory;

public class CommentService {
	CommentDAO dao = (CommentDAO)DAOFactory.getInstance("CommentDAO");
	
	public int sendComment(String user_name, int blog_id, String content){
		try{
			Comment comment = new Comment(user_name, blog_id, content);
			dao.sendComment(comment);
			return 0;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 1;
	}
}
