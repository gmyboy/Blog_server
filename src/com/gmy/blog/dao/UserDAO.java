package com.gmy.blog.dao;

import java.util.List;

import com.gmy.blog.entity.User;

public interface UserDAO {
	/**	用户信息操作	*/
	//	添加用户
	public void addUser(User user);
	//	用户名密码验证
	public String findPwdByName(String user_name);
	//	修改密码
	public void changePwd(String username, String pwd);
	//	完善用户信息
	public void perfectUser(User user);
	
	/**	用户功能操作	*/
	//	验证添加关注
	public int checkAttention(int user_id, int attention_id);
	//	添加关注
	public void attention(int user_id, int attention_id);
	//	删除关注
	public void deleteAttention(int user_id, int attention_id);
	//	验证收藏微博
	public int checkCollectBlog(String user_name, int blog_id);
	//	收藏微博
	public void addCollectBlog(String user_name, int blog_id);
	//	删除收藏
	public void deleteCollectBlog(String user_name, int blog_id);
	
	/**	获取用户收藏微博的数量	*/
	public int getCollectNum(String user_name);
	/**	获取用户收藏的全部微博	*/
	public List<Integer> getCollectBlogId(String user_name, int page);
	/**	设置用户头像	*/
	public void changeAvator(User user);
	
}
