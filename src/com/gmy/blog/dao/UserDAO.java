package com.gmy.blog.dao;

import java.util.List;

import com.gmy.blog.entity.User;

public interface UserDAO {
	/**	�û���Ϣ����	*/
	//	����û�
	public void addUser(User user);
	//	�û���������֤
	public String findPwdByName(String user_name);
	//	�޸�����
	public void changePwd(String username, String pwd);
	//	�����û���Ϣ
	public void perfectUser(User user);
	
	/**	�û����ܲ���	*/
	//	��֤��ӹ�ע
	public int checkAttention(int user_id, int attention_id);
	//	��ӹ�ע
	public void attention(int user_id, int attention_id);
	//	ɾ����ע
	public void deleteAttention(int user_id, int attention_id);
	//	��֤�ղ�΢��
	public int checkCollectBlog(String user_name, int blog_id);
	//	�ղ�΢��
	public void addCollectBlog(String user_name, int blog_id);
	//	ɾ���ղ�
	public void deleteCollectBlog(String user_name, int blog_id);
	
	/**	��ȡ�û��ղ�΢��������	*/
	public int getCollectNum(String user_name);
	/**	��ȡ�û��ղص�ȫ��΢��	*/
	public List<Integer> getCollectBlogId(String user_name, int page);
	/**	�����û�ͷ��	*/
	public void changeAvator(User user);
	
}
