DROP TABLE USERS;
DROP TABLE USER_TYPE;
DROP TABLE LOOKUP;
DROP TABLE USER_TYPE_ORDER;

DROP SEQUENCE LOOKUP_SEQ;
DROP SEQUENCE USER_TYPE_SEQ;
DROP SEQUENCE USERS_SEQ;
DROP SEQUENCE USER_TYPE_ORDER_SEQ;

CREATE TABLE users (
	user_id bigint,
	user_name character varying,
	user_password character varying,
	user_type_id bigint,
	PRIMARY KEY (user_id)
);

CREATE SEQUENCE users_seq START WITH 1 INCREMENT 1;

CREATE TABLE user_type (
	user_type_id bigint,
	user_type character varying,
	PRIMARY KEY (user_type_id)
);

CREATE SEQUENCE user_type_seq START WITH 1 INCREMENT 1;

CREATE TABLE user_type_order(
	user_type_order_id bigint,
	user_type_id bigint,
	user_type_order_seq int,
	lookup_id bigint,
	PRIMARY KEY (user_type_order_id)
);

CREATE SEQUENCE user_type_order_seq START WITH 1 INCREMENT 1;

CREATE TABLE lookup (
	lookup_id bigint,
	lookup_name character varying,
	PRIMARY KEY (lookup_id)
);

CREATE SEQUENCE lookup_seq START WITH 1 INCREMENT 1;