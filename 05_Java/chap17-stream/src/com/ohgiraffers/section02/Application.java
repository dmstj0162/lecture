package com.ohgiraffers.section02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        /* 중간 연산*/
        courses.stream()
                .filter(OnlineCourse::isFree)
                .sorted((c1, c2) -> Integer.compare(c1.getDuration(), c2.getDuration()))
                .forEach(System.out::println);

        // distinct : 중복 제거하기
        courses.stream()
                .map(OnlineCourse::getCategory)
                .distinct()
                .forEach(System.out::println);

        /* 최종 연산*/
        // collect
        List<OnlineCourse> desigingCourses = courses.stream()
                .filter(c -> "Design".equals(c.getCategory()))
                .collect(Collectors.toList());
        System.out.println(desigingCourses);

        // 간단한 통계 구현
        // count() : 스트림에 남아있는 요소 개수 확인
        // sun() : 남은 요소 합계
        // average() : 남은 요소 평균
        int totalDurationFreeCourses = courses.stream()
                .filter(OnlineCourse::isFree)
                .mapToInt(OnlineCourse::getDuration)
                .sum();
        System.out.println(totalDurationFreeCourses);

        /* groupingBy */
        // 카테고리별 자동 분류
        // collect에게 groupingBy를 할건데 기준은 '카테고리'라고 전달하면
        // 스트림이 알아서 Map<카테고리, 해당 강의 리스트> 형태로 분류
        Map<String, List<OnlineCourse>> coursesByCategory = courses.stream()
                .collect(Collectors.groupingBy(OnlineCourse::getCategory));

        // Map 출력
        coursesByCategory.forEach((category, coursesList) -> {
            System.out.println("[" + category + "]");
            coursesList.forEach(c -> System.out.println("-" + c.getTitle()));
        });

    }
}
