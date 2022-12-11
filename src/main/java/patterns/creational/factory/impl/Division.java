package patterns.creational.factory.impl;

import patterns.creational.factory.Calculator;

import java.util.Arrays;

public class Division implements Calculator {

    @Override
    public double count(double... elements) {
        return Arrays.stream(elements)
                .reduce((a, b) -> a / b).orElse(0);
    }
}
