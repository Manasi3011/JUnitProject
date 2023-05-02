package org.example;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
    public int evaluate1(String expression) {
        int sub = 0;
        for (String summand: expression.split("\\-"))
            sub += Integer.valueOf(summand);
        return sub;
    }
}
