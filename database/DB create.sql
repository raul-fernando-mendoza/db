DROP TABLE db.user;

CREATE TABLE `db`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `email` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  is_active varchar(1) NOT NULL DEFAULT 'Y',
  `create_date`  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `update_date`  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB;


insert into db.user(email,password) values('raul.mendoza@excite.com','21e768b6d1e3bd55f799738155614675');
commit;

SELECT * FROM db.user;