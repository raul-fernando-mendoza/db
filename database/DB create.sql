DROP TABLE db.user;

CREATE TABLE `db`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `email` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  is_active varchar(1) NOT NULL DEFAULT 'Y',
  `create_date`  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `update_date`  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB;

truncate table db.user;
insert into db.user(email,password) values('raul.mendoza@excite.com','21e768b6d1e3bd55f799738155614675');
commit;

SELECT * FROM db.user;

DROP TABLE db.entity;

CREATE TABLE db.entity (
	entity_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	parent_entity_id INT NULL,
	entity_name varchar(250) not null,
	label varchar(250) NULL,
	description varchar(500) NULL,
	is_multiple varchar(1) NULL,
	created_by int,
	updated_by int,
	create_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB;


insert into db.entity(parent_entity_id, entity_name, label, description, is_multiple, created_by, updated_by)
values( -1, 'contact', 'contactos','tabla de contactos', 'N', 1, 1);

insert into db.entity(parent_entity_id, entity_name, label, description, is_multiple, created_by, updated_by)
values( -1, 'employee', 'empleados','tabla de empleados', 'N', 1, 1);

insert into db.entity(parent_entity_id, entity_name, label, description, is_multiple, created_by, updated_by)
values( -1, 'dates', 'citas','tabla de citas', 'N', 1, 1);

select * from db.entity;
commit;

delete from db.entity where entity_id = 1;

drop TABLE db.property;

CREATE TABLE db.property (
	property_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	parent_entity_ID int not null,
	property_Name varchar(100) not null,
	label varchar(100) null,
	datatype_ID int not null,
	size int null,
	is_pk varchar(1) default 'N',
	created_by int not null,
	updated_by int not null,
	create_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB;

insert into db.property( parent_entity_id, property_Name, label, datatype_id, size, is_pk, created_by, updated_by)
values(10, 'name', 'nombre', 1, null, 'Y', 1, 1);
commit;

select * from db.property order by parent_entity_id, property_name;

drop table db.datatype;
CREATE TABLE db.datatype (
	datatype_id INT NOT NULL PRIMARY KEY,
	datatype_Name varchar(100) not null,
	label varchar(100) null,
	created_by int not null,
	updated_by int not null,
	create_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB;

insert into db.datatype( datatype_id, datatype_name, label, created_by, updated_by)
values( 1, 'int', 'Integer', 1,1);
insert into db.datatype( datatype_id, datatype_name, label, created_by, updated_by)
values( 2, 'varchar', 'String', 1,1);
insert into db.datatype( datatype_id, datatype_name, label, created_by, updated_by)
values( 3, 'date', 'Date', 1,1);

commit;
select * from db.datatype;

commit;