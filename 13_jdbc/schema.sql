DROP DATABASE IF EXISTS db_jdbc;
CREATE DATABASE IF NOT EXISTS db_jdbc;
USE db_jdbc;

DROP TABLE IF EXISTS tbl_board;
DROP TABLE IF EXISTS tbl_user; 

CREATE TABLE IF NOT EXISTS tbl_user (
  uid      INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nickname VARCHAR(100) NOT NULL,
  UNIQUE KEY(nickname)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS tbl_board (
  bid         INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  uid         INT,
  title       VARCHAR(1000) NOT NULL,
  content     TEXT,
  created_at  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  modified_at TIMESTAMP,
  FOREIGN KEY(uid) REFERENCES tbl_user(uid)
) ENGINE=InnoDB;

SELECT u.uid, nickname, bid, title, content, created_at, modified_at
 FROM tbl_user u INNER JOIN tbl_board b
  ON u.uid = b.uid
 LIMIT 0, 10
