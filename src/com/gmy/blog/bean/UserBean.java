package com.gmy.blog.bean;

import com.gmy.blog.entity.User;

public class UserBean {
	private User user;
	private int fans;
	private int attention;
	private BlogBean blogbean;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public int getAttention() {
		return attention;
	}
	public void setAttention(int attention) {
		this.attention = attention;
	}
	public BlogBean getBlogbean() {
		return blogbean;
	}
	public void setBlogbean(BlogBean blogbean) {
		this.blogbean = blogbean;
	}
}
