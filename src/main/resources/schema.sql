DROP TABLE IF EXISTS guitars;

CREATE TABLE guitars (
  id int(11) NOT NULL AUTO_INCREMENT,
  serialNumber varchar(100) NOT NULL,
  builder varchar(100) NOT NULL,
  model varchar(100) NOT NULL,
  type varchar(100) NOT NULL
);