package patterns.creational.factory.impl;

import patterns.creational.factory.Calculator;

import java.util.Arrays;

public class Addition implements Calculator {

    @Override
    public double count(double... elements) {
        return Arrays.stream(elements).sum();
    }
}
