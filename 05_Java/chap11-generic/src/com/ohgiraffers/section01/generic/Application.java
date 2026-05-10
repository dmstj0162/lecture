package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {

        NormalBox normalBox = new NormalBox();
        normalBox.setContent("안녕");

        // 꺼낼 땐 반드시 강제 형변환
        String content = (String)normalBox.getContent();

        normalBox.setContent(123);  //실수로 숫자를 넣어도 컴파일 에러 안남

//        String wrongContent = (String)normalBox.getContent();

        // 제네릭에 들어가는 타입은 반드시 '객체 타입(참조형)'이어야 한다.
        // 내부적으로 타입을 Object로 다루기 때문에, 기본형은 Object로 업캐스팅 할 수 없다.
        GenericBox <String> stringBox = new GenericBox<>();

//        stringBox.setContent(123);
        stringBox.setContent("hello");
        String strContent = stringBox.getContent();
        System.out.println(strContent);

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setContent(100);

        int intContent = integerBox.getContent();   //auto-unboxing으로 int 변수에 담기 가능

    }
}
