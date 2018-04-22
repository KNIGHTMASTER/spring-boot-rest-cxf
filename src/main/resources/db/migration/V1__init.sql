CREATE TABLE employee (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    code varchar(50) NOT NULL,
    name varchar(150),
    PRIMARY KEY (id),
    UNIQUE KEY uk_code (code)
);