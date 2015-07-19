package com.gmy.blog.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gmy.blog.dao.BeanDAO;
import com.gmy.blog.entity.Blog;
import com.gmy.blog.entity.Comment;
import com.gmy.blog.entity.Topic;
import com.gmy.blog.entity.User;
import com.gmy.blog.util.DBUtils;

public class BeanDAOImpl implements BeanDAO {

	/** 获取微博信息 */
	public List<Blog> getBlogBean(String user_name, int page) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pocketblog_blog a left JOIN (SELECT blog_id,COUNT(*) support "
				+ "FROM pocketblog_blogsupport GROUP BY blog_id) b ON a.id = b.blog_id "
				+ "where user_name = '"
				+ user_name
				+ "' order by blog_date desc limit ?,10";
		List<Blog> list = new ArrayList<Blog>();
		int start = (page - 1) * 10;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Blog blog = new Blog();
				blog.setId(rs.getInt("id"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setUser_name(rs.getString("user_name"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getTimestamp("blog_date").toString());
				blog.setComefrom(rs.getString("comefrom"));
				blog.setSupport(rs.getInt("support"));
				blog.setLocation(rs.getString("location"));
				blog.setMovie_length(rs.getString("movie_length"));
				list.add(blog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	}

	public List<Blog> showBlogBean(String attention_name, int page) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pocketblog_blog a left JOIN (SELECT blog_id,COUNT(*) support "
				+ "FROM pocketblog_blogsupport GROUP BY blog_id) b ON a.id = b.blog_id "
				+ "where  user_name in ("
				+ attention_name
				+ ")  order by blog_date desc limit ?,10";
		List<Blog> list = new ArrayList<Blog>();
		int start = (page - 1) * 10;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Blog blog = new Blog();
				blog.setId(rs.getInt("id"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setUser_name(rs.getString("user_name"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getTimestamp("blog_date").toString());
				blog.setComefrom(rs.getString("comefrom"));
				blog.setSupport(rs.getInt("support"));
				blog.setLocation(rs.getString("location"));
				blog.setMovie_length(rs.getString("movie_length"));
				list.add(blog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	}

	public List<Blog> showHotBlogBean(int page) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pocketblog_blog a left JOIN (SELECT blog_id,COUNT(*) support "
				+ "FROM pocketblog_blogsupport GROUP BY blog_id) b ON a.id = b.blog_id "
				+ " order by support desc limit ?,10";
		List<Blog> list = new ArrayList<Blog>();
		int start = (page - 1) * 10;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Blog blog = new Blog();
				blog.setId(rs.getInt("id"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setUser_name(rs.getString("user_name"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getTimestamp("blog_date").toString());
				blog.setComefrom(rs.getString("comefrom"));
				blog.setSupport(rs.getInt("support"));
				blog.setLocation(rs.getString("location"));
				blog.setMovie_length(rs.getString("movie_length"));
				list.add(blog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	};

	public List<Comment> getComment(int blog_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pocketblog_comment a left JOIN (SELECT comment_id,COUNT(*) support "
				+ "FROM pocketblog_commentsupport GROUP BY comment_id) b ON a.id = b.comment_id "
				+ "WHERE blog_id = " + blog_id + " ORDER BY comment_date DESC";
		List<Comment> list = new ArrayList<Comment>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Comment comment = new Comment();
				comment.setId(rs.getInt("id"));
				comment.setBlog_id(rs.getInt("blog_id"));
				comment.setContent(rs.getString("content"));
				comment.setUser_name(rs.getString("user_name"));
				comment.setSupport(rs.getInt("support"));
				comment.setComment_date(rs.getTimestamp("comment_date")
						.toString());
				list.add(comment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	}

	public Blog getLastBlog(String user_name) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_blog where user_name = '"
				+ user_name + "' order by blog_date desc limit 0,1";
		Blog blog = new Blog();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				blog.setId(rs.getInt("id"));
				blog.setUser_name(rs.getString("user_name"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setComefrom(rs.getString("comefrom"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getTimestamp("blog_date").toString());
				blog.setSupport(rs.getInt("support"));
				blog.setLocation(rs.getString("location"));
				blog.setMovie_length(rs.getString("movie_length"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return blog;
	};

	/** 获取用户信息 */

	public User getUserByName(String user_name) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_user where username = '"
				+ user_name + "'";
		User user = new User();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setSex(rs.getString("sex"));
				user.setEmail(rs.getString("email"));
				user.setPhoto(rs.getString("photo"));
				user.setIntro(rs.getString("intro"));
				user.setHobby(rs.getString("hobby"));
				if (rs.getDate("birthday") != null) {
					user.setBirthday(rs.getDate("birthday").toString());
				}
				user.setRegist_date(rs.getDate("regist_date").toString());
				user.setLocation(rs.getString("location"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return user;
	}

	public int getUserIdByName(String user_name) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_user where username = '"
				+ user_name + "'";
		int user_id = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user_id = rs.getInt("id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return user_id;
	};

	public String getUserNameById(int user_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_user where id = " + user_id;
		String user_name = "";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user_name = rs.getString("username");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return user_name;
	};

	public List<Integer> showHotUser_id(int page) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select attention_id,count(*) from pocketblog_attention "
				+ "group by attention_id limit ?,10";
		List<Integer> list = new ArrayList<Integer>();
		int start = (page - 1) * 10;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(rs.getInt("attention_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	};

	public int getAttentionNum(int user_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select count(*) num from pocketblog_attention where user_id = "
				+ user_id;
		int attentionNum = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				attentionNum = rs.getInt("num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return attentionNum;
	}

	public int getFansNum(int user_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select count(*) num from pocketblog_attention where attention_id = "
				+ user_id;
		int fansNum = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				fansNum = rs.getInt("num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return fansNum;
	}

	public List<Integer> getAttention_id(int user_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_attention where user_id = "
				+ user_id;
		List<Integer> list = new ArrayList<Integer>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(rs.getInt("attention_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	}

	public List<Integer> getFans_id(int user_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_attention where attention_id = "
				+ user_id;
		List<Integer> list = new ArrayList<Integer>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(rs.getInt("user_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	}

	public User getSimpleUser(String user_name) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_user where username = '"
				+ user_name + "'";
		User user = new User();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setSex(rs.getString("sex"));
				user.setIntro(rs.getString("intro"));
				user.setPhoto(rs.getString("photo"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return user;
	}

	/** 检索 */
	public List<User> searchUser(String user_name, int page) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_user where username like '%"
				+ user_name + "%'" + " limit ?,10";
		List<User> list = new ArrayList<User>();
		int start = (page - 1) * 10;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			rs = stmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setSex(rs.getString("sex"));
				user.setPhoto(rs.getString("photo"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	}

	public List<Blog> searchBlog(String blog_content, int page) {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from pocketblog_blog where content " + "like '%"
				+ blog_content + "%' limit ?,10";
		List<Blog> list = new ArrayList<Blog>();
		int start = (page - 1) * 10;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Blog blog = new Blog();
				blog.setId(rs.getInt("id"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setUser_name(rs.getString("user_name"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getTimestamp("blog_date").toString());
				blog.setComefrom(rs.getString("comefrom"));
				blog.setLocation(rs.getString("location"));
				blog.setMovie_length(rs.getString("movie_length"));
				list.add(blog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
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
			if (rs.next()) {
				blog.setId(rs.getInt("id"));
				blog.setContent(rs.getString("content"));
				blog.setPicture(rs.getString("picture"));
				blog.setMusic(rs.getString("music"));
				blog.setMovie(rs.getString("movie"));
				blog.setUser_name(rs.getString("user_name"));
				blog.setForward_id(rs.getInt("forward_id"));
				blog.setBlog_date(rs.getTimestamp("blog_date").toString());
				blog.setComefrom(rs.getString("comefrom"));
				blog.setLocation(rs.getString("location"));
				blog.setMovie_length(rs.getString("movie_length"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return blog;
	}

	public int getBlogSupportNum(int blog_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		String sql = "select count(*) num from pocketblog_commentsupport where id = "
				+ blog_id;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				return rs.getInt("num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return 0;
	};

	public int getCommentSupportNum(int comment_id) {
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		String sql = "select count(*) num from pocketblog_commentsupport where id = "
				+ comment_id;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				return rs.getInt("num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return 0;
	}

	@Override
	public List<Topic> getTopics() {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pocketblog_topic  ";
		List<Topic> list = new ArrayList<Topic>();
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Topic topic = new Topic();
				topic.setId(rs.getInt("id"));
				topic.setName(rs.getString("name"));
				topic.setType(rs.getString("type"));
				topic.setPic(rs.getString("pic"));
				topic.setContent(rs.getString("content"));
				topic.setRead(rs.getInt("read"));
				topic.setHost(rs.getString("host"));
				topic.setDiscussion(rs.getInt("discussion"));
				topic.setFans(rs.getInt("fans"));

				list.add(topic);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn);
		}
		return list;
	};
}
