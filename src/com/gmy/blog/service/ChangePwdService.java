package com.gmy.blog.service;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.util.DAOFactory;

public class ChangePwdService {
	UserDAO dao = (UserDAO)DAOFactory.getInstance("UserDAO");
	
	public int changePwd(String username, String pwd, String newPwd){
		try{
			if(dao.findPwdByName(username).equals(pwd)){
				dao.changePwd(username, newPwd);
				return 0;
			}
			return 1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}
}
