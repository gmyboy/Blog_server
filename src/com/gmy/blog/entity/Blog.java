package com.gmy.blog.entity;

public class Blog {
	private int id;
	private String content;
	private String picture;
	private String music;
	private String movie;
	private String user_name;
	private String blog_date;
	private int support;
	private int forward_id;
	private String comefrom;
	private String location;
	private String movie_length;
	public Blog() {

	}

	public String getMovie_length() {
		return movie_length;
	}

	public void setMovie_length(String movie_length) {
		this.movie_length = movie_length;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Blog(String user_name, String content, String comefrom) {
		this.content = content;
		this.user_name = user_name;
		this.comefrom = comefrom;
	}

	public String getComefrom() {
		return comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getBlog_date() {
		return blog_date;
	}

	public void setBlog_date(String blog_date) {
		this.blog_date = blog_date;
	}

	public int getSupport() {
		return support;
	}

	public void setSupport(int support) {
		this.support = support;
	}

	public int getForward_id() {
		return forward_id;
	}

	public void setForward_id(int forward_id) {
		this.forward_id = forward_id;
	}

}
