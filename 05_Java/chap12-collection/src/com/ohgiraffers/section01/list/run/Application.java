package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크란
         * 여러 개의 데이터(객체)를 효과적으로 관리하기 위해 자바에서 제공하는 클래스들의 묶음
         * 크게 List, Set, Map 인터페이스로 분류된다.
         */

        // 제네릭 없는 리스트
        List alist = new ArrayList();
        alist.add("apple");
        alist.add(23);
        alist.add(45.67);
        alist.add(false);

        System.out.println(alist);

        String fruit = (String) alist.get(0);   // get(인덱스) - 해당 위치 조회

        // List는 순서를 가지고 있으며 중복 값 허용 가능
        List<String> stringList = new ArrayList<>();
//        stringList.add(123);
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("mango");    // 중복 허용(List 특성!)

        System.out.println(stringList); // 순서 유지

        stringList.add("banana");
        System.out.println(stringList);
        // set(인덱스, 값) - 해당 위치 수정
        stringList.set(0, "apple");
        System.out.println(stringList);

        // remove(인덱스 또는 값) - 삭제
        stringList.remove(1);
        System.out.println(stringList);

        // size() - 현재 몇 개 들어있는지 확인
        System.out.println(stringList.size());

        // 오름차순 정렬
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
