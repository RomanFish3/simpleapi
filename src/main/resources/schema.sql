DROP TABLE IF EXISTS Payer CASCADE;
DROP SEQUENCE IF EXISTS global_seq;
CREATE SEQUENCE global_seq START WITH 1;
CREATE TABLE payer(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name        VARCHAR         NOT NULL,
    number      VARCHAR         NOT NULL,
    pin         INTEGER         NOT NULL,
    type        VARCHAR         NOT NULL
);