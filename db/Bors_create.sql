-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-12-15 10:12:13.776

-- tables
-- Table: account
CREATE TABLE account (
                         id serial  NOT NULL,
                         user_id int  NOT NULL,
                         name varchar(50)  NOT NULL,
                         CONSTRAINT portfolio_pk PRIMARY KEY (id)
);

-- Table: currency
CREATE TABLE currency (
                          id serial  NOT NULL,
                          name varchar(10)  NOT NULL,
                          CONSTRAINT currency_pk PRIMARY KEY (id)
);

-- Table: transaction
CREATE TABLE transaction (
                             id serial  NOT NULL,
                             currency_id int  NOT NULL,
                             account_id int  NOT NULL,
                             date date  NOT NULL DEFAULT NOW(),
                             ticker varchar(5)  NOT NULL,
                             type varchar(10)  NOT NULL,
                             price decimal(6,2)  NOT NULL,
                             amount int  NOT NULL,
                             fee decimal(6,2)  NOT NULL,
                             tax decimal(6,2)  NOT NULL,
                             CONSTRAINT transaction_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        username varchar(50)  NOT NULL,
                        password varchar(50)  NOT NULL,
                        CONSTRAINT user_ak_1 UNIQUE (username) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: portfolio_user (table: account)
ALTER TABLE account ADD CONSTRAINT portfolio_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: transaction_account (table: transaction)
ALTER TABLE transaction ADD CONSTRAINT transaction_account
    FOREIGN KEY (account_id)
        REFERENCES account (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: transaction_currency (table: transaction)
ALTER TABLE transaction ADD CONSTRAINT transaction_currency
    FOREIGN KEY (currency_id)
        REFERENCES currency (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

