package com.ohguraffers.section01.init;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();

        // 객체 배열 선언
        Car[] carArr = new Car[3];
        System.out.println(carArr[0]);

        try{
            carArr[0].driveMaxSpeed();
        }catch (NullPointerException e){
            System.out.println("!! NPE 발생 !!");
        }
        carArr[0] = new Car("페라리", 300);
        carArr[1] = new Car("람보르기니", 350);
        carArr[2] = new Car("롤스로이스", 200);

        carArr[0].driveMaxSpeed();
    }

}
