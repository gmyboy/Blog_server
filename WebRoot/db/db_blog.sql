/*
SQLyog Ultimate v8.32 
MySQL - 5.7.4-m14 : Database - db_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_blog` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `db_blog`;

/*Table structure for table `pocketblog_attention` */

DROP TABLE IF EXISTS `pocketblog_attention`;

CREATE TABLE `pocketblog_attention` (
  `_id` int(20) NOT NULL AUTO_INCREMENT,
  `attention_id` int(20) DEFAULT NULL,
  `user_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_attention` */

insert  into `pocketblog_attention`(`_id`,`attention_id`,`user_id`) values (1,2,1),(2,1,2),(3,1,3),(4,3,1);

/*Table structure for table `pocketblog_blog` */

DROP TABLE IF EXISTS `pocketblog_blog`;

CREATE TABLE `pocketblog_blog` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `picture` varchar(400) COLLATE utf8_bin DEFAULT NULL,
  `music` varchar(400) COLLATE utf8_bin DEFAULT NULL,
  `movie` varchar(400) COLLATE utf8_bin DEFAULT NULL,
  `user_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `blog_date` datetime DEFAULT NULL,
  `support` int(10) DEFAULT NULL,
  `forward_id` int(10) DEFAULT NULL,
  `comefrom` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `location` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_blog` */

insert  into `pocketblog_blog`(`id`,`content`,`picture`,`music`,`movie`,`user_name`,`blog_date`,`support`,`forward_id`,`comefrom`,`location`) values (59,'用过美图秀秀的滚吧，p过的勿靠近【图片】','4264315246528.jpg;4264317788949.jpg;','','','gmyboy','2014-04-15 00:00:00',NULL,0,'HM NOTE 1LTE','上海市浦东新区张江路'),(60,'人人都说高强牛逼，攻击力和力量，智力啥关系？？？来数据帝解析解析，求旧贴链接\\ue408','4484541247403.jpg;','','','gmyboy','2014-05-15 00:00:00',NULL,0,'HM NOTE 1LTE','上海市浦东新区张衡路'),(61,'刷图，慢死了，都不想玩捏，广东一，有人带么，不带都不想动这个号咯\\ue406','4549156535549.jpg;4549159571141.jpg;','','','gmyboy','2014-06-15 00:00:00',NULL,0,'三星s4',''),(62,'看过抗日深居的，日本能在中国呆八年，真是……爷爷我是叶问','4838123194074.jpg;4838126059431.jpg;4838128647191.jpg;4838131052739.jpg;','','','gmyboy','2014-07-15 00:00:00',NULL,0,'三星s4',''),(63,'1战时就有加特林了不过因为操作问题 自从马克沁机枪出现后就淘汰了（而且当时的加特林没上面的先进）','4902289220930.jpg;4902292468248.jpg;4902294704843.jpg;','','','gmyboy','2014-08-15 00:00:00',NULL,0,'三星s4',''),(64,'《英雄使命》：日本人扛不住了，也开始穿越了。穿制服的女皇军肩扛带激光测距仪的英国LAW劳80反坦克火箭筒，不知道要八路军的什么样武器需要如此对付。网友：中国抗战挺了八年也挺不容易的。 ...','4977400533121.jpg;4977403096928.jpg;','','','gmyboy','2014-09-15 00:00:00',NULL,0,'三星s4',''),(65,'“去横店一看，四五十个剧组都在 打鬼子 。”横店影视城使用群众演员共计30万，其中60%演过日军；全年48个剧组在“抗日”，一人一天最多死8次，一部30集电视剧拍4个月，这样算，横店去年“消灭鬼子”接近10亿，摊开来可绕地球两圈。','5080422200160.jpg;5080425474426.jpg;5080428006581.jpg;5080429668309.jpg;','','','gmyboy','2014-10-15 00:00:00',NULL,0,'HM NOTE 1LTE',''),(66,'《孤岛飞鹰》，这部戏的背景是1938，而主人公手中的波波沙冲锋枪……抗日初期（1938年）就使用波波沙冲锋枪。事实上波波沙冲锋在1940年末至1941年初经部队全面试验后，于1941年正式装备苏军陆军步兵，突击队及摩托化部队。','5209019669545.jpg;5209022093057.jpg;5209024812986.jpg;5209027065834.jpg;','','','gmyboy','2014-11-15 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(67,'腾讯代理了地下城与勇士，还会叫这个名字吗？会不会，改名为， QQ勇士？ 或者QQ地下城？呵呵我觉得 QQ勇士的可能性高点','5355446914341.jpg;5355448845538.jpg;5355449970037.jpg;','','','pp','2014-12-15 00:00:00',NULL,0,'iphone 6s',''),(68,'如果你爆到大无影的话就堆光吧 没有的话 在现在的话 我感觉火比较好！ 魔战套可以无线地烈爆炎！ 我修罗所有属性堆到90 还可以刷魂图 松松的','5400910693181.jpg;5400914731798.jpg;5400917788778.jpg;5400919838455.jpg;','','','pp','2015-01-15 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(69,'先用转职书转成剑魂，然后拿吧光剑，再用转职书转回来，走暗，用光剑开波动平a过图，伤害爆炸9999999','5546094375834.jpg;5546096917399.jpg;5546105217908.jpg;','','','pp','2015-01-25 00:00:00',NULL,0,'iphone 6s',''),(70,'只发图不说话，\n                      ～～～～我喜欢你牙齿上的韭菜','5630522386265.jpg;5630525130574.jpg;5630528957893.jpg;5630530950255.jpg;','','','pp','2015-01-26 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(71,'有人说我在水经验,我抬手就是一巴掌,怎么说话的!!!!#(怒)  人家明明是在给楼主暖贴#(乖)  \n大家好，我是自信。','5739234018227.jpg;5739237200958.jpg;','','','pp','2015-02-05 00:00:00',NULL,0,'iphone 6s',''),(72,'我玩鬼泣还有一点特别骄傲因为我大鬼泣是全职业唯一一个不觉醒但是放技能还带插图的职业～～～～鬼影闪！','5897904997970.jpg;5897907899683.jpg;','','','gmy','2015-02-06 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张江路'),(73,'100名壮汉打一群老虎，理性分析那边会赢\n                          ～～～～～～人类有铁棍，战斗范围足球场','6054638529655.jpg;6054640352636.jpg;','','','gmy','2015-03-01 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(74,'一切变故都是在我十二岁生日那年开始的。因为一些涉及到宗门的隐秘，因此关于我的属相和出生日期什么的，就不在这里说了。当然，您也可以认为我只是故弄玄虚。\n十二岁生日，是我的第一个本命年。','6181790926927.jpg;6181794170396.jpg;6181796880486.jpg;','','','gmy','2015-03-02 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(75,'上辈子投胎时，手贱，点到了地狱模式，到了天朝，升级难，怪太猛，钱难赚，装备贵，药还经常不会补血反而扣血，还有外挂，没钱还组不到队。','6374041958930.jpg;6374043604831.jpg;6374045445349.jpg;','','','gmy','2015-04-11 00:00:00',NULL,0,'iphone 6s',''),(76,'各种内涵图，各位收好','6461776235292.jpg;6461778314910.jpg;6461780789322.jpg;6461783074250.jpg;','','','gmy','2015-04-12 00:00:00',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(77,'\\ue40d今天真是到了大霉！\\ue40d\\ue40d','6498771001172.jpg;','','','gmy','2015-04-15 00:00:00',NULL,0,'iphone 6s',''),(78,'十年生死两茫茫，喜羊羊，灰太狼。舒克贝塔，蓝猫话凄凉。纵使相逢应不识，圣斗士，美猴王。老夫聊发少年狂,治肾亏,不含糖。锦帽貂裘，洗衣用奇强。为报倾城随太守，三百年，九芝堂。夜来幽梦忽还乡,学外语,新东方。相顾无言，洗洗更健康。问挖掘机哪家强？','9282025451367.jpg;9282040397373.jpg;','','','pp','2015-04-16 21:27:30',NULL,0,'iphone 6s','上海市浦东新区张江路'),(79,'你们都给我放尊重点，不是我吹，我和这里的务吧关系铁的很，敢骂我的傻逼不超过3个人。','9388908920168.jpg;9388910703355.jpg;','','','pp','2015-04-16 21:29:17',NULL,0,'iphone 6s',''),(80,'事情是这样的 楼主每天都在公共频道免费带异界 今天我说e2随便来个酱油 然后来了个小剑神 我就进蠕动了 一进图他跟我说没药 我说没药你来干啥 我当插座你打？ 他给我来了一句“你不是说随便来吗” 然后直接就退了 这带人还带出错来了？ 楼主是跨六 每天都免费带异界','9420769154930.jpg;9420771529661.jpg;','','','pp','2015-04-16 21:29:49',NULL,0,'iphone 6s',''),(81,'夕阳的余光照在我满含笑意的脸庞，就像她当年那样。有些人，有些事，一旦错过就是错过，不再擦肩，也没有回头，但是，岁月带走的是心中最美好的曾经。','9587737285543.jpg;9587738871977.jpg;','','','pp','2015-04-16 21:32:36',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(82,'男：亲爱的，520.\n女：亲爱的，我想听中文。\n男：亲爱的，伍贰零。\n女：我想听英文\n男：qinaide，five，two，zero\n女：我们分手吧，你这智商不适合我。','9894296236145.jpg;9894298218224.jpg;','','','gmy','2015-04-16 21:37:42',NULL,0,'iphone 6s','上海市浦东新区张衡路'),(83,'简单的介绍下我自己，跟来到深圳3年的经历。由于我不想找麻烦，我把我工作的地方用字母表示。大家喜欢看，就当故事去看。不喜欢请不要骂','9941493480824.jpg;9941495828608.jpg;9941497657134.jpg;9941499704227.jpg;','','','gmy','2015-04-16 21:38:29',NULL,0,'',''),(84,'当我第一次来到酒吧的时候，我才知道什么是啤酒这么贵。劲爆的音乐，心态不平的人们，在舞池中央，扭动着自己那邪恶的身躯。都是野兽加小姐。鸭子配富婆','9979913808641.jpg;9979915613642.jpg;9979917398112.jpg;9979919375059.jpg;','','','gmy','2015-04-16 21:39:08',NULL,0,'华为','上海市浦东新区张衡路'),(85,'领班看下我，问下我的基本情况。本人身高1.78 体重146长得算是成熟，只能做老女人生意。呵呵。 这就是第一次老大对我的评价。我懵然不知我已经在这个时候走进了我这3年了没有一天是正常人的生活','10016269498179.jpg;10016271925521.jpg;10016272945645.jpg;','','','gmy','2015-04-16 21:39:44',NULL,0,'iphone 6s',''),(86,'如果有喜欢看的，就回复下，以及工作的经历。 纯属个人的经历。主要是想告诫他人！\\ue00e','10048674926185.jpg;','','1.mp4','gmy','2015-04-16 21:40:17',NULL,0,'iphone 6s',''),(87,'《卧春》暗梅幽闻花，卧枝伤恨低，遥闻卧似水，易透达春绿。岸似驴，岸似透绿，岸似透黛绿。','10187387737285.jpg;10187389852815.jpg;10187391473466.jpg;','','','gmy','2015-04-16 21:42:35',NULL,0,'iphone 6s','上海市浦东新区张江路'),(88,'别问了，蓝翔，爱过，不约，明天有事，没多少钱了，八号上课，作业没写，这题不会，保大人，救我妈，不后悔，不知道安利，不知道鸽子为什么这么大，此刻我对你的伤害造成你的心理阴影部分的面积约9平方厘米。请问还有什么要问的？','10264881156945.jpg;10264882260477.jpg;','','','gmy','2015-04-16 21:43:53',NULL,0,'华为','安徽省马鞍山市雨山区安徽工业大学'),(89,'总是在冗长的梦境里完成生命现实里不愿上演的别离和割舍。这样的梦境，是否太过冰凉与残忍。看世界多危险多难。如反复无常的气象。没有地图。我们一路走一路被辜负，一路点燃希望一路寻找答案。过去的畅想有多快乐，现世的遗憾就有多悠长。','10291406821106.jpg;10291408296759.jpg;','','','gmy','2015-04-16 21:44:19',NULL,0,'华为','上海市浦东新区张江路'),(90,'在一段时间我喜欢一段音乐， 听一段音乐我怀念一段时光。 坐在一段时光里怀念另一段时光的掌纹。 那时听着那歌会是怎样的心情? 那时的我们是否相遇? 是相遇还是错过? 还是， 没有结局的邂逅?\\ue429','','','','gmy','2015-04-16 21:45:21',NULL,0,'iphone 6s',''),(91,'谁在春日艳阳的午后，轻抚你穿过飘扬秀发。谁在无数个黯然的白夜，带走独斟酌饮的酒，把浓烈的温度，狠狠的烧进胸口。谁把一季又一季的绿色原野，揉碎成泥土中潮湿的腐朽。谁捧起你如花的脸庞，让岁月美的黯然神伤。','10514133914811.jpg;10514136096210.jpg;','','','gmy','2015-04-16 21:48:02',NULL,0,'华为',''),(92,'楼主你要自己一个人照顾好自己，晚上盖好被子，早晨醒来不要猛的坐起来会头疼，不要吃凉的辣的对胃不好，过马路的时候左右看，好好吃饭，不要就穿那么点衣服，感冒了一定要吃药，不要熬太晚，睡觉时记得把手机的亮度调低些，不然有辐射，记得我在关心你。我想问你一个高端大气上档','10563524869875.jpg;10563527248883.jpg;','','','gmy','2015-04-16 21:48:51',NULL,0,'HM NOTE 1LTE','上海市浦东新区张江路'),(93,'恭喜楼主,你已被青蛙大学,赖蛤蟆系,不要脸班录取。请你携带你的精神病证明,坐二百五路公交车到傻瓜路,笨得要死街,蠢得要命站下车,报名时请站在校门口傻笑','10631117980332.jpg;','','','gmy','2015-04-16 21:49:59',NULL,0,'华为',''),(94,'一把大锁挂在门上，金钥匙自告奋勇插了进去，却无法将锁打开。不起眼的铁钥匙来了，他钻进锁孔，只轻轻一转，锁便轻松打开。 铁钥匙傲慢的说：“金钥匙，知道为什么平凡的我能打开这锁吗？因为我是她的原配，我最懂得她的心。” 金钥匙一脸不屑：”我ta吗有病去了解你媳妇的心？我就插着玩玩','10704769162629.jpg;10704771187908.jpg;','','','gmy','2015-04-16 21:51:13',NULL,0,'iphone 6s','上海市浦东新区张江路'),(95,'还记得小时候有一次早上睡得朦朦胧胧的，忽然爸爸把我从床上揪了起来，一下把那根硬硬的东西塞进了我的嘴里，并且来回不断摩擦着，我想挣扎可是挣扎不动，伴随着爸爸的节奏，不一会儿我嘴里就汩汩地溢出了乳白色的液体，我使劲喊了一声疼！一下子挣开了，爸爸吼道：“我给你刷个牙就那么费劲吗','10727999506404.jpg;','','','gmy','2015-04-16 21:51:36',NULL,0,'小米2s','安徽省马鞍山市雨山区安徽工业大学'),(97,'别问了，蓝翔，爱过，不约，明天有事，没多少钱了，八号上课，作业没写，这题不会，保大人，救我妈，不后悔，不知道安利，不知道鸽子为什么这么大，此刻我对你的伤害造成你的心理阴影部分的面积约9平方厘米。请问还有什么要问的？','10264881156945.jpg;10264882260477.jpg;','','','','2015-04-17 22:20:08',NULL,88,'HM NOTE 1LTE',''),(98,'《卧春》暗梅幽闻花，卧枝伤恨低，遥闻卧似水，易透达春绿。岸似驴，岸似透绿，岸似透黛绿。','10187387737285.jpg;10187389852815.jpg;10187391473466.jpg;','','','','2015-04-18 19:31:25',NULL,87,'HM NOTE 1LTE','安徽省马鞍山市雨山区安徽工业大学'),(99,'别问了，蓝翔，爱过，不约，明天有事，没多少钱了，八号上课，作业没写，这题不会，保大人，救我妈，不后悔，不知道安利，不知道鸽子为什么这么大，此刻我对你的伤害造成你的心理阴影部分的面积约9平方厘米。请问还有什么要问的？','10264881156945.jpg;10264882260477.jpg;','','','','2015-04-26 15:42:27',NULL,88,'HM NOTE 1LTE','安徽省马鞍山市雨山区安徽工业大学'),(104,'让我等没上过学的也能出去装下逼 ok I\'m first up bear boy\'s you can speak English？','4052402227917.jpg;','','','gmyboy','2015-05-03 12:46:55',NULL,0,'HM NOTE 1LTE','上海市浦东新区张衡路'),(105,'还记得小时候有一次早上睡得朦朦胧胧的，忽然爸爸把我从床上揪了起来，一下把那根硬硬的东西塞进了我的嘴里，并且来回不断摩擦着，我想挣扎可是挣扎不动，伴随着爸爸的节奏，不一会儿我嘴里就汩汩地溢出了乳白色的液体，我使劲喊了一声疼！一下子挣开了，爸爸吼道：“我给你刷个牙就那么费劲吗','10727999506404.jpg;','','','','2015-05-03 20:20:59',NULL,95,'','安徽省马鞍山市雨山区安徽工业大学');

/*Table structure for table `pocketblog_blogsupport` */

DROP TABLE IF EXISTS `pocketblog_blogsupport`;

CREATE TABLE `pocketblog_blogsupport` (
  `_id` int(20) NOT NULL AUTO_INCREMENT,
  `blog_id` int(50) DEFAULT NULL,
  `user_name` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_blogsupport` */

/*Table structure for table `pocketblog_collect` */

DROP TABLE IF EXISTS `pocketblog_collect`;

CREATE TABLE `pocketblog_collect` (
  `blog_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `collect_date` date DEFAULT NULL,
  PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_collect` */

/*Table structure for table `pocketblog_comment` */

DROP TABLE IF EXISTS `pocketblog_comment`;

CREATE TABLE `pocketblog_comment` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `user_name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `blog_id` int(10) DEFAULT NULL,
  `support` int(10) DEFAULT NULL,
  `comment_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_comment` */

insert  into `pocketblog_comment`(`id`,`content`,`user_name`,`blog_id`,`support`,`comment_date`) values (55,'根本不了解老虎的战斗力要怎么猜！？','gmy',73,NULL,'2015-04-15 00:00:00'),(56,'怎么了？亲爱的','gmyboy',77,NULL,'2015-04-15 00:00:00'),(57,'还有其他职业也可以','gmyboy',72,NULL,'2015-04-15 00:00:00'),(58,'人类醒','gmyboy',73,NULL,'2015-04-15 00:00:00'),(59,'可以去死了','gmyboy',75,NULL,'2015-04-15 00:00:00'),(60,'已阅','gmyboy',76,NULL,'2015-04-15 00:00:00'),(61,'iOS你那','gmyboy',86,NULL,'2015-04-18 15:24:59'),(62,'iOS你那','gmyboy',86,NULL,'2015-04-18 15:25:00'),(63,'iOS你那','gmyboy',86,NULL,'2015-04-18 15:25:00'),(64,'iOS你那','gmyboy',86,NULL,'2015-04-18 15:25:00'),(65,'iOS你那','gmyboy',86,NULL,'2015-04-18 15:25:00'),(66,'iOS你那','gmyboy',86,NULL,'2015-04-18 15:25:01'),(67,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:20'),(68,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:21'),(69,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:22'),(70,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:22'),(71,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:23'),(72,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:23'),(73,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:24'),(74,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:24'),(75,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:24'),(76,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:24'),(77,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:25'),(78,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:25'),(79,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:26'),(80,'龙年','gmyboy',86,NULL,'2015-04-19 19:19:26');

/*Table structure for table `pocketblog_commentsupport` */

DROP TABLE IF EXISTS `pocketblog_commentsupport`;

CREATE TABLE `pocketblog_commentsupport` (
  `comment_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_commentsupport` */

/*Table structure for table `pocketblog_topic` */

DROP TABLE IF EXISTS `pocketblog_topic`;

CREATE TABLE `pocketblog_topic` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `pic` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `read` int(50) DEFAULT NULL,
  `host` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `discussion` int(50) DEFAULT NULL,
  `fans` int(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_topic` */

insert  into `pocketblog_topic`(`id`,`name`,`type`,`pic`,`content`,`read`,`host`,`discussion`,`fans`) values (1,'你好夏天','生活记录','38fbebabad0efb56cc676a571c83b8fa.jpg','下载使用微博相机app，分享#你好夏天#的精彩照片参与活动，即可抽取红包，百万现金、自拍神器、GoPro等诱人豪礼',3,'随手拍',2,5),(2,'母亲节','公益','38fbebabad0efb56cc676a571c83b8fa.jpg','对于妈妈的全部思念，是厨房里忙碌的身影，是一碗家常小面，是离家的叮嘱。我们往往伤害最深的人士身边最亲的人。',10,'人民日报',13,3),(3,'小米Note顶配版','科技','38fbebabad0efb56cc676a571c83b8fa.jpg','安卓机皇#小米Note顶配版#，5月12日发售2999元！骁龙810+4GB LPDDR4内存+5.7吋阳光屏，香槟金色边框+双曲面玻璃工艺！',3,'小米Note',12,1);

/*Table structure for table `pocketblog_user` */

DROP TABLE IF EXISTS `pocketblog_user`;

CREATE TABLE `pocketblog_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `pwd` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sex` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `location` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `intro` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `hobby` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `birthday` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `regist_date` datetime DEFAULT NULL,
  `photo` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pocketblog_user` */

insert  into `pocketblog_user`(`id`,`username`,`pwd`,`email`,`sex`,`location`,`intro`,`hobby`,`birthday`,`regist_date`,`photo`) values (1,'gmyboy','123456','2275964276@qq.com','男','海南省-绍兴市','程序员','篮球','2014-11-11','2015-04-02 00:00:00','0.jpg'),(2,'gmy','123456','2275964276@qq.com','男','安徽省-马鞍山市','喜欢姑良','姑娘','1991-11-11','2015-04-02 00:00:00','0.jpg'),(3,'pp','123456','941985281@qq.com','女','福建省-三明市','你妹','擦，你妹啊','1992-02-09','2015-04-03 00:00:00','0.jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
