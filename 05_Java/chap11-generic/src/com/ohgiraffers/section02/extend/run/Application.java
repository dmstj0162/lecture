package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application {
    public static void main(String[] args) {

//        RabbitFarm<Snake>rabbitFarm = new RabbitFarm<>(); // <T extends Rabbit> 규칙 위반
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>(new Rabbit());
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>(new Bunny());
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>(new DrunkenBunny());

        FarmManager farmManager = new FarmManager();

        farmManager.manageAnyFarm(farm1);
        farmManager.manageAnyFarm(farm2);
        farmManager.manageAnyFarm(farm3);

//
        farmManager.manageBunnyFarm(farm2);
        farmManager.manageBunnyFarm(farm3);

        farmManager.manageRabbitOrBunnyFarm(farm1);
        farmManager.manageRabbitOrBunnyFarm(farm2);
//        farmManager.manageRabbitOrBunnyFarm(farm3);

    }
}
