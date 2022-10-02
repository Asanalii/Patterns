package com.company;

public class Addition implements FunctionsStrategy{

    private int a;
    private int b;

    public Addition(int a, int b){
        this.a = a;
        this.b=b;
    }

    @Override
    public void doFunction() {
        System.out.println("Result of addition function= " + a+b);
    }
}
