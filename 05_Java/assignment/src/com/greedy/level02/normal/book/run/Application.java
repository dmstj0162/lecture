package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        // 기본 생성자로 객체 생성
        BookDTO dto = new BookDTO();
        System.out.println(dto.printInformation());

        dto.setTitle("자바의 정석");
        dto.setPublisher("도우출판");
        dto.setAuthor("남궁성");
        dto.setPrice(30000);
        dto.setDiscountRate(0.1);

        System.out.println(dto.printInformation());

        BookDTO dto1 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.println(dto1.printInformation());

    }
}
