package com.gmy.blog.service;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.entity.User;
import com.gmy.blog.util.DAOFactory;

public class RegistService {
	UserDAO dao = (UserDAO)DAOFactory.getInstance("UserDAO");

	public int checkUser(String username){
		try{
			String s = dao.findPwdByName(username);
			if(s!=null){
				return 1;
			}
			return 0;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
	public int addUser(User user){
		try{
			if(dao.findPwdByName(user.getUsername())==null){
				dao.addUser(user);
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 1;
	}
}
