package com.gmy.blog.bean;

import com.gmy.blog.entity.Blog;
import com.gmy.blog.entity.User;

public class SimpleUserBean {
	private User user;
	private Blog blog;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	} 
}
