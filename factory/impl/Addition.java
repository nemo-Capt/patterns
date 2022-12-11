package patterns.factory.impl;

import patterns.factory.Calculator;

import java.util.Arrays;

public class Addition implements Calculator {

    @Override
    public double count(double... elements) {
        return Arrays.stream(elements).sum();
    }
}
