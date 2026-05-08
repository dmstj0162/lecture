package com.hw1.model.dto;

public class Student extends Person {

    private int grade;
    private String major;

    //생성자
    public Student() {}

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    public String information() {
        return "이름: " +name+
                "나이: " +age+
                "신장: " +height+
                "몸무게: " +weight;
    }
}
