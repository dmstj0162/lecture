package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.getInformation());

        Computer computer = new Computer("S-0123", "삼성", "갤럭시", 2000000, new Date(), "512", 12  );
        System.out.println(computer.getInformation());

        SmartPhone smartPhone = new SmartPhone("A-1111", "애플", "아이폰", 3000000, new Date(), "LG");
        System.out.println(smartPhone.getInformation());
    }
}
