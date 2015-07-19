package com.gmy.blog.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
/**
 * ������, ������������ļ��еĲ���(java.io)
 * 1.ע������, 2.�������, 3.�ر���Դ
 * */
public class DBUtils {
	//���ĸ���������Ϊȫ�ֱ���
	//��getParam������ֵ, ��getConnection����ʹ��
	private static String driver;
	private static String url;
	private static String dbUser;
	private static String dbPwd;
	/**
	 * ����filename�еļ�ֵ��, ����key���ĸ�ȫ�ֱ�����ֵ
	 * ��jdbcû��ϵ
	 * 
	 * */
	public static void getParam(InputStream file){
		Properties props = new Properties();
		try{
			//��  file �еļ�ֵ��װ���缯����
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
		//���ĸ�ȫ�ֱ�����ֵ
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
