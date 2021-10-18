CREATE DATABASE registration;

CREATE SCHEMA reg;

CREATE TABLE reg.reg_form (
    id serial PRIMARY KEY,
	name VARCHAR ( 100 )NOT NULL,
	surname VARCHAR ( 100 )NOT NULL,
	 email text NOT NULL,
	password text NOT NULL
)