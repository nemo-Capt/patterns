package patterns.factory.impl;

import patterns.factory.Calculator;

import java.util.Arrays;

public class Multiplication implements Calculator {

    @Override
    public double count(double... elements) {
        return Arrays.stream(elements)
                .reduce((a, b) -> a * b).orElse(0);
    }
}
