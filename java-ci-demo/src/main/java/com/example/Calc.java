package com.example;

public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public double div(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }
}

