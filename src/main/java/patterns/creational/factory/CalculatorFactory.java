package patterns.creational.factory;

import patterns.creational.factory.impl.Addition;
import patterns.creational.factory.impl.Division;
import patterns.creational.factory.impl.Multiplication;
import patterns.creational.factory.impl.Subtraction;

public class CalculatorFactory {

    public static Calculator getCalculator(CalculatorTypes type) {

        switch (type) {
            case ADDITION:
                return new Addition();
            case DIVISION:
                return new Division();
            case MULTIPLICATION:
                return new Multiplication();
            case SUBTRACTION:
                return new Subtraction();

        }
        return null;
    }
}
