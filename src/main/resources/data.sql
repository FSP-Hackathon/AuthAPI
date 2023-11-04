INSERT INTO users (id, created_at, nickname)
VALUES
    (1, now(), 'Admin1'),
    (2, now(), 'Admin2'),
    (3, now(), 'Admin3');

INSERT INTO databases (id, created_at, name, secret_key)
VALUES
    (1, now(), 'db1', 'sc1'),
    (2, now(), 'db2', 'sc2'),
    (3, now(), 'db3', 'sc3'),
    (4, now(), 'db4', 'sc4'),
    (5, now(), 'db5', 'sc5');

INSERT INTO database_x_user (database_id, user_id)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (2, 1),
    (2, 3),
    (3, 2);