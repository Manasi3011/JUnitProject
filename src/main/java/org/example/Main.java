package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Calculator calculator = new Calculator();
        int sum=calculator.evaluate("3+2+2");
        System.out.println(sum);

    }
}