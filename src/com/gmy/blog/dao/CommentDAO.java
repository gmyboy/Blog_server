package com.gmy.blog.dao;

import com.gmy.blog.entity.Comment;

public interface CommentDAO {
	//	发送评论
	public void sendComment(Comment comment);
	//	验证评论点赞
	public int checkSupport(String user_name, int comment_id);
	//	评论点赞
	public void support(String user_name, int comment_id);
	
}
