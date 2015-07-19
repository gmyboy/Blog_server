package com.gmy.blog.dao;

import java.util.List;

import com.gmy.blog.entity.Blog;
import com.gmy.blog.entity.Comment;
import com.gmy.blog.entity.Topic;
import com.gmy.blog.entity.User;

public interface BeanDAO {

	/** 获取微博信息 */
	// 获取用户微博列表(单页10条)
	public List<Blog> getBlogBean(String user_name, int page);

	// 获取用户好友微博列表(单页10条)
	public List<Blog> showBlogBean(String attention_id, int page);

	// 获取热门微博列表(单页10条)
	public List<Blog> showHotBlogBean(int page);

	// 获取某一微博的评论
	public List<Comment> getComment(int blog_id);

	// 获取某用户最近的一条微博
	public Blog getLastBlog(String user_name);

	/** 获取用户信息 */
	// 获取某用户详细信息
	public User getUserByName(String user_name);

	// 获取某用户简单信息
	public User getSimpleUser(String user_name);

	// 获取热门用户列表(单页10条)
	public List<Integer> showHotUser_id(int page);

	// 获取某用户关注数量
	public int getAttentionNum(int user_id);

	// 获取某用户粉丝数量
	public int getFansNum(int user_id);

	// 获取某用户关注好友id列表
	public List<Integer> getAttention_id(int user_id);

	// 获取某用户粉丝id列表
	public List<Integer> getFans_id(int user_id);

	/** 检索 */
	// 关键字检索用户
	public List<User> searchUser(String user_name, int page);

	// 关键字检索微博
	public List<Blog> searchBlog(String blog_content, int page);

	/** 工具方法 */
	// 用username获取用户id
	public int getUserIdByName(String user_name);

	// 用用户id获取username
	public String getUserNameById(int user_id);

	// 用微博id获取微博信息
	public Blog getBlogById(int blog_id);

	// 获取微博赞的数量
	public int getBlogSupportNum(int blog_id);

	// 获取评论赞的数量
	public int getCommentSupportNum(int comment_id);

	// 获取当前最流行的主题
	public List<Topic> getTopics();
}
