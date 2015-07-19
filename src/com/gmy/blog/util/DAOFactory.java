package com.gmy.blog.util;

public class DAOFactory {
	//type:�ӿ���,����EmployeeDAO
	public static Object getInstance(String type){
		String className = ConfigUtil.getValue(type);
		Object obj = null;
		try{
			obj = Class.forName(className).newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}
}
