/*
 Navicat Premium Data Transfer

 Source Server         : Alen
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : lbms

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 11/05/2020 14:50:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `admin_number` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员账号',
  `admin_pwd` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员密码',
  `admin_job` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员职位',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bks_mes
-- ----------------------------
DROP TABLE IF EXISTS `bks_mes`;
CREATE TABLE `bks_mes`  (
  `bk_number` int(10) NOT NULL AUTO_INCREMENT COMMENT '图书编号',
  `bk_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书名称',
  `bk_writer` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书作者',
  `bk_publish` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书出版社',
  `bk_intro` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书简介',
  `bk_times` bigint(20) NOT NULL COMMENT '图书借阅次数',
  `bk_amount` int(10) NOT NULL COMMENT '图书总量',
  `bk_else` int(10) NOT NULL COMMENT '图书剩余数量',
  `bk_grade` float NOT NULL COMMENT '图书评分',
  PRIMARY KEY (`bk_number`, `bk_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 144 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bks_mes
-- ----------------------------
INSERT INTO `bks_mes` VALUES (100, '红楼梦 ', '曹雪芹', '东方出版社', '暂无', 3, 110, 19, 9.8);
INSERT INTO `bks_mes` VALUES (101, '水浒传', '施耐庵', '东方出版社', '暂无', 427, 101, 101, 9.3);
INSERT INTO `bks_mes` VALUES (102, '西游记', '吴承恩大哥', '东方出版社', '暂无', 287, 101, 100, 9.3);
INSERT INTO `bks_mes` VALUES (103, '少年Pi的奇幻漂流（绘图珍藏本）A ', '吴承恩大哥', '东方出版社', '暂无', 13, 101, 100, 9.3);
INSERT INTO `bks_mes` VALUES (104, '伊斯坦布尔假期（新版）', '路飞', '博集天卷出版社', '暂无', 234, 200, 100, 9.3);
INSERT INTO `bks_mes` VALUES (105, '金陵十三钗', 'C', '北方出版社', '暂无', 125, 100, 100, 8.9);
INSERT INTO `bks_mes` VALUES (106, '黑死馆杀人事件', 'D', '西方出版社', '暂无', 123, 100, 100, 8.7);
INSERT INTO `bks_mes` VALUES (107, '三寸金莲（冯骥才《俗世奇人》', 'E', '西方出版社', '暂无', 252, 100, 96, 8.8);
INSERT INTO `bks_mes` VALUES (108, '达·芬奇密码', 'F', '西方出版社', '暂无', 233, 100, 100, 8.8);
INSERT INTO `bks_mes` VALUES (109, '三重门（精装）', 'G', '西方出版社', '暂无', 442, 100, 100, 8.8);
INSERT INTO `bks_mes` VALUES (110, '脑洞大会：真相可不止一个！', 'H', '西方出版社', '暂无', 21, 100, 100, 8.8);
INSERT INTO `bks_mes` VALUES (116, '十宗罪', 'I', '东方出版社', '暂无', 0, 100, 100, 9.9);
INSERT INTO `bks_mes` VALUES (118, '无处安放的同情 ', 'J', '广东人民出版社', '暂无', 0, 100, 100, 8.7);
INSERT INTO `bks_mes` VALUES (119, '民族的重建 ', 'K', '南京大学出版社', '暂无', 0, 100, 100, 9.3);
INSERT INTO `bks_mes` VALUES (120, '我的不朽已然足够', 'L', '浦睿文化·民主与建设出版社', '暂无', 0, 100, 100, 7.7);
INSERT INTO `bks_mes` VALUES (121, '饱食穷民 ', 'M', '浙江人民出版社', '暂无', 0, 100, 100, 8.1);
INSERT INTO `bks_mes` VALUES (122, '黑暗时代的爱 ', 'N', '人民文学出版社', '暂无', 0, 100, 100, 7.8);
INSERT INTO `bks_mes` VALUES (123, '世纪的哭泣 ', 'O', '上海译文出版社', '暂无', 0, 100, 100, 8.7);
INSERT INTO `bks_mes` VALUES (124, '地球上最孤单的动物 ', 'P', '四川美术出版社', '暂无', 0, 100, 100, 9);
INSERT INTO `bks_mes` VALUES (125, '赞郁的蒙太奇 ', 'Q', '四川文艺出版社', '暂无', 0, 100, 100, 7.3);
INSERT INTO `bks_mes` VALUES (126, '当权的第三帝国 ', 'R', '九州出版社', '暂无', 0, 100, 100, 8.9);
INSERT INTO `bks_mes` VALUES (127, '廷巴克图 ', 'S', '文汇出版社', '暂无', 0, 100, 100, 8.6);
INSERT INTO `bks_mes` VALUES (128, '海边的卡夫卡 ', 'T', '上海译文出版社', '暂无', 0, 100, 100, 8.4);
INSERT INTO `bks_mes` VALUES (129, '谋杀狄更斯 ', 'U', '上海文艺出版社', '暂无', 0, 100, 100, 7.6);
INSERT INTO `bks_mes` VALUES (130, '平凡的世界：全三册 ', '路遥', '北京十月文艺出版社', '暂无', 0, 100, 100, 9.3);
INSERT INTO `bks_mes` VALUES (131, '长安十二时辰（上下册） ', 'W', '湖南文艺出版社', '暂无', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (132, '三毛全集01：雨季不再来 ', '三毛', '北京十月文艺出版社', '暂无', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (133, '三毛全集02：撒哈拉的故事 ', '三毛', '北京十月文艺出版社', '暂无', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (134, '三毛全集03：稻草人手记 ', '三毛', '北京十月文艺出版社', '暂无', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (135, '三毛全集04：温柔的夜 ', '三毛', '北京十月文艺出版社', '暂无', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (136, '三毛全集05：梦里花落知多少 ', '三毛', '北京十月文艺出版社', '', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (137, '三毛全集06：万水千山走遍 ', '三毛', '北京十月文艺出版社', '', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (138, '三毛全集07：送你一匹马 ', '三毛', '北京十月文艺出版社', '', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (139, '三毛全集08：亲爱的三毛 ', '三毛', '北京十月文艺出版社', '', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (140, '三毛全集09：我的宝贝 ', '三毛', '北京十月文艺出版社', '', 0, 100, 100, 9.2);
INSERT INTO `bks_mes` VALUES (143, '阿衰全集', '猫小乐', '浙江人民出版社', '很好看的校园漫画', 0, 100, 100, 9.4);

-- ----------------------------
-- Table structure for brow_record
-- ----------------------------
DROP TABLE IF EXISTS `brow_record`;
CREATE TABLE `brow_record`  (
  `brow_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '借书编号',
  `username` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `bk_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书名称',
  `bk_publish` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书出版社',
  `brow_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '借书时间(xxxx年xx月xx日xx时间)',
  `return_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '借书时间(xxxx年xx月xx日xx时间)',
  `whether_ruturn` int(2) NOT NULL COMMENT '是否归还（1为归还，0为未归还）',
  PRIMARY KEY (`brow_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `user_tel` int(11) DEFAULT NULL COMMENT '用户电话',
  `user_qq` int(13) DEFAULT NULL COMMENT '用户QQ',
  `user_mail` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户邮箱',
  `user_avatar` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', '1', 1, 1, '1', NULL);

SET FOREIGN_KEY_CHECKS = 1;
