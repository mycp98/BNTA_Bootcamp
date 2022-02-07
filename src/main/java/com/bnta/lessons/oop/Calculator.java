package com.bnta.lessons.oop;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) throws Exception{
        if(b==0){
            throw new Exception("Cannot divide by 0");
        }
        return a / b;
    }
}
