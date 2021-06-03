/* Shard data */
UPDATE person SET fullname = name WHERE id > 0 and id <=5;
UPDATE person SET fullname = name WHERE id > 5 and id <=10;