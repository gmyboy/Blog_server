package com.gmy.blog.entity;


public class Comment {
	private int id;
	private String content;
	private String user_name;
	private int blog_id;
	private int support;
	private String comment_date;
	
	public Comment(){
		
	}
	public Comment(String user_name, int blog_id, String content){
		this.user_name = user_name;
		this.blog_id = blog_id;
		this.content = content;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public int getSupport() {
		return support;
	}
	public void setSupport(int support) {
		this.support = support;
	}
	public String getComment_date() {
		return comment_date;
	}
	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}
	
}
