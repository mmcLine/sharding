CREATE DATABASE `ds_0` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `ds_1` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `ds_0_slave` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `ds_1_slave` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

CREATE TABLE `user_0`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_1`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_2`(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `share_db` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start` bigint(20) DEFAULT NULL,
  `end` bigint(20) DEFAULT NULL,
  `db_name` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



insert  into `share_db`(`id`,`start`,`end`,`db_name`) values (1,1,30,'ds0'),(2,31,60,'ds1');
