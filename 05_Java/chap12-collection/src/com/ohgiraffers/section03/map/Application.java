package com.ohgiraffers.section03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        /*
        * Map 인터페이스
        * - key와 value를 하나의 쌍(Entry)으로 묶어서 관리
        * - key는 중복 저장을 허용하지 않는다.
        * - value는 중복 저장을 허용한다.
        * - HashMap은 순서를 유지하지 않음
        * */

        Map<String, String> hmap = new HashMap<>();

        // put(key, value) : 저장
        hmap.put("one", "java");
        hmap.put("two", "jdbc");
        hmap.put("three", "mysql");
        hmap.put("two", "html");    // key 중복 -> 기존의 벨류값을 덮어씀
        hmap.put("four", "java");   // value 중복은 허용

        System.out.println(hmap);
        System.out.println(hmap.size());

        // get(key) : 특정 키로 값 조회
        System.out.println(hmap.get("one"));
        // 존재하지 않는 key로 get()하면 null 반환
        System.out.println(hmap.get("없는키"));

        // 실무에서의 방어 코드
        if(hmap.containsKey("three")){
            System.out.println("three 키가 존재합니다.");
        }
        // getOrDefault(): 키값이 없다면 null이 아니고 전달한 기본값을 반환
        System.out.println(hmap.getOrDefault("없는키", "기본값"));

        // remove(key) : 키-값 쌍 삭제
        hmap.remove("four");
        System.out.println(hmap);

        // Map 순회 방법(인덱스 존재 x)
        // 1. KeySet() - 키 전체를 Set으로 받아서 순회
        Set<String> keys = hmap.keySet();
        for(String key : keys){
            System.out.println(key + " = " + hmap.get(key));
        }

        // 2. values() - 값만 꺼낼 때
        Collection<String> values = hmap.values();
        for(String value: values){
            System.out.println(value);
        }

        // 3. entrySet() - 키+값 쌍(Entry)을 한 번에 Map.Entry 객체로 꺼내온다.(실무에서 권장)
        Set<Map.Entry<String, String>> entrySet = hmap.entrySet();
        for(Map.Entry<String, String> entry : entrySet){
            // getKey(), getValue()로 각각 키와 값에 접근한다.
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
