package ru.home.calculation;

/**
 * Created by dima on 15.02.15.
 */
public class Arithmetics {
    public double add(double a, double b) {
        return a+b;
    }

    public double deduct(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a*b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }
}
