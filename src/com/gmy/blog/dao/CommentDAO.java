package com.gmy.blog.dao;

import com.gmy.blog.entity.Comment;

public interface CommentDAO {
	//	��������
	public void sendComment(Comment comment);
	//	��֤���۵���
	public int checkSupport(String user_name, int comment_id);
	//	���۵���
	public void support(String user_name, int comment_id);
	
}
