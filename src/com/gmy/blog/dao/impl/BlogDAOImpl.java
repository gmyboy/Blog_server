package com.gmy.blog.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gmy.blog.dao.BlogDAO;
import com.gmy.blog.entity.Blog;
import com.gmy.blog.util.DBUtils;

public class BlogDAOImpl implements BlogDAO{

	public void sendBlog(Blog blog) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_blog(content,picture,music,movie,"
				+ "user_name,forward_id,comefrom,location,blog_date) "
				+ "values(?,?,?,?,?,?,?,?,now())";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, blog.getContent());
			stmt.setString(2, blog.getPicture());
			stmt.setString(3, blog.getMusic());
			stmt.setString(4, blog.getMovie());
			stmt.setString(5, blog.getUser_name());
			stmt.setInt(6, 0);
			stmt.setString(7, blog.getComefrom());
			stmt.setString(8, blog.getLocation());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}

	public Blog getBlogById(int blog_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_blog where id = " + blog_id;
		Blog blog = new Blog();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				blog.setId(rs.getInt("id"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getDate("blog_date").toString());
				blog.setUser_name(rs.getString("user_name"));
				blog.setComefrom(rs.getString("comefrom"));
				blog.setSupport(rs.getInt("support"));
				blog.setLocation(rs.getString("location"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return blog;
	}
	
	public void forwardBlog(Blog blog) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_blog(content,picture,music,movie,"
				+ "user_name,forward_id,comefrom,location,blog_date) "
				+ "values(?,?,?,?,?,?,?,?,now())";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, blog.getContent());
			stmt.setString(2, blog.getPicture());
			stmt.setString(3, blog.getMusic());
			stmt.setString(4, blog.getMovie());
			stmt.setString(5, blog.getUser_name());
			stmt.setInt(6, blog.getForward_id());
			stmt.setString(7, blog.getComefrom());
			stmt.setString(8, blog.getLocation());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}
	
	public int checkSupport(String user_name, int blog_id){
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_blogsupport where user_name = '" + user_name + 
				"' and blog_id = " + blog_id;
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
	
	public void support(String user_name, int blog_id){
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_blogsupport values(?,?)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user_name);
			stmt.setInt(2, blog_id);
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	};

}
