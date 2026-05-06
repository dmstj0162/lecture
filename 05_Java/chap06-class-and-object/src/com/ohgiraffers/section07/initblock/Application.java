package com.ohgiraffers.section07.initblock;

public class Application {
    public static void main(String[] args) {
    /*
    * [ 객체 탄생 순서 ]
    * 1. static 초기화 블록 -> 클래스 로드 시 딱 1번
    * 2. 명시적 초기값       -> new 할 때마다
    * 3. 인스턴스 초기화 블록  -> 생성자 직전마다
    * 4. 생성자            -> 최종 마무리
    * */

        System.out.println("=====product 생성=====");
        Product pro = new Product();

        System.out.println("=====product2 생성======");
        Product pro2 = new Product("대륙폰", 500000, "샤오미");

        System.out.println("======결과 출력======");
        System.out.println(pro.getInformation());
        System.out.println(pro2.getInformation());

    }
}
