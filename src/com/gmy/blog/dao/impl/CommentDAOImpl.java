package com.gmy.blog.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gmy.blog.dao.CommentDAO;
import com.gmy.blog.entity.Comment;
import com.gmy.blog.util.DBUtils;

public class CommentDAOImpl implements CommentDAO{

	public void sendComment(Comment comment) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_comment(content,user_name,blog_id,"
				+ "comment_date) values(?,?,?,now())";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, comment.getContent());
			stmt.setString(2, comment.getUser_name());
			stmt.setInt(3, comment.getBlog_id());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}
	
	public int checkSupport(String user_name, int comment_id){
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_commentsupport where user_name = '" + user_name + 
				"' and comment_id = " + comment_id;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return 0;
	};

	public void support(String user_name, int comment_id){
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_commentsupport values(?,?)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user_name);
			stmt.setInt(2, comment_id);
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	};
}
