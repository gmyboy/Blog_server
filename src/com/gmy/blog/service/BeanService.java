package com.gmy.blog.service;

import java.util.ArrayList;
import java.util.List;

import com.gmy.blog.bean.BlogBean;
import com.gmy.blog.bean.UserBean;
import com.gmy.blog.dao.BeanDAO;
import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.entity.Blog;
import com.gmy.blog.entity.Comment;
import com.gmy.blog.entity.Topic;
import com.gmy.blog.entity.User;
import com.gmy.blog.util.DAOFactory;

public class BeanService {
		
	BeanDAO beandao = (BeanDAO)DAOFactory.getInstance("BeanDAO");
	
	/**	获取微博列表	*/
	public List<BlogBean> getBlogBean(String user_name, int page){
		List<BlogBean> blogbeans = new ArrayList<BlogBean>();
		try{
			List<Blog> list = beandao.getBlogBean(user_name, page);
			for(Blog blog : list){
				BlogBean blogbean = new BlogBean();
				List<Comment> comments = beandao.getComment(blog.getId());				
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				blogbeans.add(blogbean);
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return blogbeans;
	}
	
	public List<BlogBean> showBlogBean(String user_name, int page){
		List<BlogBean> blogbeans = new ArrayList<BlogBean>();
		try{
			int user_id = beandao.getUserIdByName(user_name);
			List<Integer> attention_id = beandao.getAttention_id(user_id);
			StringBuffer attention_name = new StringBuffer();
			attention_name.append("\'-1\',");
			for(int i : attention_id){
				String s = "\'" + beandao.getUserNameById(i) + "\',";
				attention_name.append(s);
			}
			int index = attention_name.lastIndexOf(",");
			attention_name.deleteCharAt(index);
			List<Blog> list = beandao.showBlogBean(attention_name.toString(), page);
			for(Blog blog : list){
				BlogBean blogbean = new BlogBean();
				List<Comment> comments = beandao.getComment(blog.getId());				
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				blogbeans.add(blogbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return blogbeans;
	}
	
	public List<BlogBean> showHotBlogBean(int page){
		List<BlogBean> blogbeans = new ArrayList<BlogBean>();
		try{
			List<Blog> list = beandao.showHotBlogBean(page);
			for(Blog blog : list){
				BlogBean blogbean = new BlogBean();
				List<Comment> comments = beandao.getComment(blog.getId());				
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				blogbeans.add(blogbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return blogbeans;
	}
	
	public int getCollect_num(String user_name){
		UserDAO userdao = (UserDAO)DAOFactory.getInstance("UserDAO");
		int num = 0;
		try{
			num = userdao.getCollectNum(user_name);
		}catch(Exception e){
			e.printStackTrace();
		}
		return num;
	}
	
	public List<BlogBean> showCollectBlogBean(String user_name, int page){
		UserDAO userdao = (UserDAO)DAOFactory.getInstance("UserDAO");
		List<BlogBean> list = new ArrayList<BlogBean>();
		BlogBean blogbean = new BlogBean();
		try{
			for(int blog_id : userdao.getCollectBlogId(user_name, page)){
				blogbean.setBlog(beandao.getBlogById(blog_id));
				blogbean.setComments(beandao.getComment(blog_id));
				list.add(blogbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	/**	获取用户信息列表	*/
	public UserBean getUserBean(String user_name){
		UserBean userbean = new UserBean();
		try{
			int user_id = beandao.getUserIdByName(user_name);
			userbean.setUser(beandao.getUserByName(user_name));
			userbean.setAttention(beandao.getAttentionNum(user_id));
			userbean.setFans(beandao.getFansNum(user_id));
		}catch(Exception e){
			e.printStackTrace();
		}
		return userbean;
	}
	
	public List<UserBean> showHotUserBean(int page){
		List<UserBean> userbeans = new ArrayList<UserBean>();
		try{
			List<Integer> list = beandao.showHotUser_id(page);
			for(int hotUser_id : list){
				UserBean userbean = new UserBean();
				String hotUser_name = beandao.getUserNameById(hotUser_id);
				userbean.setUser(beandao.getSimpleUser(hotUser_name));
				userbean.setAttention(beandao.getAttentionNum(hotUser_id));
				userbean.setFans(beandao.getFansNum(hotUser_id));
				
				BlogBean blogbean = new BlogBean();
				Blog blog = beandao.getLastBlog(hotUser_name);
				List<Comment> comments = beandao.getComment(blog.getId());
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				
				userbean.setBlogbean(blogbean);
				userbeans.add(userbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userbeans;
	}
	
	public List<UserBean> getAttentionUserBean(String user_name){
		List<UserBean> userbeans = new ArrayList<UserBean>();
		try{
			int user_id = beandao.getUserIdByName(user_name);
			List<Integer> list = beandao.getAttention_id(user_id);
			for(int attention_id : list){
				UserBean userbean = new UserBean();
				String attention_name = beandao.getUserNameById(attention_id);
				userbean.setUser(beandao.getSimpleUser(attention_name));
				userbean.setAttention(beandao.getAttentionNum(attention_id));
				userbean.setFans(beandao.getFansNum(attention_id));
				
				BlogBean blogbean = new BlogBean();
				Blog blog = beandao.getLastBlog(attention_name);
				List<Comment> comments = beandao.getComment(blog.getId());
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				
				userbean.setBlogbean(blogbean);
				userbeans.add(userbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userbeans;
	}
	
	public List<UserBean> getFansUserBean(String user_name){
		List<UserBean> userbeans = new ArrayList<UserBean>();
		try{
			int user_id = beandao.getUserIdByName(user_name);
			List<Integer> list = beandao.getFans_id(user_id);
			for(int fans_id : list){
				UserBean userbean = new UserBean();
				String fans_name = beandao.getUserNameById(fans_id);
				userbean.setUser(beandao.getSimpleUser(fans_name));
				userbean.setAttention(beandao.getAttentionNum(fans_id));
				userbean.setFans(beandao.getFansNum(fans_id));
				
				BlogBean blogbean = new BlogBean();
				Blog blog = beandao.getLastBlog(fans_name);
				List<Comment> comments = beandao.getComment(blog.getId());
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				
				userbean.setBlogbean(blogbean);
				userbeans.add(userbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userbeans;
	}
	
	/**	----------------------------------------------------------	*/
	/**	检索	*/
	
	//按照用户名模糊查找
	public List<UserBean> searchUserBean(String user_name, int page){
		List<UserBean> userbeans = new ArrayList<UserBean>();
		try{
			List<User> list = beandao.searchUser(user_name, page);
			for(User user : list){
				UserBean userbean = new UserBean();
				userbean.setUser(beandao.getUserByName(user.getUsername()));
				userbean.setAttention(beandao.getAttentionNum(user.getId()));
				userbean.setFans(beandao.getFansNum(user.getId()));
				userbeans.add(userbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userbeans;
	}
	
	//按照微博内容模糊查找
	public List<BlogBean> searchBlogBean(String blog_content, int page){
		List<BlogBean> blogbeans = new ArrayList<BlogBean>();
		try{
			List<Blog> list = beandao.searchBlog(blog_content, page);
			for(Blog blog : list){
				BlogBean blogbean = new BlogBean();
				List<Comment> comments = beandao.getComment(blog.getId());				
				blogbean.setBlog(blog);
				blogbean.setComments(comments);
				blogbeans.add(blogbean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return blogbeans;
	}
	
	//按照微博id返回微博详细信息
	public BlogBean getBlogBeanById(int blog_id){
		BlogBean blogbean = new BlogBean();
		try{
			Blog blog = beandao.getBlogById(blog_id);
			List<Comment> comments = beandao.getComment(blog_id);				
			blogbean.setBlog(blog);
			blogbean.setComments(comments);
		}catch(Exception e){
			e.printStackTrace();
		}
		return blogbean;
	}
	/**	获取话题列表	*/
	public List<Topic> getTopics(){
		List<Topic> blogbeans = new ArrayList<Topic>();
		try{
			blogbeans = beandao.getTopics();
		}catch(Exception e){
			e.printStackTrace();
		}
		return blogbeans;
	}
}
