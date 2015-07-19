package com.gmy.blog.service;

import com.gmy.blog.dao.BeanDAO;
import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.util.DAOFactory;

public class AttentionService {
	UserDAO dao = (UserDAO)DAOFactory.getInstance("UserDAO");
	
	public int attention(String user_name, String attention_name){
		try{
			BeanDAO beandao = (BeanDAO)DAOFactory.getInstance("BeanDAO");
			int user_id = beandao.getUserIdByName(user_name);
			int attention_id = beandao.getUserIdByName(attention_name);
			if(dao.checkAttention(user_id, attention_id)==0){
				dao.attention(user_id, attention_id);
				return 0;
			}
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
	
	public int deleteAttention(String user_name, String attention_name){
		try{
			BeanDAO beandao = (BeanDAO)DAOFactory.getInstance("BeanDAO");
			int user_id = beandao.getUserIdByName(user_name);
			int attention_id = beandao.getUserIdByName(attention_name);
			if(dao.checkAttention(user_id, attention_id)==1){
				dao.deleteAttention(user_id, attention_id);
				return 0;
			}
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
}
