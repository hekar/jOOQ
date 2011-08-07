DROP VIEW IF EXISTS v_library/
DROP VIEW IF EXISTS v_author/
DROP VIEW IF EXISTS v_book/
DROP TABLE IF EXISTS t_arrays CASCADE/
DROP TABLE IF EXISTS t_book_to_book_store CASCADE/
DROP TABLE IF EXISTS t_book_store CASCADE/
DROP TABLE IF EXISTS t_book CASCADE/
DROP TABLE IF EXISTS t_book_details CASCADE/
DROP TABLE IF EXISTS t_author CASCADE/
DROP TABLE IF EXISTS t_language CASCADE/
DROP TABLE IF EXISTS x_test_case_71 CASCADE/
DROP TABLE IF EXISTS x_test_case_64_69 CASCADE/
DROP TABLE IF EXISTS x_test_case_85 CASCADE/
DROP TABLE IF EXISTS x_unused CASCADE/
DROP TABLE IF EXISTS t_639_numbers_table CASCADE/
DROP TABLE IF EXISTS t_658_ref CASCADE/
DROP TABLE IF EXISTS t_658_11 CASCADE/
DROP TABLE IF EXISTS t_658_21 CASCADE/
DROP TABLE IF EXISTS t_658_31 CASCADE/
DROP TABLE IF EXISTS t_658_12 CASCADE/
DROP TABLE IF EXISTS t_658_22 CASCADE/
DROP TABLE IF EXISTS t_658_32 CASCADE/
DROP TABLE IF EXISTS t_725_lob_test/
DROP TABLE IF EXISTS t_785/

DROP FUNCTION f_arrays(in_array IN integer[])/
DROP FUNCTION f_arrays(in_array IN bigint[])/
DROP FUNCTION f_arrays(in_array IN text[])/
DROP FUNCTION p_arrays(in_array IN integer[], out_array OUT integer[])/
DROP FUNCTION p_arrays(in_array IN bigint[], out_array OUT bigint[])/
DROP FUNCTION p_arrays(in_array IN text[], out_array OUT text[])/
DROP FUNCTION p_enhance_address1(address IN u_address_type, no OUT VARCHAR)/
DROP FUNCTION p_enhance_address2(address OUT u_address_type)/
DROP FUNCTION p_enhance_address3(address IN OUT u_address_type)/
DROP FUNCTION p_unused(in1 VARCHAR, out1 OUT INTEGER, out2 IN OUT INTEGER)/
DROP FUNCTION p_create_author()/ 
DROP FUNCTION p_create_author_by_name(first_name VARCHAR, last_name VARCHAR)/ 
DROP FUNCTION p_author_exists(author_name VARCHAR, result OUT INTEGER)/
DROP FUNCTION p391(
	i1 INTEGER, io1 IN OUT INTEGER, o1 OUT INTEGER,
	o2 OUT INTEGER, io2 IN OUT INTEGER, i2 INTEGER)
/
DROP FUNCTION f_author_exists(author_name VARCHAR);/
DROP FUNCTION f_one();/
DROP FUNCTION f_number(n int);/
DROP FUNCTION f317(p1 int, p2 int, p3 int, p4 int);/
DROP FUNCTION p_get_two_cursors(books OUT refcursor, authors OUT refcursor)/
DROP FUNCTION p_get_one_cursor(total OUT int, books OUT refcursor, book_ids in int[])/
DROP FUNCTION f_get_one_cursor(book_ids IN int[])/

DROP TYPE IF EXISTS u_address_type CASCADE/
DROP TYPE IF EXISTS u_street_type CASCADE/
DROP TYPE IF EXISTS u_book_status CASCADE/
DROP TYPE IF EXISTS u_country CASCADE/

CREATE TYPE u_book_status AS ENUM ('SOLD OUT', 'ON STOCK', 'ORDERED')/
CREATE TYPE u_country AS ENUM ('Brazil', 'England', 'Germany')/

CREATE TYPE u_street_type AS (
  street VARCHAR(100),
  no VARCHAR(30),
  floors integer[]
)
/

CREATE TYPE u_address_type AS (
  street u_street_type,
  zip VARCHAR(50),
  city VARCHAR(50),
  country u_country,
  since DATE,
  code INTEGER
)
/

CREATE TABLE t_language (
  cd CHAR(2) NOT NULL,
  description VARCHAR(50),
  description_english VARCHAR(50),
  id INTEGER NOT NULL,
  
  CONSTRAINT pk_t_language PRIMARY KEY (ID)
)
/
COMMENT ON TABLE t_language IS 'An entity holding language master data'
/
COMMENT ON COLUMN t_language.id IS 'The language ID'
/
COMMENT ON COLUMN t_language.cd IS 'The language ISO code'
/
COMMENT ON COLUMN t_language.description IS 'The language description'
/

CREATE TABLE t_658_11 (
  id CHAR(3) NOT NULL,
  
  CONSTRAINT pk_t_658_11 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_21 (
  id INT NOT NULL,
  
  CONSTRAINT pk_t_658_21 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_31 (
  id BIGINT NOT NULL,
  
  CONSTRAINT pk_t_658_31 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_12 (
  id CHAR(3) NOT NULL,
  cd CHAR(3) NOT NULL,
  
  CONSTRAINT pk_t_658_12 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_22 (
  id INT NOT NULL,
  cd INT NOT NULL,
  
  CONSTRAINT pk_t_658_22 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_32 (
  id BIGINT NOT NULL,
  cd BIGINT NOT NULL,
  
  CONSTRAINT pk_t_658_32 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_ref (
  ref_11 char(3),
  ref_21 int,
  ref_31 bigint,
  ref_12 char(3),
  ref_22 int,
  ref_32 bigint,

  CONSTRAINT fk_t_658_11 FOREIGN KEY (ref_11) REFERENCES t_658_11(id),
  CONSTRAINT fk_t_658_21 FOREIGN KEY (ref_21) REFERENCES t_658_21(id),
  CONSTRAINT fk_t_658_31 FOREIGN KEY (ref_31) REFERENCES t_658_31(id),
  CONSTRAINT fk_t_658_12 FOREIGN KEY (ref_12) REFERENCES t_658_12(id),
  CONSTRAINT fk_t_658_22 FOREIGN KEY (ref_22) REFERENCES t_658_22(id),
  CONSTRAINT fk_t_658_32 FOREIGN KEY (ref_32) REFERENCES t_658_32(id)
)
/

CREATE TABLE t_725_lob_test (
  ID int NOT NULL,
  LOB BYTEA NULL,
  
  CONSTRAINT pk_t_725_lob_test PRIMARY KEY (id)
)
/

CREATE TABLE t_785 (
  ID int,
  NAME varchar(50),
  VALUE varchar(50)
)
/

CREATE TABLE t_author (
  id INTEGER NOT NULL,
  first_name VARCHAR(50),
  last_name VARCHAR(50) NOT NULL,
  date_of_birth DATE,
  year_of_birth INTEGER,
  address u_address_type,
  
  CONSTRAINT pk_t_author PRIMARY KEY (ID)
)
/
COMMENT ON TABLE t_author IS 'An entity holding authors of books'
/
COMMENT ON COLUMN t_author.id IS 'The author ID'
/
COMMENT ON COLUMN t_author.first_name IS 'The author''s first name'
/
COMMENT ON COLUMN t_author.last_name IS 'The author''s last name'
/
COMMENT ON COLUMN t_author.date_of_birth IS 'The author''s date of birth'
/
COMMENT ON COLUMN t_author.year_of_birth IS 'The author''s year of birth'
/
COMMENT ON COLUMN t_author.address IS 'The author''s address'
/

CREATE TABLE t_book_details (
  ID INT,
    
  CONSTRAINT pk_t_book_details PRIMARY KEY (ID)
)
/
COMMENT ON TABLE t_book_details IS 'An unused details table'
/

CREATE TABLE t_book (
  id INTEGER NOT NULL,
  author_id INTEGER NOT NULL,
  co_author_id INTEGER,
  details_id INT,
  title VARCHAR(400) NOT NULL,
  published_in INTEGER NOT NULL,
  language_id INTEGER NOT NULL,
  content_text TEXT,
  content_pdf BYTEA,
  status u_book_status,
  
  CONSTRAINT pk_t_book PRIMARY KEY (ID),
  CONSTRAINT fk_t_book_author_id FOREIGN KEY (AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_co_author_id FOREIGN KEY (CO_AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_details_id FOREIGN KEY (DETAILS_ID) REFERENCES T_BOOK_DETAILS(ID), 
  CONSTRAINT fk_t_book_language_id FOREIGN KEY (LANGUAGE_ID) REFERENCES T_LANGUAGE(ID)
)
/
COMMENT ON TABLE t_book IS 'An entity holding books'
/
COMMENT ON COLUMN t_book.id IS 'The book ID'
/
COMMENT ON COLUMN t_book.author_id IS 'The author ID in entity ''author'''
/
COMMENT ON COLUMN t_book.title IS 'The book''s title'
/
COMMENT ON COLUMN t_book.published_in IS  'The year the book was published in'
/
COMMENT ON COLUMN t_book.language_id IS  'The language of the book'
/
COMMENT ON COLUMN t_book.content_text IS 'Some textual content of the book'
/
COMMENT ON COLUMN t_book.content_pdf IS 'Some binary content of the book'
/
COMMENT ON COLUMN t_book.status IS 'The book''s stock status'
/


CREATE TABLE t_book_store (
  id serial not null,
  name VARCHAR(400) NOT NULL,
  
  CONSTRAINT uk_t_book_store_name UNIQUE(name)
)
/
COMMENT ON TABLE t_book_store IS 'A book store'
/
COMMENT ON COLUMN t_book_store.name IS 'The books store name'
/


CREATE TABLE t_book_to_book_store (
  book_store_name VARCHAR(400) NOT NULL,
  book_id INTEGER NOT NULL,
  stock INTEGER,
  
  CONSTRAINT pk_b2bs PRIMARY KEY(book_store_name, book_id),
  CONSTRAINT fk_b2bs_bs_name FOREIGN KEY (book_store_name)
                             REFERENCES t_book_store (name)
                             ON DELETE CASCADE,
  CONSTRAINT fk_b2bs_b_id    FOREIGN KEY (book_id)
                             REFERENCES t_book (id)
                             ON DELETE CASCADE
)
/
COMMENT ON TABLE t_book_to_book_store IS 'An m:n relation between books and book stores'
/
COMMENT ON COLUMN t_book_to_book_store.book_store_name IS 'The book store name'
/
COMMENT ON COLUMN t_book_to_book_store.book_id IS 'The book ID'
/
COMMENT ON COLUMN t_book_to_book_store.stock IS 'The number of books on stock'
/


CREATE TABLE t_arrays (
  id integer not null,
  string_array VARCHAR(20)[],
  number_array INTEGER[],
  date_array DATE[],
  udt_array u_street_type[],
  enum_array u_country[],
  array_array INTEGER[][],
  
  CONSTRAINT pk_t_arrays PRIMARY KEY (ID)
)
/

CREATE TABLE x_unused (
  id INTEGER NOT NULL,
  name VARCHAR(10) NOT NULL,
  BIG_INTEGER DECIMAL(25),
  id_ref INTEGER,
  CLASS INT,
  FIELDS INT,
  CONFIGURATION INT,
  U_D_T INT,
  META_DATA INT,
  VALUES INT,
  TYPE0 INT,
  PRIMARY_KEY INT,
  PRIMARYKEY INT,	
  name_ref VARCHAR(10),	
  "FIELD 737" DECIMAL(25, 2),
   
  CONSTRAINT pk_x_unused PRIMARY KEY(ID, NAME),
  CONSTRAINT uk_x_unused_id UNIQUE(ID),
  CONSTRAINT fk_x_unused_self FOREIGN KEY(ID_REF, NAME_REF) REFERENCES X_UNUSED(ID, NAME)
)
/
COMMENT ON TABLE x_unused IS 'An unused table in the same schema.'
/

CREATE TABLE t_639_numbers_table (
  ID INT NOT NULL,
  SHORT SMALLINT,
  INTEGER INT,
  LONG BIGINT,
  BYTE_DECIMAL DECIMAL(2, 0),
  SHORT_DECIMAL DECIMAL(4, 0),
  INTEGER_DECIMAL DECIMAL(9, 0),
  LONG_DECIMAL DECIMAL(18, 0),
  BIG_INTEGER DECIMAL(22, 0),
  BIG_DECIMAL DECIMAL(22, 5),
  FLOAT REAL,
  DOUBLE DOUBLE PRECISION,
  
  CONSTRAINT pk_t_639_numbers_table PRIMARY KEY(ID)
);
/


CREATE TABLE x_test_case_64_69 (
  id INTEGER NOT NULL,
  unused_id INTEGER,
   
  CONSTRAINT pk_x_test_case_64_69 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_64_69 FOREIGN KEY(UNUSED_ID) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE x_test_case_71 (
  id INTEGER NOT NULL,
  test_case_64_69_id SMALLINT,
 
  CONSTRAINT pk_x_test_case_71 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_71 FOREIGN KEY(TEST_CASE_64_69_ID) REFERENCES X_TEST_CASE_64_69(ID)
)
/

CREATE TABLE x_test_case_85 (
  id INTEGER NOT NULL,
  x_unused_id INTEGER,
  x_unused_name VARCHAR(10),
	
  CONSTRAINT pk_x_test_case_85 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_85 FOREIGN KEY(x_unused_id, x_unused_name) REFERENCES X_UNUSED(id, name)
)
/


CREATE OR REPLACE VIEW v_library (author, title) AS
SELECT a.first_name || ' ' || a.last_name, b.title
FROM t_author a JOIN t_book b ON b.author_id = a.id
/
  
CREATE VIEW v_author AS
SELECT * FROM t_author
/

CREATE VIEW v_book AS
SELECT * FROM t_book
/


CREATE FUNCTION p_unused (in1 VARCHAR, out1 OUT INT, out2 IN OUT INT)
AS $$
BEGIN
	NULL;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_enhance_address1 (address IN u_address_type, no OUT VARCHAR)
AS $$
BEGIN
	no := $1.street.no;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_enhance_address2 (address OUT u_address_type)
AS $$
BEGIN
	address := (
		SELECT t_author.address 
		FROM t_author
		WHERE first_name = 'George'
	);
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_enhance_address3 (address IN OUT u_address_type)
AS $$
BEGIN
	address.street := row('Zwinglistrasse', '17');
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_create_author_by_name (first_name VARCHAR, last_name VARCHAR)
RETURNS VOID
AS $$
BEGIN
	INSERT INTO T_AUTHOR (ID, FIRST_NAME, LAST_NAME)
	VALUES ((SELECT MAX(ID)+1 FROM T_AUTHOR), first_name, last_name);
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_create_author()
RETURNS VOID
AS $$
BEGIN
	PERFORM {jdbc.Schema}.p_create_author_by_name('William', 'Shakespeare');
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_author_exists (author_name VARCHAR, result OUT INTEGER)
AS $$
DECLARE
  v_result INT;
BEGIN
  SELECT CASE WHEN COUNT(*) > 0 THEN 1 ELSE 0 END
    INTO v_result
    FROM t_author 
   WHERE first_name LIKE author_name 
      OR last_name LIKE author_name;
      
  result := v_result;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_arrays(in_array IN integer[], out_array OUT integer[])
AS $$
BEGIN
	out_array := in_array;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_arrays(in_array IN bigint[], out_array OUT bigint[])
AS $$
BEGIN
	out_array := in_array;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_arrays(in_array IN text[], out_array OUT text[])
AS $$
BEGIN
	out_array := in_array;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p391 (
	i1 INTEGER, io1 IN OUT INTEGER, o1 OUT INTEGER,
	o2 OUT INTEGER, io2 IN OUT INTEGER, i2 INTEGER)
AS $$
BEGIN
  o1 := io1;
  io1 := i1;

  o2 := io2;
  io2 := i2;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_arrays(in_array IN integer[])
RETURNS integer[]
AS $$
BEGIN
	return in_array;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_arrays(in_array IN bigint[])
RETURNS bigint[]
AS $$
BEGIN
	return in_array;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_arrays(in_array IN text[])
RETURNS text[]
AS $$
BEGIN
	return in_array;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_author_exists (author_name VARCHAR)
RETURNS INT
AS $$
DECLARE
	v_result INT;
BEGIN
  SELECT CASE WHEN COUNT(*) > 0 THEN 1 ELSE 0 END
    INTO v_result
    FROM t_author 
   WHERE first_name LIKE author_name 
      OR last_name LIKE author_name;
      
  return v_result;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_one ()
RETURNS INT
AS $$
BEGIN
	RETURN 1;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_number (n int)
RETURNS INT
AS $$
BEGIN
	RETURN n;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f317 (p1 int, p2 int, p3 int, p4 int)
RETURNS INT
AS $$
BEGIN
	RETURN 1000 * p1 + 100 * p2 + p4;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_get_two_cursors (
	books   OUT refcursor, 
	authors OUT refcursor)
AS $$
BEGIN
	OPEN books   FOR SELECT * FROM t_book ORDER BY id ASC;
	OPEN authors FOR SELECT * FROM t_author ORDER BY id ASC;
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION p_get_one_cursor (
    total   OUT int,
	books   OUT refcursor, 
	book_ids IN int[])
AS $$
BEGIN
	OPEN books FOR SELECT * FROM t_book WHERE id IN (SELECT * FROM UNNEST(book_ids)) ORDER BY id ASC;
	SELECT count(*) INTO total FROM t_book WHERE id IN (SELECT * FROM UNNEST(book_ids));
END;
$$ LANGUAGE plpgsql;
/

CREATE FUNCTION f_get_one_cursor (book_ids int[])
RETURNS refcursor
AS $$
DECLARE
    ref refcursor;
BEGIN
	IF (book_ids IS NULL) THEN
	    OPEN ref FOR SELECT * FROM t_book WHERE 1 = 0;
	ELSE
		OPEN ref FOR SELECT * FROM t_book WHERE id IN (SELECT * FROM UNNEST(book_ids)) ORDER BY id ASC;
	END IF;
	
	RETURN ref;
END;
$$ LANGUAGE plpgsql;
/