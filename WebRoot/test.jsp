<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
    //����XMLHttpRequest
    function createXmlHttpRequest(){
        if(window.XMLHttpRequest){
            return new XMLHttpRequest();
        }else{
            return new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    //���û��˺������ʧȥ����ʱ���ø÷���
    function checkUser(obj){
        //��ȡ����������ֵ
        var user = obj.value;
        //���������е�ֵΪ�գ���ô������ʾ�������ø�������ý���
        if(!user){
            alert("�û�������Ϊ�գ�");
            obj.focus();
            return;
        }
        //��Ϊ��ʱ��ʹ��Ajax�������̨������Ϣ����֤���û����Ƿ����
        //get�����ַ���
        var url="servlet/LoginServlet?username="+user;
        //���÷�������XMLHttpRequest����
        XmlHttpRequest = createXmlHttpRequest();
        //���ûص�����
        XmlHttpRequest.onreadystatechange=finish;
        //��ʼ��xmlhttprequest
        XmlHttpRequest.open("GET",url,true);
        //��������
        XmlHttpRequest.send(null);
    }
    //�ص�����
    function finish(){
        if(XmlHttpRequest.readyState == 4&& XmlHttpRequest.status == 200){
            var result = XmlHttpRequest.responseText;
            if(result =="0"){
                alert("��½�ɹ���");
            }else{
                alert("��¼ʧ�ܣ�");
            }
        }
    }
</script>
  </head>
  
  <body>
    This is my JSP page. <br>
    <form action="login.android_userdo" method="post">
    <table>
        <tr>
            <td>�û��˺ţ�</td>
            <td><input type="text" name="user_name" onblur="checkUser(this)"/></td>
        </tr>
        <tr>
            <td>�û����룺</td>
            <td><input type="password" name="pwd"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="ע��"/></td>
            <td><input type="reset" value="����"></td>
        </tr>
    </table>
</form>
  </body>
  
</html>
