package com.gmy.blog.bean;

import java.util.List;

import com.gmy.blog.entity.Blog;
import com.gmy.blog.entity.Comment;

public class BlogBean {
	private Blog blog;
	private List<Comment> comments;
	
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
