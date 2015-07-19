package com.gmy.blog.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
/**
 * 工具类, 负责读入属性文件中的参数(java.io)
 * 1.注册驱动, 2.获得连接, 3.关闭资源
 * */
public class DBUtils {
	//把四个参数定义为全局变量
	//由getParam方法赋值, 给getConnection方法使用
	private static String driver;
	private static String url;
	private static String dbUser;
	private static String dbPwd;
	/**
	 * 读入filename中的键值对, 根据key给四个全局变量赋值
	 * 跟jdbc没关系
	 * 
	 * */
	public static void getParam(InputStream file){
		Properties props = new Properties();
		try{
			//把  file 中的键值对装载如集合中
			props.load(file);
			driver = props.getProperty("driver");
			url = props.getProperty("url");
			dbUser = props.getProperty("dbUser");
			dbPwd = props.getProperty("dbPwd");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn = null;
		//给四个全局变量赋值
		getParam(DBUtils.class.getClassLoader()
				.getResourceAsStream("com/gmy/blog/util/db_mysql.properties"));
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn){
		if(conn!=null){
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
