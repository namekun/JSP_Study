# Ch17_SQL

```sql
create TABLE book(
  book_id NUMBER(4),
  book_name VARCHAR2(20),
  book_loc VARCHAR2(20)
  );
  
  -- 테이블 검색
  SELECT * FROM tab;
  
  -- 테이블 삭제
  DROP TABLE book;
  
  -- table 생성 -제약조건
  CREATE TABLE book(
    book_id NUMBER(4) CONSTRAINT book_id_pk PRIMARY KEY,
    book_name VARCHAR2(20),
    book_loc VARCHAR2(20)
    );
    
  -- 완전한 반영
  commit;
  
  --시퀀스 생성 
  -- 오라클 데이터베이스의 하나의 객체(값을 하나 자동으로 증가시키거나, 감소시키거나 하는거) 
  CREATE SEQUENCE book_seq;
  
  --데이터 추가
  INSERT INTO book(BOOK_ID, BOOK_NAME, BOOK_LOC)
  VALUES (book_seq.NEXTVAL,'book5', '001-00005');
  
  INSERT INTO book(BOOK_ID, BOOK_NAME, BOOK_LOC)
  VALUES (book_seq.NEXTVAL,'book6', '001-00006');
  
  -- 수정
  UPDATE book SET BOOK_LOC = '001-06127'
  WHERE BOOK_NAME = 'book6';

  -- 삭제
  DELETE FROM book
  WHERE book_id = 2;
  
  -- 데이터 검색
  SELECT * FROM book;
  
  SELECT book_name, book_loc FROM book;
  
  SELECT book_name AS 책이름, book_loc AS 책위치 FROM book;
  
  -- 조건 - where
  SELECT * FROM book WHERE book_id > 3;
  SELECT * FROM book WHERE book_id > 3 AND book_id <= 5;
  
  -- 조건 - Between And
  SELECT * FROM book WHERE book_id BETWEEN 2 AND 4;
  
  -- 조건 - LIKE
  SELECT * FROM book WHERE BOOK_ID LIKE 3;
  SELECT * FROM book WHERE BOOK_LOC LIKE '%3';
  SELECT * FROM book WHERE BOOK_NAME LIKE 'book%';
  SELECT * FROM book WHERE BOOK_NAME LIKE '%ok%';
  
  --정렬
  SELECT * FROM book ORDER BY book_id ASC;
  SELECT * FROM book ORDER BY book_id DESC;
  
  SELECT * FROM book ORDER BY book_name ASC;
  SELECT * FROM book ORDER BY book_name DESC;
```

