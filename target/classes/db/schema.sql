drop table PSH_RAW if exists;
create table PSH_RAW (
	 RID int NOT NULL,
	 fk_user int NOT NULL,
	 time datetime NOT NULL,
	 direct int NOT NULL,
	 type int NOT NULL,
primary key (RID)
);
