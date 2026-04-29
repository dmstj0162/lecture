package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.method.Calculator;
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application {
    public static void main(String[] args) {
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(20, 10);
        System.out.println(min);

        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println(max);

        // import 사용(non-static)
        Calculator calc2 = new Calculator(); //패키지명 생략 가능
        int min2 = calc2.minNumberOf(2,5);
        System.out.println(min2);

        //static
        int max2 = Calculator.maxNumberOf(30,20);
        System.out.println(max2);

        // 이 기능이 어디에서 온건지 한눈에 파악하기 어러워 권장하지 않음
        int max3 =  maxNumberOf(40,10); // static import 해서 클래스명 없이 메소드 이름마능로 호출 가능
    }
}
