<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png" />
<link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png" />
<!--[if lt IE 9]>
<script src="scripts/ie9.js">IE7_PNG_SUFFIX=".png";</script>
<![endif]-->
<link href='http//fonts.googleapis.com/css?family=PT+Sans:400,400italic,700,700italic' rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="stylesheets/style.css" /> 
<link rel="stylesheet" href="stylesheets/responsive.css" /> 
<script src="scripts/jquery.min.js"></script> 
<script src="scripts/jquery.bxSlider.min.js"></script>
<script src="scripts/jquery.blackandwhite.min.js"></script>
<script src="scripts/js_func.js"></script>
<script>
$(function(){
	$('.features_slider').bxSlider({
		auto: false,
		displaySlideQty: 5,
		moveSlideQty: 1,
    	speed : 1000
	});
	$('.intro_slider').bxSlider({
		auto: false,
		controls : false,
		mode: 'fade',
		pager: true
	});	
    $('.bwWrapper').BlackAndWhite({
        hoverEffect : true,
        webworkerPath : false,
        responsive:true,
        invertHoverEffect:false
    });
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
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

<div class="content_block">
 <!-- top_title -->
 <div class="top_title">
  <div class="wraper">
   <h2>About Us<span>We think you'll love to work with us</span></h2>
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
  <div class="intro_text">
   <ul class="intro_slider">
    <li>
     <div class="bwWrapper"><img src="images/about_us/about_us_slide_1.png" width="426" height="238" alt="" /></div>
     <div class="desc">
      <h4>Welcome to Construct, a Responsive Business HTML template that has a ton of features. Let us tell you about it!</h4>
      <p>Want to take a tour?  Check out the numerous options and features that Construct includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odios un  dig nissimos ducimus qui blan ditiis prasix esentium voluptatum deleniti atque si corrupti quos dolores et quas molestias excep turi int occaecati cupiditate non provident, simi lique sunt in culpa qui officia deserunt mol distinctio. At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis prae includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odio dignissimos duc imus qui blan ditiis prasix eseent ntium voluptatum deleniti atques.</p>
     </div>
    </li>
    <li>
     <div class="bwWrapper"><img src="images/about_us/about_us_slide_2.png" width="426" height="238" alt="" /></div>
     <div class="desc">
      <h4>Responsive Business HTML template that has a ton of features. Let us tell you about it!</h4>
      <p>Check out the numerous options and features that Construct includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odios un  dig nissimos ducimus qui blan ditiis prasix esentium voluptatum deleniti atque si corrupti quos dolores et quas molestias excep turi int occaecati cupiditate non provident, simi lique sunt in culpa qui officia deserunt mol distinctio. At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis prae includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odio dignissimos duc imus qui blan ditiis prasix eseent ntium voluptatum deleniti atques.</p>
     </div>
    </li>
    <li>
     <div class="bwWrapper"><img src="images/about_us/about_us_slide_3.png" width="426" height="238" alt="" /></div>
     <div class="desc">
      <h4>Welcome to Construct, a Responsive Business HTML template that has a ton of features. Let us tell you about it!</h4>
      <p>Want to take a tour?  Check out the numerous options and features that Construct includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odios un  dig nissimos ducimus qui blan ditiis prasix esentium voluptatum deleniti atque si corrupti quos dolores et quas molestias excep turi int occaecati cupiditate non provident, simi lique sunt in culpa qui officia deserunt mol distinctio. At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis prae includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odio dignissimos duc imus qui blan ditiis prasix eseent ntium voluptatum deleniti atques.</p>
     </div>
    </li>
    <li>
     <div class="bwWrapper"><img src="images/about_us/about_us_slide_4.png" width="426" height="238" alt="" /></div>
     <div class="desc">
      <h4>Responsive Business HTML template that has a ton of features. Let us tell you about it!</h4>
      <p>Check out the numerous options and features that Construct includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odios un  dig nissimos ducimus qui blan ditiis prasix esentium voluptatum deleniti atque si corrupti quos dolores et quas molestias excep turi int occaecati cupiditate non provident, simi lique sunt in culpa qui officia deserunt mol distinctio. At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis prae includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odio dignissimos duc imus qui blan ditiis prasix eseent ntium voluptatum deleniti atques.</p>
     </div>
    </li>
    <li>
     <div class="bwWrapper"><img src="images/about_us/about_us_slide_5.png" width="426" height="238" alt="" /></div>
     <div class="desc">
      <h4>Welcome to Construct, a Responsive Business HTML template that has a ton of features. Let us tell you about it!</h4>
      <p>Want to take a tour?  Check out the numerous options and features that Construct includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odios un  dig nissimos ducimus qui blan ditiis prasix esentium voluptatum deleniti atque si corrupti quos dolores et quas molestias excep turi int occaecati cupiditate non provident, simi lique sunt in culpa qui officia deserunt mol distinctio. At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis prae includes, we knoesir you’ll love them! At vero eos et accusamus et iusto odio dignissimos duc imus qui blan ditiis prasix eseent ntium voluptatum deleniti atques.</p>
     </div>
    </li>
   </ul>
  </div>
  <!-- /intro text -->
  <!-- process -->
  <div class="process">
   <h4>Our Process</h4>
   <ul>
    <li>
     <h3><span>Step 1</span> Resaearch</h3>
     <p>Lid est laborum et dolorum fugaste. Etras harum quidem rerum facilis est etras expedita distinctio. Namsir uns libero uns tempo re, cum soluta nobis est eligendi optio cumque nihil impit qd amets untra dolor amet sadipet.</p>
    </li>
    <li>
     <h3><span>Step 2</span> Design</h3>
     <p>Lid est laborum et dolorum fugaste. Etras harum quidem rerum facilis est etras expedita distinctio. Namsir uns libero uns tempo re, cum soluta nobis est eligendi optio cumque nihil impit qd amets untra dolor amet sadipet.</p>
    </li>
    <li>
     <h3><span>Step 3</span> Develop</h3>
     <p>Lid est laborum et dolorum fugaste. Etras harum quidem rerum facilis est etras expedita distinctio. Namsir uns libero uns tempo re, cum soluta nobis est eligendi optio cumque nihil impit qd amets untra dolor amet sadipet.</p>
    </li>
    <li>
     <h3><span>Step 4</span> Deliver</h3>
     <p>Lid est laborum et dolorum fugaste. Etras harum quidem rerum facilis est etras expedita distinctio. Namsir uns libero uns tempo re, cum soluta nobis est eligendi optio cumque nihil impit qd amets untra dolor amet sadipet.</p>
    </li>
   </ul>
  </div>
  <!-- /process --> 
  <div class="why_choose_explore">
   <h4>Why Choose Crucio?  We’ll Tell You!</h4>
  <!-- why choose -->
  <div class="why_choose">
   <ul>
    <li>Cras rutrum leo at odio volutpat id blandit fugiats ipsum ornare.</li>
    <li>Donec fermentum porttitor nunc, sit amet gravida est porttitor vel.</li>
    <li>Maecenas quis nisi i luctus adipiscing sed vehicula tellus amet dolore.</li>
    <li>Aenean faucibus sapien a odio varius aliquet voluptas sadips..</li>
    <li>Suspendisse venenatis euismod ve vestibulum volutpat nibh imperdiets.</li>
    <li>Quisque non leo molestie augue imperdiet sollicitudin eu nec urna.</li>
    <li>Donec pulvinar lectus quis felis laoreet vestibulum.</li>
   </ul>
  </div>
  <!-- /why choose -->
  <!-- features_explore -->
  <div class="features_explore">
   <ul>
    <li>
     <div class="bwWrapper"><a href="#"><img src="images/about_us/why_choose_us_1.png" width="94" height="65" alt="" /></a></div>
     <p>Fugiat dapibus, tellus cursus commodo, tortoeir in mauristes conds ime ntum nibh, ut fermentum massats justo sitis amet risus. Crast matisers consectetut ameter fermes ntum unsers maecenas sadips ipsumores un  ...<a href="#" class="read_more">read more</a></p>
    </li>
    <li>
     <div class="bwWrapper"><a href="#"><img src="images/about_us/why_choose_us_2.png" width="94" height="65" alt="" /></a></div>
     <p>Fugiat dapibus, tellus cursus commodo, tortoeir in mauristes conds ime ntum nibh, ut fermentum massats justo sitis amet risus. Crast matisers consectetut ameter fermes ntum unsers maecenas sadips ipsumores un  ...<a href="#" class="read_more">read more</a></p>
    </li>
   </ul>
  </div>
  <!-- /features_explore -->
  </div>
  <!-- client list -->
  <div class="featured_list client_list">
   <div class="features_slider_wrap">
   <h3>我们的产品</h3>
   <ul class="features_slider">
    <li><div><div class="bwWrapper"><a href="#"><img src="images/client_logos/client_logo_1.png" alt="" /></a></div></div></li>
    <li><div><div class="bwWrapper"><a href="#"><img src="images/client_logos/client_logo_2.png" alt="" /></a></div></div></li>
    <li><div><div class="bwWrapper"><a href="#"><img src="images/client_logos/client_logo_3.png" alt="" /></a></div></div></li>
    <li><div><div class="bwWrapper"><a href="#"><img src="images/client_logos/client_logo_4.png" alt="" /></a></div></div></li>
    <li><div><div class="bwWrapper"><a href="#"><img src="images/client_logos/client_logo_5.png" alt="" /></a></div></div></li>
    <li><div><div class="bwWrapper"><a href="#"><img src="images/client_logos/client_logo_6.png" alt="" /></a></div></div></li>
   </ul>
   </div>
  </div>
  <!-- /client list -->
  <!-- /send_quote -->
  <div class="send_quote">
   <h4>Would you like us to send you a quote?</h4>
   <p>Click the button, fill out the form and we'll be right with you!<a class="btn_col" href="#">Get A Quote</a></p>
  </div>
  <!-- /send_quote -->
  
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
