package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Applicaiton2 {
    public static void main(String[] args) {

        /*
        * [선택 정렬]
        * 가장 작은 값을 찾아 맨 앞으로 보내는 과정을 반복하는 것
        * */

        int[] arr = {2,5,4,6,1,3};
        System.out.println("정렬 전: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length -1; i++){
            int minIndex = i; // 일단 현재 자리(i)에 있는 값이 가장 작다고 가정
            for(int j = i+1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println((i + 1) + "회차 정렬 후 : " + Arrays.toString(arr));
        }
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
