

CREATE DATABASE TEST0;
use TEST0;

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



CREATE DATABASE TEST1;

use TEST1;


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

