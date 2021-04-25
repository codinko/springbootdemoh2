DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  teamname VARCHAR(250) NOT NULL,
  salary INT DEFAULT 1000
);

INSERT INTO user (name, teamname, salary) VALUES
  ('Harley', 'FZ', 20000),
  ('Bill', 'FZ', 25000),
  ('Jeff', 'FZS', 5000);