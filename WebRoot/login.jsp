<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'about.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="icon" type="image/png" href="images/favicon.ico" />
<link rel="apple-touch-icon" href="images/apple-touch-icon.png" />
<link rel="apple-touch-icon" sizes="72x72"
	href="images/apple-touch-icon-72x72.png" />
<link rel="apple-touch-icon" sizes="114x114"
	href="images/apple-touch-icon-114x114.png" />
<!--[if lt IE 9]>
<script src="scripts/ie9.js">IE7_PNG_SUFFIX=".png";</script>
<![endif]-->
<link
	href='http//fonts.googleapis.com/css?family=PT+Sans:400,400italic,700,700italic'
	rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="stylesheets/style.css" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/megamenu.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet" href="stylesheets/responsive.css" />
<script src="scripts/jquery.min.js"></script>
<script src="scripts/jquery.bxSlider.min.js"></script>
<script src="scripts/jquery.blackandwhite.min.js"></script>
<script src="scripts/js_func.js"></script>
<script>
	$(function() {
		$('.features_slider').bxSlider({
			auto : false,
			displaySlideQty : 5,
			moveSlideQty : 1,
			speed : 1000
		});
		$('.intro_slider').bxSlider({
			auto : false,
			controls : false,
			mode : 'fade',
			pager : true
		});
		$('.bwWrapper').BlackAndWhite({
			hoverEffect : true,
			webworkerPath : false,
			responsive : true,
			invertHoverEffect : false
		});
	});
</script>
<script type="text/javascript">
    //����XMLHttpRequest
    function createXmlHttpRequest(){
        if(window.XMLHttpRequest){
            return new XMLHttpRequest();
        }else{
            return new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
  function check(form){
	if (form.user_name.value==""){
		alert("�������˻���!");form.user_name.focus();return false;
	}else if (form.pwd.value==""){
		alert("����������!");form.pwd.focus();return false;
	}	else{
	//��Ϊ��ʱ��ʹ��Ajax�������̨������Ϣ����֤���û����Ƿ����
        //get�����ַ���
        var url="login.android_userdo?user_name = "+form.modlgn_username.value+" &pwd = "+form.pwd.value;
        //���÷�������XMLHttpRequest����
        XmlHttpRequest = createXmlHttpRequest();
        //���ûص�����
        XmlHttpRequest.onreadystatechange=finish;
        //��ʼ��xmlhttprequest
        XmlHttpRequest.open("GET",url,true);
        //��������
        XmlHttpRequest.send(null);}
	
}
    //�ص�����
    function finish(){
        if(XmlHttpRequest.readyState == 4&& XmlHttpRequest.status == 200){
            var result = XmlHttpRequest.responseText;
            if(result==0){
                alert("��½�ɹ���");
            }else{
                alert("��¼ʧ�ܣ�");
            }
        }
    }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
</head>

<body>
	<div class="wraper">
		<header class="header"> <a class="logo" href="index.html">construct</a>
		<nav> <!-- top menu -->
		<ul>

			<li><a href="index.jsp">��ҳ</a>
			</li>
			<li><a href="index.jsp">����</a>
			</li>
			<li><a href="blog_list.jsp">��</a>
			</li>
			<li><a href="about.jsp">����</a>
			</li>
			</li>
		</ul>
		<!-- /top menu --> </nav> </header>
	</div>

	<div class="content_block">
		<!-- top_title -->
		<div class="top_title">
			<div class="wraper">
				<h2>
					About Us<span>We think you'll love to work with us</span>
				</h2>
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="#">Pages</a></li>
					<li>About</li>
				</ul>
			</div>
		</div>
		<!-- /top_title -->
		<div class="wraper">
			<!-- intro text -->
			<div class="login">
				<div class="wrap">
					<div class="col_1_of_login span_1_of_login">
						<h4 class="title">New Customers</h4>
						<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
							sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna
							aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud
							exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea
							commodo consequat. Duis autem vel eum iriure dolor in hendrerit
							in vulputate velit esse molestie consequat, vel illum dolore eu
							feugiat nulla facilisis at vero eros et accumsan</p>
						<div class="button1">
							<a href="register.html"><input type="submit" name="Submit"
								value="����һ���µ��˺�?"> </a>
						</div>
						<div class="clear"></div>
					</div>
					<div class="col_1_of_login span_1_of_login">
						<div class="login-title">
							<h4 class="title">��½</h4>
							<div id="loginbox" class="loginbox">
								<form action="login.android_userdo" method="post" name="login"
									id="login-form">
									<fieldset class="input">
										<p id="login-form-username">
											<label for="modlgn_username">�˻���</label> <input
												id="modlgn_username" type="text" name="user_name"
												class="inputbox" size="18" autocomplete="off">
										</p>
										<p id="login-form-password">
											<label for="modlgn_passwd">����</label> <input
												id="modlgn_passwd" type="password" name="pwd"
												class="inputbox" size="18" autocomplete="off">
										</p>
										<div class="remember">
											<p id="login-form-remember">
												<label for="modlgn_remember"><a href="#">�������� ?
												</a> </label>
											</p>
											<input type="submit" name="Submit" class="button" value="��½"
												onclick="reture check(login)">
											<div class="clear"></div>
										</div>
									</fieldset>
								</form>
							</div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<!-- /intro text -->
				<!-- process -->
				<div class="process">
					<h4>Our Process</h4>
					<ul>
						<li>
							<h3>
								<span>Step 1</span> Resaearch
							</h3>
							<p>Lid est laborum et dolorum fugaste. Etras harum quidem
								rerum facilis est etras expedita distinctio. Namsir uns libero
								uns tempo re, cum soluta nobis est eligendi optio cumque nihil
								impit qd amets untra dolor amet sadipet.</p>
						</li>
						<li>
							<h3>
								<span>Step 2</span> Design
							</h3>
							<p>Lid est laborum et dolorum fugaste. Etras harum quidem
								rerum facilis est etras expedita distinctio. Namsir uns libero
								uns tempo re, cum soluta nobis est eligendi optio cumque nihil
								impit qd amets untra dolor amet sadipet.</p>
						</li>
						<li>
							<h3>
								<span>Step 3</span> Develop
							</h3>
							<p>Lid est laborum et dolorum fugaste. Etras harum quidem
								rerum facilis est etras expedita distinctio. Namsir uns libero
								uns tempo re, cum soluta nobis est eligendi optio cumque nihil
								impit qd amets untra dolor amet sadipet.</p>
						</li>
						<li>
							<h3>
								<span>Step 4</span> Deliver
							</h3>
							<p>Lid est laborum et dolorum fugaste. Etras harum quidem
								rerum facilis est etras expedita distinctio. Namsir uns libero
								uns tempo re, cum soluta nobis est eligendi optio cumque nihil
								impit qd amets untra dolor amet sadipet.</p>
						</li>
					</ul>
				</div>
				<!-- /process -->
				<div class="why_choose_explore">
					<h4>Why Choose Crucio? We��ll Tell You!</h4>
					<!-- why choose -->
					<div class="why_choose">
						<ul>
							<li>Cras rutrum leo at odio volutpat id blandit fugiats
								ipsum ornare.</li>
							<li>Donec fermentum porttitor nunc, sit amet gravida est
								porttitor vel.</li>
							<li>Maecenas quis nisi i luctus adipiscing sed vehicula
								tellus amet dolore.</li>
							<li>Aenean faucibus sapien a odio varius aliquet voluptas
								sadips..</li>
							<li>Suspendisse venenatis euismod ve vestibulum volutpat
								nibh imperdiets.</li>
							<li>Quisque non leo molestie augue imperdiet sollicitudin eu
								nec urna.</li>
							<li>Donec pulvinar lectus quis felis laoreet vestibulum.</li>
						</ul>
					</div>
					<!-- /why choose -->
					<!-- features_explore -->
					<div class="features_explore">
						<ul>
							<li>
								<div class="bwWrapper">
									<a href="#"><img src="images/about_us/why_choose_us_1.png"
										width="94" height="65" alt="" /> </a>
								</div>
								<p>
									Fugiat dapibus, tellus cursus commodo, tortoeir in mauristes
									conds ime ntum nibh, ut fermentum massats justo sitis amet
									risus. Crast matisers consectetut ameter fermes ntum unsers
									maecenas sadips ipsumores un ...<a href="#" class="read_more">read
										more</a>
								</p>
							</li>
							<li>
								<div class="bwWrapper">
									<a href="#"><img src="images/about_us/why_choose_us_2.png"
										width="94" height="65" alt="" /> </a>
								</div>
								<p>
									Fugiat dapibus, tellus cursus commodo, tortoeir in mauristes
									conds ime ntum nibh, ut fermentum massats justo sitis amet
									risus. Crast matisers consectetut ameter fermes ntum unsers
									maecenas sadips ipsumores un ...<a href="#" class="read_more">read
										more</a>
								</p>
							</li>
						</ul>
					</div>
					<!-- /features_explore -->
				</div>
				<!-- client list -->
				<div class="featured_list client_list">
					<div class="features_slider_wrap">
						<h3>���ǵĲ�Ʒ</h3>
						<ul class="features_slider">
							<li><div>
									<div class="bwWrapper">
										<a href="#"><img
											src="images/client_logos/client_logo_1.png" alt="" /> </a>
									</div>
								</div></li>
							<li><div>
									<div class="bwWrapper">
										<a href="#"><img
											src="images/client_logos/client_logo_2.png" alt="" /> </a>
									</div>
								</div></li>
							<li><div>
									<div class="bwWrapper">
										<a href="#"><img
											src="images/client_logos/client_logo_3.png" alt="" /> </a>
									</div>
								</div></li>
							<li><div>
									<div class="bwWrapper">
										<a href="#"><img
											src="images/client_logos/client_logo_4.png" alt="" /> </a>
									</div>
								</div></li>
							<li><div>
									<div class="bwWrapper">
										<a href="#"><img
											src="images/client_logos/client_logo_5.png" alt="" /> </a>
									</div>
								</div></li>
							<li><div>
									<div class="bwWrapper">
										<a href="#"><img
											src="images/client_logos/client_logo_6.png" alt="" /> </a>
									</div>
								</div></li>
						</ul>
					</div>
				</div>
				<!-- /client list -->
				<!-- /send_quote -->
				<div class="send_quote">
					<h4>Would you like us to send you a quote?</h4>
					<p>
						Click the button, fill out the form and we'll be right with you!<a
							class="btn_col" href="#">Get A Quote</a>
					</p>
				</div>
				<!-- /send_quote -->

			</div>
		</div>

		<!-- footer -->
		<!-- social block -->
		<div class="social_block">
			<div class="wraper">
				<p>��ע����</p>
				<ul>
					<li class="facebook"><a href="#">Facebook</a></li>
					<li class="twitter"><a href="#">Twitter</a></li>
					<li class="linkedin"><a href="#">LinkedIn</a></li>
					<li class="rss"><a href="#">RSS</a></li>
					<li class="dribbble"><a href="#">Dribbble</a></li>
					<li class="google"><a href="#">Google+</a></li>
				</ul>
			</div>
		</div>
		<!-- /social block -->

		<div class="footer">
			<footer> <!-- bottom about -->
			<div class="bottom_about">
				<p>
					<img src="images/logo.png" alt="" />
				</p>
				<p>At vero eos et accusaus et iusto unir un dignissimos ducimus
					quirds siter ters pi blranditiis praesentium amets voluptatum un
					deleniti atque corrupti quosdirs dolores etra quasir moltias unstw
					excepturi sinte amets occaecatires.</p>
			</div>
			<!-- /bottom about --> <!-- recent tweets -->
			<div class="recent_tweets">
				<h3>
					<span>��������</span>
				</h3>
				<ul>
					<li><a href="#">@gmyboy</a> ��������ְҵҲ���� <a href="#">31 ��ǰ</a></li>
					<li><a href="#">@pp</a> �������˽��ϻ���ս����Ҫ��ô�£�. <a href="#">37
							��ǰ</a></li>
				</ul>
			</div>
			<!-- /recent tweets --> <!-- recent posts -->
			<div class="recent_posts">
				<h3>
					<span>�������</span>
				</h3>
				<ul>
					<li><a href="#">�����������һ���ر𽾰���Ϊ�Ҵ������...</a></li>
					<li><a href="#">ˢͼ�������ˣ����������󣬹㶫һ... </a></li>
					<li><a href="#">��Ѷ�����˵��³�����ʿ����������������...</a></li>
					<li><a href="#">����㱬������Ӱ�Ļ��Ͷѹ�� û�еĻ� ������...</a></li>
					<li><a href="#">һ�б�ʶ�������ʮ�����������꿪ʼ��...</a></li>
				</ul>
			</div>
			<!-- /recent posts --> <!-- subscribe block -->
			<div class="subscribe_block">
				<h3>
					<span>������ϵ</span>
				</h3>
				<form method="post" action="#" />
				<p>
					<input type="text" id="name" value="�û��� ..." />
				</p>
				<p>
					<input type="text" id="email" value="���� ..." />
				</p>
				<p>
					<input type="submit" value="�ύ" />
				</p>
				</form>
			</div>
			<!-- /subscribe block --> </footer>
		</div>

		<!-- copyright -->
		<div class="copyright">
			<div class="wraper">
				<p>
					&copy; Copyright &copy; 2013.Gmyboy All rights reserved.<a
						target="_blank" href="http//www.zjf88.com/"></a>
				</p>
				<a class="top" href="#">���ض���</a>
			</div>
		</div>
		<!-- /copyright -->
		<!-- /footer -->
		<div style="display:none">
			<script src='http//v7.cnzz.com/stat.php?id=155540&web_id=155540'
				language='JavaScript' charset='gb2312'></script>
		</div>
</body>
</html>
