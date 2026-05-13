package com.ohgiraffers.section02;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<OnlineCourse> courses = Arrays.asList(
                new OnlineCourse("java의 정석", "Programming", 120, false),
                new OnlineCourse("Spring 완전정복", "Programming", 300, false),
                new OnlineCourse("JPA 끝장내기", "Programming", 240, false),
                new OnlineCourse("포토샵 마스터", "Design", 90, true),
                new OnlineCourse("일러스트레이터 시작하기", "Design", 110, true),
                new OnlineCourse("SQL 첫걸음", "Programming", 80, true),
                new OnlineCourse("데이터베이스 모델링", "Database", 150, false)
        );

        /* Programming 카테고리 중 수강 시간이 200분 초과 강의 제목 출력하기*/

        // for, if 사용
        for(OnlineCourse c : courses){
            if("Programming".equals(c.getCategory()) && c.getDuration() > 200){
                System.out.println(c.getTitle());
            }
        }
        // stream 사용
        courses.stream()
                .filter(c -> "Programming".equals(c.getCategory()))
                .filter(c -> c.getDuration() > 200)
                .map(OnlineCourse::getTitle)
                .forEach(System.out::println);

    }
}
