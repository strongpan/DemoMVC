DROP DATABASE IF EXISTS test;
CREATE DATABASE test;

# user
DROP TABLE IF EXISTS test.user;
CREATE TABLE test.user (
  id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255),
  password VARCHAR(255)
);

# book
DROP TABLE IF EXISTS test.book;
CREATE TABLE test.book (
  id     INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title  VARCHAR(255),
  author VARCHAR(255),
  date   DATE,
  price  DECIMAL,
  amount INT(5)
);

SELECT *
FROM test.user;