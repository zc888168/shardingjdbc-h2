/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : test1

 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 12/20/2018 14:11:33 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_order_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_order_0`
-- ----------------------------
BEGIN;
INSERT INTO `t_order_0` VALUES ('1', '1'), ('2', '2');
COMMIT;

-- ----------------------------
--  Table structure for `t_order_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_order_1`
-- ----------------------------
BEGIN;
INSERT INTO `t_order_1` VALUES ('23', '23'), ('25', '25'), ('81', '-12'), ('87', '33'), ('99', '44'), ('101', '101'), ('903', '903'), ('1015', '1015'), ('1021', '1021'), ('2001', '2001'), ('3001', '3001');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
