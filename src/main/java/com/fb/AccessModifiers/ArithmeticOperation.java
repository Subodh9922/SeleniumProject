package com.fb.AccessModifiers;

public class ArithmeticOperation {
    int a;
    int b;
    int c;
    int result;
    int result1;
    void addition(int a, int b){
        result = a+b;
    }

    void addition( int a, int b, int c){
        result1 = a+b+c;
    }

    void printResult(){
        System.out.println("the result is : " +result);
    }

    void printResult1(){
        System.out.println("the result is : " +result1);
    }

    public static void main(String[] args) {
        ArithmeticOperation obj= new ArithmeticOperation();
        obj.addition(20,40);
        obj.printResult();
        obj.addition(30,60,80);
        obj.printResult1();
    }
}
