/*
Navicat MySQL Data Transfer

Source Server         : myConnection
Source Server Version : 100129
Source Host           : localhost:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 100129
File Encoding         : 65001

Date: 2018-01-28 22:06:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `username` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `flag` bit(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('tisfo', 'tisfo', '\0\0\0\0\0\0\0\0');
INSERT INTO `account` VALUES ('stelios', 'stelios', '\0\0\0\0\0\0\0\0');
INSERT INTO `account` VALUES ('admin', 'admin', '\0\0\0\0\0\0\0');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `prod_name` varchar(255) DEFAULT NULL,
  `prod_value` float(255,0) DEFAULT NULL,
  `prod_quantity` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of product
-- ----------------------------
