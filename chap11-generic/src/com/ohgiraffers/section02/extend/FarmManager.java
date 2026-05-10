package com.ohgiraffers.section02.extend;

public class FarmManager {

    public void manageAnyFarm(RabbitFarm<?> farm){
        System.out.println("어떤 토끼 농장이든 관리 가능");
        farm.getAnimal().cry();
    }

    public void manageBunnyFarm(RabbitFarm<? extends Bunny> farm){
        System.out.println("버니 혹은 드렁큰 버니만 관리 가능");
        farm.getAnimal().cry();
    }

    public void manageRabbitOrBunnyFarm(RabbitFarm<? super Bunny> farm){
        System.out.println("토끼 혹은 바니만 관리 가능");
        farm.getAnimal().cry();
    }
}
