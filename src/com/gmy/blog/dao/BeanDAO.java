package com.gmy.blog.dao;

import java.util.List;

import com.gmy.blog.entity.Blog;
import com.gmy.blog.entity.Comment;
import com.gmy.blog.entity.Topic;
import com.gmy.blog.entity.User;

public interface BeanDAO {

	/** ��ȡ΢����Ϣ */
	// ��ȡ�û�΢���б�(��ҳ10��)
	public List<Blog> getBlogBean(String user_name, int page);

	// ��ȡ�û�����΢���б�(��ҳ10��)
	public List<Blog> showBlogBean(String attention_id, int page);

	// ��ȡ����΢���б�(��ҳ10��)
	public List<Blog> showHotBlogBean(int page);

	// ��ȡĳһ΢��������
	public List<Comment> getComment(int blog_id);

	// ��ȡĳ�û������һ��΢��
	public Blog getLastBlog(String user_name);

	/** ��ȡ�û���Ϣ */
	// ��ȡĳ�û���ϸ��Ϣ
	public User getUserByName(String user_name);

	// ��ȡĳ�û�����Ϣ
	public User getSimpleUser(String user_name);

	// ��ȡ�����û��б�(��ҳ10��)
	public List<Integer> showHotUser_id(int page);

	// ��ȡĳ�û���ע����
	public int getAttentionNum(int user_id);

	// ��ȡĳ�û���˿����
	public int getFansNum(int user_id);

	// ��ȡĳ�û���ע����id�б�
	public List<Integer> getAttention_id(int user_id);

	// ��ȡĳ�û���˿id�б�
	public List<Integer> getFans_id(int user_id);

	/** ���� */
	// �ؼ��ּ����û�
	public List<User> searchUser(String user_name, int page);

	// �ؼ��ּ���΢��
	public List<Blog> searchBlog(String blog_content, int page);

	/** ���߷��� */
	// ��username��ȡ�û�id
	public int getUserIdByName(String user_name);

	// ���û�id��ȡusername
	public String getUserNameById(int user_id);

	// ��΢��id��ȡ΢����Ϣ
	public Blog getBlogById(int blog_id);

	// ��ȡ΢���޵�����
	public int getBlogSupportNum(int blog_id);

	// ��ȡ�����޵�����
	public int getCommentSupportNum(int comment_id);

	// ��ȡ��ǰ�����е�����
	public List<Topic> getTopics();
}
