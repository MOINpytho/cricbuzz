package com.example.TestingCase;

public class Calc {

    public int add(int ...nums){
        int sum =0;
        for(int num: nums){
            sum+= num;
        }
        return sum;
    }
    public boolean isEven(int a){
        return a % 2 == 0;
    }
}
