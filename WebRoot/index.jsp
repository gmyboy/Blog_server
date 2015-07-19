<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
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
<link rel="stylesheet" href="stylesheets/responsive.css" />
<link rel="stylesheet" href="stylesheets/jquery.onebyone.css" />
<script src="scripts/jquery.min.js"></script>
<script src="scripts/jquery.onebyone.min.js"></script>
<script src="scripts/jquery.touchwipe.min.js"></script>
<script src="scripts/js_func.js"></script>
<script>
	$(function() {
		$('#obo_slider').oneByOne({
			className : 'oneByOne1',
			easeType : 'random',
			slideShow : true
		});

	})
</script>

</head>

<body>
<div class="wraper">
 <header class="header">
  <a class="logo" href="index.html">construct</a>
  <nav>
  
  <!-- top menu -->
   <ul>
 
      <li><a href="index.jsp">首页</a>
    </li>
     <li><a href="index.jsp">发现</a>
    </li>
      <li><a href="blog_list.jsp">我</a>
      
    </li>
     <li><a href="about.jsp">关于</a>
    </li>
    </li>
   </ul>
  <!-- /top menu -->
  </nav>

 </header>
</div> 

<!-- one bt one slider -->
<div class="wrape homeone">
		<div class="fallback"><img src="images/sliders/home_page_1/home_page_1_fallback.jpg" alt="" /></div>
		<div id="obo_slider">  				
		<div class="oneByOne_item">
			<img src="images/sliders/home_page_1/home1_slide_1.png" class="wp1_3 slide1_bot" alt="" />		            
			<span class="txt1">Construct Looks Good On</span>			
			<span class="txt2">ALL Screen Sizes</span>												
			<span class="txt3 short">Lid est laborum dolo rumes fugats untras. Et harums ser quidem sit rerum facilis dolores nemis uns voluptas sadips ipsums vitae tolu ptas nemis omnis fugiats vitaes nemo minima rerums uns.</span>												
			<span class="txt4 txt4up"><a href="#" class="btn_l">Purchase Now!</a></span>
		</div>
		<div class="oneByOne_item">                                 	
			<img src="images/sliders/home_page_7/home7_slide_2.png" class="wp1_3 wp1_left slide2_bot" alt="" />			            
			<span class="txt1 blue txt_right2">This Slider Has Tons of Great Features</span>			
			<span class="txt2 blue txt_right2">iOS Friendly</span>												
			<span class="txt2 blue txt_right2">and Hyperlinks</span>												
			<span class="txt4 txt_right2 txt4up"><a href="#" class="btn_l">Purchase Now!</a></span>												
		</div>	
		
		<div class="oneByOne_item">
			<img src="images/sliders/home_page_7/home7_slide_3.png" class="wp1_3 slide2_bot" alt="" />		            
			<span class="txt1">Crucio is a responsive, business</span>			
			<span class="txt2">HTML template</span>												
			<span class="txt3">Lid est laborum dolo rumes fugats untras. Et harums ser quidem sit rerum facilis dolores nemis uns voluptas sadips ipsums vitae tolu ptas nemis omnis fugiats vitaes nemo minima rerums uns.</span>												
			<span class="txt4"><a href="#" class="btn_l">Purchase Now!</a></span>
		</div>                                                                                              

		<div class="oneByOne_item">                                 	
			<img src="images/sliders/home_page_7/home7_slide_4.png" class="wp1_3 slide3_bot" alt="" />			            
			<span class="txt1 blue">Use Individual Elements or </span>			
			<span class="txt2 blue">BIG IMAGES</span>												
			<span class="txt3 short">Lid est laborum dolo rumes fugats untras. Et harums ser quidem sit rerum facilis dolores nemis uns volu taes nemo minima rerums uns.</span>												
			<span class="txt4 txt4up"><a href="#" class="btn_l">Purchase Now!</a></span>
		</div>
		
		</div>    
</div>
<!-- /one bt one slider -->
 
<div class="content_block">
 <!-- text bar -->
 <div class="text_bar">
  <div class="wraper">
   <h2>Construct is a responsive, business HTML template!<span>Check out the numerous options and features that Construct includes.</span></h2>
   <a class="buy btn_l" href="#">Buy Construct!</a>
   <div class="widget">
    <h3>Construct Is Flexible</h3>
    <p>This is a widgetized area, you can add icons,  shortcodes, etc  ...  <a href="#">read more</a></p>
   </div>
  </div>
 </div>
 <!-- /text bar -->
 <div class="wraper">
  <!-- features_block -->
  <div class="features_block">
   <ul>
    <li class="design">
     <a class="circle_link" href="#">&nbsp;</a>
     <h4><span>Design</span></h4>
     <p>Lid est laborum dolo rumes fugats untras. Et harums ser quidem sit rerum facilis est dolores nemis uns.  </p>
    </li>
    <li class="flexible">
     <a class="circle_link" href="#">&nbsp;</a>
     <h4><span>Flexible</span></h4>
     <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium dolorem que laudantium totam</p>
    </li>
    <li class="support">
     <a class="circle_link" href="#">&nbsp;</a>
     <h4><span>Support</span></h4>
     <p>Nemo enim ipsam voluptatem uns quia voluptas sit aspernatur aut odit aut fugit, sed quia consequunturs.</p>
    </li>
    <li class="easy">
     <a class="circle_link" href="#">&nbsp;</a>
     <h4><span>Easy To Edit</span></h4>
     <p>Neque porro qusquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit sed quia nons.</p>
    </li>
    <li class="seo">
     <a class="circle_link" href="#">&nbsp;</a>
     <h4><span>SEO Ready</span></h4>
     <p>Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis voluptas uns sadips doloreusi.</p>
    </li>
   </ul>
  </div>
  <!-- /features_block -->
 </div>
</div>

<!-- footer -->
<!-- social block -->
<div class="social_block">
 <div class="wraper">
  <p>关注我们</p>
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
 <footer>
  <!-- bottom about -->
  <div class="bottom_about">
   <p><img src="images/logo.png" alt="" /></p>
   <p>At vero eos et accusaus et iusto unir un dignissimos ducimus quirds siter ters pi blranditiis praesentium amets voluptatum un deleniti atque corrupti quosdirs dolores etra quasir moltias unstw excepturi sinte amets occaecatires.</p>
  </div>
  <!-- /bottom about -->
  <!-- recent tweets -->
  <div class="recent_tweets">
   <h3><span>最新评论</span></h3>
   <ul>
    <li><a href="#">@gmyboy</a> 还有其他职业也可以 <a href="#">31 天前</a></li>
    <li><a href="#">@pp</a> 根本不了解老虎的战斗力要怎么猜！. <a href="#">37 天前</a></li>
   </ul>
  </div>
  <!-- /recent tweets -->
  <!-- recent posts -->
  <div class="recent_posts">
   <h3><span>最近发表</span></h3>
   <ul>
    <li><a href="#">我玩鬼泣还有一点特别骄傲因为我大鬼泣是...</a></li>
    <li><a href="#">刷图，慢死了，都不想玩捏，广东一... </a></li>
    <li><a href="#">腾讯代理了地下城与勇士，还会叫这个名字吗？...</a></li>
    <li><a href="#">如果你爆到大无影的话就堆光吧 没有的话 在现在...</a></li>
    <li><a href="#">一切变故都是在我十二岁生日那年开始的...</a></li>
   </ul>
  </div>
  <!-- /recent posts -->
  <!-- subscribe block -->
  <div class="subscribe_block">
   <h3><span>保持联系</span></h3>
   <form method="post" action="#" />
    <p><input type="text" id="name" value="用户名 ..." /></p>
    <p><input type="text" id="email" value="邮箱 ..." /></p>
    <p><input type="submit" value="提交" /></p>
   </form>
  </div>
  <!-- /subscribe block -->
 </footer>
</div>

<!-- copyright -->
<div class="copyright">
 <div class="wraper">
  <p>&copy; Copyright &copy; 2013.Gmyboy All rights reserved.<a target="_blank" href="http//www.zjf88.com/"></a></p>
  <a class="top" href="#">返回顶部</a>
 </div>
</div>
<!-- /copyright -->
<!-- /footer -->
<div style="display:none"><script src='http//v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
