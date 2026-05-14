package com.ohgiraffers.section02.userException;

import com.ohgiraffers.section02.userException.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userException.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userException.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if(price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없다.");
        }

        if(money < 0){
            throw new MoneyNegativeException("가진 돈이 음수일 수 없다");
        }

        if(money < price){
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비싸다");
        }

        System.out.println("즐거운 쇼핑하세요");
    }
}
