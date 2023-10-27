CREATE DATABASE spring_pjt;
CREATE SCHEMA IF NOT EXISTS `spring_pjt` DEFAULT CHARACTER SET utf8 ;
USE spring_pjt;

drop table board;

CREATE TABLE video(
	youtubeId VARCHAR(50) PRIMARY KEY NOT NULL,
    title VARCHAR(50) NOT NULL,
    fitPartName VARCHAR(20) NOT NULL,
    channelName VARCHAR(50) NOT NULL,
    url VARCHAR(100) NOT NULL,
    viewCnt LONG NOT NULL
) ENGINE = InnoDB;

CREATE TABLE user (
	id VARCHAR(40) NOT NULL PRIMARY KEY,
    password VARCHAR(40) NOT NULL,
    name VARCHAR(40) NOT NULL,
    email VARCHAR(40)
) ENGINE = InnoDB;

CREATE TABLE board(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    title VARCHAR(40) NOT NULL,
    writer VARCHAR(40) NOT NULL,
    content LONGTEXT NOT NULL,
    regDate DATETIME NOT NULL,
	youtubeId VARCHAR(50) NOT NULL,
    viewCnt INT DEFAULT 0,
    FOREIGN KEY (writer) REFERENCES user(id),
    FOREIGN KEY (youtubeId) REFERENCES video(youtubeId)
) ENGINE = InnoDB;

INSERT INTO video
VALUES ("gMaB-fG4u4g", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "전신", "ThankyouBUBU", "https://www.youtube.com/embed/gMaB-fG4u4g", 2),
("swRNeYw1JkY", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", "전신", "ThankyouBUBU", "https://www.youtube.com/embed/swRNeYw1JkY", 5),
("54tTYO-vU2E", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", "상체", "ThankreviewreviewyouBUBU", "https://www.youtube.com/embed/54tTYO-vU2E", 3);

INSERT INTO user
VALUES ('ssafy1', 'ssafy1', '박민아', 'ssafy1@ssafy.com'),
('ssafy2', 'ssafy2', '이지은', 'ssafy2@ssafy.com'),
('ssafy3', 'ssafy3', '전민정', 'ssafy3@ssafy.com');
INSERT INTO user
VALUES ('ssafy4', 'ssafy4', 'newnew', 'ssafy4@ssafy.com');


INSERT INTO board(title, writer, content, regDate, youtubeId, viewCnt)
VALUES ("좋아요", "ssafy1", "좋아요", "2023-10-13", 'gMaB-fG4u4g', 0),
("멋져요", "ssafy2", "멋져요", "2023-10-13", 'gMaB-fG4u4g', 0);

select * from video;
select * from user;
select * from board;