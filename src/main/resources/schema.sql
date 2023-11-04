DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS databases CASCADE;
DROP TABLE IF EXISTS database_x_user CASCADE;

CREATE SEQUENCE IF NOT EXISTS users_seq START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE IF NOT EXISTS databases_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE database_x_user
(
    database_id BIGINT NOT NULL,
    user_id     BIGINT NOT NULL
);

CREATE TABLE databases
(
    id         BIGINT                      NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    name       VARCHAR(255),
    secret_key VARCHAR(255),
    CONSTRAINT pk_databases PRIMARY KEY (id)
);

CREATE TABLE users
(
    id         BIGINT                      NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    nickname   VARCHAR(255),
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE database_x_user
    ADD CONSTRAINT fk_datxuse_on_database FOREIGN KEY (database_id) REFERENCES databases (id);

ALTER TABLE database_x_user
    ADD CONSTRAINT fk_datxuse_on_user FOREIGN KEY (user_id) REFERENCES users (id);