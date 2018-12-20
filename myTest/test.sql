/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-12-20 09:19:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `mykey`
-- ----------------------------
DROP TABLE IF EXISTS `mykey`;
CREATE TABLE `mykey` (
  `ID` int(10) NOT NULL,
  `MyKey` int(10) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of mykey
-- ----------------------------
INSERT INTO `mykey` VALUES ('123', '123');
INSERT INTO `mykey` VALUES ('456', '456');

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_german2_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', 'dads');
INSERT INTO `news` VALUES ('2', 'cccc');

-- ----------------------------
-- Table structure for `sign`
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `stNumber` int(10) NOT NULL,
  `name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign
-- ----------------------------
INSERT INTO `sign` VALUES ('1', '170405050', '李金川', '2018-07-19');
INSERT INTO `sign` VALUES ('2', '170405050', '李金川', '2018-12-02');
INSERT INTO `sign` VALUES ('3', '170405050', '李金川', '2018-12-02');
INSERT INTO `sign` VALUES ('4', '170405050', '李金川', '2018-12-02');
INSERT INTO `sign` VALUES ('5', '170405049', '张福贵', '2018-12-08');
INSERT INTO `sign` VALUES ('6', '170405049', '张福贵', '2018-12-08');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stNumber` int(10) NOT NULL,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `major` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`stNumber`),
  KEY `stNumber` (`stNumber`),
  KEY `stNumber_2` (`stNumber`),
  KEY `stNumber_3` (`stNumber`),
  KEY `stNumber_4` (`stNumber`),
  KEY `stNumber_5` (`stNumber`),
  KEY `stNumber_6` (`stNumber`),
  KEY `stNumber_7` (`stNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('170405049', '张福贵', '通信工程');
INSERT INTO `student` VALUES ('170405050', '李金川', '通信工程');
INSERT INTO `student` VALUES ('170405051', '黎逸杰', '通信工程');
INSERT INTO `student` VALUES ('170405052', '赵镇林', '通信工程');

-- ----------------------------
-- Table structure for `_admin`
-- ----------------------------
DROP TABLE IF EXISTS `_admin`;
CREATE TABLE `_admin` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userpwd` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_german2_ci;

-- ----------------------------
-- Records of _admin
-- ----------------------------
INSERT INTO `_admin` VALUES ('1', 'fdg', 'fsdf');
INSERT INTO `_admin` VALUES ('2', '45', 'fsfsdf');
INSERT INTO `_admin` VALUES ('3', '65456', 'dssd');
INSERT INTO `_admin` VALUES ('7', '发到客户', '123');
INSERT INTO `_admin` VALUES ('8', '定时达', '2312');
INSERT INTO `_admin` VALUES ('9', '反倒是', 'eee');
