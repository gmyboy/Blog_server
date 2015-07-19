package com.gmy.blog.service;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.entity.User;
import com.gmy.blog.util.DAOFactory;

public class PerfectUserService {
	UserDAO dao = (UserDAO)DAOFactory.getInstance("UserDAO");
	
	public int perfectUser(User user){
		try{
			if(dao.findPwdByName(user.getUsername())!=null){
				dao.perfectUser(user);
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 1;
	}
}
