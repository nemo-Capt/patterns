package patterns.factory;

import patterns.factory.impl.Addition;
import patterns.factory.impl.Division;
import patterns.factory.impl.Multiplication;
import patterns.factory.impl.Subtraction;

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
