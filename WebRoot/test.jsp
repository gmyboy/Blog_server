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
    //创建XMLHttpRequest
    function createXmlHttpRequest(){
        if(window.XMLHttpRequest){
            return new XMLHttpRequest();
        }else{
            return new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    //当用户账号输入框失去焦点时调用该方法
    function checkUser(obj){
        //获取输入框输入的值
        var user = obj.value;
        //如果输入框中的值为空，那么弹窗提示，并且让该输入框获得焦点
        if(!user){
            alert("用户名不能为空！");
            obj.focus();
            return;
        }
        //不为空时，使用Ajax请求向后台发送信息，验证该用户名是否可用
        //get请求字符串
        var url="servlet/LoginServlet?username="+user;
        //调用方法创建XMLHttpRequest对象
        XmlHttpRequest = createXmlHttpRequest();
        //设置回调函数
        XmlHttpRequest.onreadystatechange=finish;
        //初始化xmlhttprequest
        XmlHttpRequest.open("GET",url,true);
        //发送请求
        XmlHttpRequest.send(null);
    }
    //回调函数
    function finish(){
        if(XmlHttpRequest.readyState == 4&& XmlHttpRequest.status == 200){
            var result = XmlHttpRequest.responseText;
            if(result =="0"){
                alert("登陆成功！");
            }else{
                alert("登录失败！");
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
            <td>用户账号：</td>
            <td><input type="text" name="user_name" onblur="checkUser(this)"/></td>
        </tr>
        <tr>
            <td>用户密码：</td>
            <td><input type="password" name="pwd"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"/></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
  </body>
  
</html>
