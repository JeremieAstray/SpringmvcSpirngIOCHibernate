/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50702
Source Host           : localhost:3306
Source Database       : signinsystem

Target Server Type    : MYSQL
Target Server Version : 50702
File Encoding         : 65001

Date: 2013-11-22 20:19:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sign_in`
-- ----------------------------
DROP TABLE IF EXISTS `sign_in`;
CREATE TABLE `sign_in` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `subdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_signed_student` (`user_id`),
  CONSTRAINT `FK_signed_student` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign_in
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_num` varchar(12) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `clazz` varchar(20) DEFAULT NULL,
  `telephone` varchar(11) DEFAULT NULL,
  `short_telephone` varchar(6) DEFAULT NULL,
  `QQ` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `student_num` (`user_num`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'E10ADC3949BA59ABBE56E057F20F883E', '叶冠鸿', '计算机科学与技术n班', '12345678910', '612345', '5123456789');
INSERT INTO `user` VALUES ('5', '123456489412', '1234', '123', null, null, null, null);
