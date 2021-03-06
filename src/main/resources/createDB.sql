CREATE TABLE book(
id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
title varchar(255),
isbn int(10),
description text
) CHARACTER SET cp1251 COLLATE cp1251_general_ci;

CREATE TABLE author(
id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
last_name varchar(25),
first_name varchar(25),
middle_name varchar(25)
) CHARACTER SET cp1251 COLLATE cp1251_general_ci;

CREATE TABLE book_authors(
id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
book_id int(10),
author_id int(10)
);
