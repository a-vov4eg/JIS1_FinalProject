package service;

import interfaces.MathOperations;

public class Division implements MathOperations {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }

    @Override
    public String getName() {
        return "division";
    }


}
