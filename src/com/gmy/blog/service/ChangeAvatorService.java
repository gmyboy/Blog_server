package com.gmy.blog.service;

import com.gmy.blog.dao.UserDAO;
import com.gmy.blog.entity.User;
import com.gmy.blog.util.DAOFactory;

public class ChangeAvatorService {
	UserDAO dao = (UserDAO) DAOFactory.getInstance("UserDAO");

	public int change(User user) {
		try {
			dao.changeAvator(user);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
}
