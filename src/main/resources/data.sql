-- Scripts for populating the library users

INSERT INTO LIBRARY_USERS VALUES(1, 'Mr John', '04154111222', 'John@demo.com');

INSERT INTO LIBRARY_USERS VALUES(2, 'Mrs Sam', '0415222333', 'sam@demo.com');

INSERT INTO LIBRARY_USERS VALUES(3, 'Dr Greshma', '0415333444', 'greshma@demo.com');

INSERT INTO LIBRARY_USERS VALUES(4, 'Mr Greg', '0415444555', 'greg@demo.com');


-- Scripts for populating the books

INSERT INTO LIBRARY_BOOKS VALUES(1, 'Far From The Madding Crowd', 'Thomas Hardy', '978-1-56619-909-1');

INSERT INTO LIBRARY_BOOKS VALUES(2, 'My Experiments With Truth', 'Mahatma M.K.Gandhi', '978-1-56619-909-2');

INSERT INTO LIBRARY_BOOKS VALUES(3, 'The Merchant Of Venice', 'William Shakespeare', '978-1-56619-909-3');

INSERT INTO LIBRARY_BOOKS VALUES(4, 'The Moon And Six Pense', 'Somerset Maughan', '978-1-56619-909-4');

INSERT INTO LIBRARY_BOOKS VALUES(5, 'Geetanjali', 'Rabindra Nath Tagore', '978-1-56619-909-5');

INSERT INTO LIBRARY_BOOKS VALUES(6, 'One Day In The Life Of Ivan Denisovitch', 'Alexander Solzhenitsyn', '978-1-56619-909-6');

INSERT INTO LIBRARY_BOOKS VALUES(7, 'The Vicar of Wakefield', 'Oliver Goldsmith', '978-1-56619-909-7');

INSERT INTO LIBRARY_BOOKS VALUES(8, 'Pride and Prejudice', 'Pride and Prejudice', '978-1-56619-909-8');


-- Scripts for books lent

INSERT INTO LIBRARY_BOOKS_LENT VALUES(1, 3);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(2, 5);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(2, 6);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(3, 1);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(3, 2);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(3, 4);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(4, 7);

INSERT INTO LIBRARY_BOOKS_LENT VALUES(4, 8);