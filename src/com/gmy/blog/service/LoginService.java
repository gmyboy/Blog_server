package com.gmy.blog.service;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.util.DAOFactory;

public class LoginService {
	UserDAO dao = (UserDAO)DAOFactory.getInstance("UserDAO");
	
	public int login(String username, String pwd){
		try{
			String s = dao.findPwdByName(username);
			if(s==null){
				return 1;
			}
			else if(s.equals(pwd)){
				return 0;
			}
			return 2;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 3;
	}
}
