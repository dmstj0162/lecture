package com.ohgiraffers.common;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;


    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 1234, "자바의 정석"));
        bookList.put(2, new BookDTO(2, 5678, "파이썬"));
    }
    @Override
    public List<BookDTO> selectBookList() {

        //values(): 목록들만 컬렉션 타입으ㅗ 반환, ArrayList 생성자에 넣으면 ArrayList 타입으로 반환
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
