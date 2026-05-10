package com.hw1.model.dto;

public class AniBook extends Book {

    private int accessAge;

    public AniBook() {}

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public String toString() {
        return ", 제한 나이 : " + accessAge;
    }
}
