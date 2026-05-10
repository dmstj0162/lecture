package com.hw1.model.dto;

public class CookBook extends Book{

    private boolean coupon;

    public CookBook() {}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public String toString(){
        return "요리학원 쿠폰 유무 : " + coupon;
    }
}
