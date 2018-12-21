/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : test0

 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 12/20/2018 14:08:47 PM
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
INSERT INTO `t_order_0` VALUES ('2', '2'), ('24', '24'), ('72', '1'), ('82', '-11'), ('86', '13'), ('98', '14'), ('102', '102'), ('104', '104'), ('902', '902'), ('1012', '1012'), ('1022', '1022'), ('3000', '3000');
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

SET FOREIGN_KEY_CHECKS = 1;
