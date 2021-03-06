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
<script src="scripts/jquery.min.js"></script>
<script src="scripts/jquery.bxSlider.min.js"></script>
<script src="scripts/jquery.faq.js"></script>
<script src="scripts/jquery.blackandwhite.min.js"></script>
<script src="scripts/js_func.js"></script>
<script>
	$(function() {
		$('.clients_slider').bxSlider({
			auto : false,
			controls : false,
			mode : 'fade',
			pager : true
		});
		$('.recent_slider').bxSlider({
			auto : false,
			displaySlideQty : 1,
			moveSlideQty : 1,
			speed : 1000
		});
		$('#faq').dltoggle();
		$("#open").click(function(event) {
			$('#faq').dltoggle_show();
			return false;
		});
		$("#close").click(function(event) {
			$('#faq').dltoggle_hide();
			return false;
		});
		$('.bwWrapper').BlackAndWhite({
			hoverEffect : true,
			webworkerPath : false,
			responsive : true,
			invertHoverEffect : false
		});
	})
</script>
</head>

<body>
	<div class="wraper">
		<header class="header"> <a class="logo" href="index.html">construct</a>
		<nav> <!-- top menu -->
		<ul>

			<li><a href="index.jsp">首页</a></li>
			<li><a href="index.jsp">发现</a></li>
			<li><a href="blog_list.jsp">我</a></li>
			<li><a href="login.jsp">登陆</a></li>
			<li><a href="about.jsp">关于</a></li>
			</li>
		</ul>
		<!-- /top menu --> </nav> </header>
	</div>

	<div class="content_block">
		<!-- top_title -->
		<div class="top_title">
			<div class="wraper">
				<h2>
					Our Blog <span>Keep up with the latest news, tips and
						features right here!</span>
				</h2>
				<ul>
					<li><a href="#">Home</a>
					</li>
					<li><a href="#">Blog</a>
					</li>
					<li>Medium Image With Sidebar</li>
				</ul>
			</div>
		</div>
		<!-- /top_title -->
		<div class="wraper">
			<!-- blog entries -->
			<div class="blog_entries">

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_16.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_17.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_18.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_19.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_20.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_21.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<div class="post post_medium">
					<div class="img_wrap bwWrapper">
						<div class="date">April 2, 2012</div>
						<a href="blog_post.html"><img src="images/blog/blog_22.png"
							width="327" height="211" alt="" />
						</a>
					</div>
					<div class="desc">
						<h4>
							<a href="blog_post.html">Being Creative Take a Lot of Hard
								Work</a>
						</h4>
						<p>Fugiat dapibus, tellus ac cursus commodo, mauesris uns
							condime ntum nibh, ut fermentum mas justo sitters sit amet risus.
							Cras mattis cosi sectetut amet fermens tum aecenas faucib sadips
							amets. Libero tempore, impedit quo minus id quodsir maxime
							placeat , omnis dolor repellendus sadips ipsums fugiats vitae ...</p>
						<div class="metadata">
							<strong class="dots">....</strong> By <a href="#">Crucio</a> | <a
								href="#">12 COMMENTS</a><br />
							<a href="#">Photoshop, Photography, Business, Corporate,
								Creative</a> <a href="blog_post.html" class="read_more btn_col">Read
								More</a>
						</div>
					</div>
				</div>

				<!-- pager_nav -->
				<div class="pager_nav">
					<a href="#">1</a><span>2</span><a href="#">3</a><a href="#">4</a><a
						href="#">5</a> <a href="#" class="bx-prev">prev</a><a href="#"
						class="bx-next">next</a>
				</div>
				<!-- /pager_nav -->
			</div>
			<!-- /blog entries -->
			<!-- sidebar -->
			<div class="sidebar">
				<!-- most popular -->
				<div class="most_popular">
					<h4>Most Popular Blog Posts</h4>
					<ul>
						<li>
							<div class="bwWrapper">
								<a href="blog_post.html"><img src="images/blog/blog_23.png"
									width="60" height="55" alt="" />
								</a>
							</div>
							<div class="desc">
								<p>
									<strong><a href="blog_post.html">Being Creative
											Work</a>
									</strong>
								</p>
								<p>Sectetut amet fermens ...</p>
								<p>
									<span>February 15th 2012 <a href="#">By Crucio</a>
									</span>
								</p>
							</div></li>
						<li>
							<div class="bwWrapper">
								<a href="blog_post.html"><img src="images/blog/blog_24.png"
									width="60" height="55" alt="" />
								</a>
							</div>
							<div class="desc">
								<p>
									<strong><a href="blog_post.html">Being Creative
											Work</a>
									</strong>
								</p>
								<p>Sectetut amet fermens ...</p>
								<p>
									<span>February 15th 2012 <a href="#">By Crucio</a>
									</span>
								</p>
							</div></li>
						<li>
							<div class="bwWrapper">
								<a href="blog_post.html"><img src="images/blog/blog_25.png"
									width="60" height="55" alt="" />
								</a>
							</div>
							<div class="desc">
								<p>
									<strong><a href="blog_post.html">Being Creative
											Work</a>
									</strong>
								</p>
								<p>Sectetut amet fermens ...</p>
								<p>
									<span>February 15th 2012 <a href="#">By Crucio</a>
									</span>
								</p>
							</div></li>
					</ul>
				</div>
				<!-- /most popular -->
				<!-- acc tabs -->
				<div class="acc_tabs">
					<div id="tabs">
						<ul class="tab_select">
							<li><a href="#tab-1">Archives</a>
							</li>
							<li><a href="#tab-2">Categories</a>
							</li>
							<li><a href="#tab-3">Comments</a>
							</li>
						</ul>
						<div id="tab-1">
							<ul>
								<li><a href="#">January 2012 (12)</a>
								</li>
								<li><a href="#">February 2012 (12)</a>
								</li>
								<li><a href="#">March 2012 (12)</a>
								</li>
								<li><a href="#">April 2012 (12)</a>
								</li>
								<li><a href="#">May 2012 (12)</a>
								</li>
								<li><a href="#">June 2012 (12)</a>
								</li>
								<li><a href="#">July 2012 (12)</a>
								</li>
							</ul>
						</div>
						<div id="tab-2">
							<ul>
								<li><a href="#">Cat 1</a>
								</li>
								<li><a href="#">Cat 2</a>
								</li>
								<li><a href="#">Cat 3</a>
								</li>
							</ul>
						</div>
						<div id="tab-3">
							<ul>
								<li><a href="#">Some comment</a>
								</li>
								<li><a href="#">Some comment2</a>
								</li>
								<li><a href="#">Some comment3</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<!-- /acc tabs -->
				<!-- latest tweets -->
				<div class="latest_tweets">
					<h4>Latest From The Twittersphere</h4>
					<ul>
						<li><a href="#">@crucio</a> what an incredible site!<br />
						<a href="#">less than a minute ago</a>
						</li>
						<li><a href="#">@themesector</a> love this theme, tons of
							options, lots of goodies and crazy good support. I cant ask for
							anything better!<br />
						<a href="#">about 3 hours ago</a>
						</li>
						<li><a href="#">@themeforest</a> where do you get support for
							account issues? <a href="#">http//t.co/sr324nLrQw</a><br />
						<a href="#">less than a minute ago</a>
						</li>
					</ul>
				</div>
				<!-- /latest tweets -->
				<!-- our clients -->
				<div class="our_clients">
					<h4>Our Clients Just Love Us</h4>
					<ul class="clients_slider">
						<li>
							<blockquote>
								<p>"Nam libero tempore, cum soluta nobis est eligendi optio
									cumque nihl impedit quois minus id quod maxime placeat facere
									rendus sit sadipsamets."</p>
								<p>Jane Doe, CEO of Imperio</p>
							</blockquote></li>
						<li>
							<blockquote>
								<p>"Cum soluta nobis est eligendi optio cumque nihl impedit
									quois minus id quod maxime placeait sadipsamets."</p>
								<p>Jane Doe, CEO of Imperio</p>
							</blockquote></li>
						<li>
							<blockquote>
								<p>"Libero tempore, cuendi optio cumque nihl impedit quois
									minus id quod maxime placeat facere rendus sit sadipsamets."</p>
								<p>Jane Doe, CEO of Imperio</p>
							</blockquote></li>
						<li>
							<blockquote>
								<p>"Nam libero tempore, cum soluta nobis es nihl impedit
									quois minus id quod maxime placeat facere rendus sit
									sadipsamets."</p>
								<p>Jane Doe, CEO of Imperio</p>
							</blockquote></li>
						<li>
							<blockquote>
								<p>"Am libero tempore, cum soluta nobis est eligendi optio
									cumque ipsamets."</p>
								<p>Jane Doe, CEO of Imperio</p>
							</blockquote></li>
					</ul>
				</div>
				<!-- /our clients -->
				<!-- flyout_area sidebar -->
				<div class="flyout_area">
					<dl id="faq">
						<dt>
							<h4>Flyout Content Area 1</h4>
						</dt>
						<dd>
							<div>
								<p>Fugiat dapibus, tellus ac cursus commodo, mauris sit
									condime ntum nibh, ut fermentum massa justo vitaes amet risus
									amets un. osi sectetut amet fermentum aecenas faucib. doplores
									sadips uns.</p>
							</div>
						</dd>
						<dt>
							<h4>Flyout Content Area 2</h4>
						</dt>
						<dd>
							<div>
								<p>Fugiat dapibus, tellus ac cursus commodo, mauris sit
									condime ntum nibh, ut fermentum massa justo vitaes amet risus
									amets un. osi sectetut amet fermentum aecenas faucib. doplores
									sadips uns.</p>
							</div>
						</dd>
						<dt>
							<h4>Flyout Content Area 3</h4>
						</dt>
						<dd>
							<div>
								<p>Fugiat dapibus, tellus ac cursus commodo, mauris sit
									condime ntum nibh, ut fermentum massa justo vitaes amet risus
									amets un. osi sectetut amet fermentum aecenas faucib. doplores
									sadips uns.</p>
							</div>
						</dd>
					</dl>
				</div>
				<!-- /flyout_area sidebar -->
				<!-- recent work -->
				<div class="recent_work">
					<h4>Recent Work Widget</h4>
					<ul class="recent_slider">
						<li><div class="bwWrapper">
								<a href="#"><img src="images/blog/blog_23.png" width="59"
									height="54" alt="" />
								</a>
							</div>
							<div class="bwWrapper">
								<a href="#"><img src="images/blog/blog_24.png" width="59"
									height="54" alt="" />
								</a>
							</div>
							<div class="bwWrapper">
								<a href="#"><img src="images/blog/blog_25.png" width="59"
									height="54" alt="" />
								</a>
							</div>
							<div class="bwWrapper">
								<a href="#"><img src="images/blog/blog_26.png" width="59"
									height="54" alt="" />
								</a>
							</div>
							<div class="bwWrapper">
								<a href="#"><img src="images/blog/blog_27.png" width="59"
									height="54" alt="" />
								</a>
							</div>
							<div class="bwWrapper">
								<a href="#"><img src="images/blog/blog_28.png" width="59"
									height="54" alt="" />
								</a>
							</div>
						</li>
					</ul>
				</div>
				<!-- /recent work -->
			</div>
			<!-- /sidebar -->
		</div>
	</div>

	<!-- footer -->
	<!-- social block -->
	<div class="social_block">
		<div class="wraper">
			<p>关注我们</p>
			<ul>
				<li class="facebook"><a href="#">Facebook</a>
				</li>
				<li class="twitter"><a href="#">Twitter</a>
				</li>
				<li class="linkedin"><a href="#">LinkedIn</a>
				</li>
				<li class="rss"><a href="#">RSS</a>
				</li>
				<li class="dribbble"><a href="#">Dribbble</a>
				</li>
				<li class="google"><a href="#">Google+</a>
				</li>
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
				<span>最新评论</span>
			</h3>
			<ul>
				<li><a href="#">@gmyboy</a> 还有其他职业也可以 <a href="#">31 天前</a>
				</li>
				<li><a href="#">@pp</a> 根本不了解老虎的战斗力要怎么猜！. <a href="#">37 天前</a>
				</li>
			</ul>
		</div>
		<!-- /recent tweets --> <!-- recent posts -->
		<div class="recent_posts">
			<h3>
				<span>最近发表</span>
			</h3>
			<ul>
				<li><a href="#">我玩鬼泣还有一点特别骄傲因为我大鬼泣是...</a>
				</li>
				<li><a href="#">刷图，慢死了，都不想玩捏，广东一... </a>
				</li>
				<li><a href="#">腾讯代理了地下城与勇士，还会叫这个名字吗？...</a>
				</li>
				<li><a href="#">如果你爆到大无影的话就堆光吧 没有的话 在现在...</a>
				</li>
				<li><a href="#">一切变故都是在我十二岁生日那年开始的...</a>
				</li>
			</ul>
		</div>
		<!-- /recent posts --> <!-- subscribe block -->
		<div class="subscribe_block">
			<h3>
				<span>保持联系</span>
			</h3>
			<form method="post" action="#" />
			<p>
				<input type="text" id="name" value="用户名 ..." />
			</p>
			<p>
				<input type="text" id="email" value="邮箱 ..." />
			</p>
			<p>
				<input type="submit" value="Subscribe" />
			</p>
			</form>
		</div>
		<!-- /subscribe block --> </footer>
	</div>

	<!-- copyright -->
	<div class="copyright">
		<div class="wraper">
			<p>
				&copy; Copyright &copy; 2013.Company name All rights reserved.<a
					target="_blank" href="http//www.zjf88.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
			</p>
			<a class="top" href="#">Back to the top</a>
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
