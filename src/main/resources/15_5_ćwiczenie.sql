INSERT INTO POSTS (USER_ID, BODY)
VALUES (5, 'Welcome Thomas! Nice to meet you!'),
       (3,'Lets play a game!'),
       (2,'That is good idea!');

UPDATE POSTS
SET BODY = 'To delete'
WHERE ID >= 7;

DELETE FROM POSTS
WHERE ID >= 7;

COMMIT;