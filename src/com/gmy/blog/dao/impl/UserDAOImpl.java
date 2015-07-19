package com.gmy.blog.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.entity.User;
import com.gmy.blog.util.DBUtils;

public class UserDAOImpl implements UserDAO{
	
	public void addUser(User user) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_user(username,pwd,email,"
				+ "regist_date) values(?,?,?,now())";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPwd());
			stmt.setString(3, user.getEmail());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}

	public String findPwdByName(String username) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select pwd from pocketblog_user where "
				+ "username = '" + username + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				return rs.getString("pwd");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("");
		} finally {
			DBUtils.close(conn);
		}
		return null;
	}

	public void changePwd(String username, String pwd) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		String sql = "update pocketblog_user set pwd = '"+ pwd +
				"'where username = '" + username + "'";
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}

	public void perfectUser(User user) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "update pocketblog_user set sex=?,location=?,intro=?,"
				+ "hobby=?,birthday=? where username=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getSex());
			stmt.setString(2, user.getLocation());
			stmt.setString(3, user.getIntro());
			stmt.setString(4, user.getHobby());
			stmt.setDate(5, Date.valueOf(user.getBirthday()));
			stmt.setString(6, user.getUsername());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		
	}

	public void attention(int user_id, int attention_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		String sql = "insert into pocketblog_attention(user_id,attention_id) "
				+ "values(" + user_id + ","+ attention_id + ")";
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}
	
	public void deleteAttention(int user_id, int attention_id){
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		String sql = "delete from pocketblog_attention where user_id = " +
				user_id + " and attention_id = " + attention_id;
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	};

	public int checkAttention(int user_id, int attention_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_attention where user_id ="
				+ user_id +" and attention_id = " + attention_id;
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
	}

	// ’≤ÿŒ¢≤©
	
	public int checkCollectBlog(String user_name, int blog_id){
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_collect where user_name ='"+ user_name + 
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
	
	public void addCollectBlog(String user_name, int blog_id){
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into pocketblog_collect values(?,?,now())";
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
	
	public void deleteCollectBlog(String user_name, int blog_id){
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		String sql = "delete from pocketblog_collect where user_name = '" + user_name +
				"' and blog_id = " + blog_id;
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	};

	public List<Integer> getCollectBlogId(String user_name, int page){
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_collect where user_name = ?"
				+ " order by collect_date desc limit ?,10";
		List<Integer> list = new ArrayList<Integer>();
		int start = ( page - 1 ) * 10;
		int num;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user_name);
			stmt.setInt(2, start);
			rs = stmt.executeQuery();
			while(rs.next()){
				num = rs.getInt("blog_id");
				list.add(num);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	};
	
	public int getCollectNum(String user_name){
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select count(*) num from pocketblog_collect where user_name = '" + user_name + "'";
		int num = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				num = rs.getInt("num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return num;
	};
	
	public void changeAvator(User user) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		String sql = "update pocketblog_user set photo=? where username=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getPhoto());
			stmt.setString(2, user.getUsername());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
	}

}
