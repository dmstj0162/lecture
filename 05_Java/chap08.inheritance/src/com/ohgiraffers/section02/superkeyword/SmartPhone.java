package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

// Product를 상속받는다
public class SmartPhone extends Product {

    //1. 고유 필드로 agency(통신사)를 가집니다.
    private String agency;

    //2. 모든필드를 초기화하는 생성자를 만드세요
    public SmartPhone(String code, String brand, String name, int price, Date manufacturingDate, String agency) {
        super(code, brand, name, price, manufacturingDate);
        this.agency = agency;
    }

    //3.getInformation 메소드를 오버라이딩해서 스마트폰의 모든 정보가 출력되도록 하세요.

    @Override
    public String getInformation() {
       return super.getInformation() + ", SmartPhone [ agency = " + agency + "]";

    }
}
