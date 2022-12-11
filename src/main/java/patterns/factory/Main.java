package patterns.factory;

public class Main {

    public static void main(String[] args) {

        Calculator addition = CalculatorFactory.getCalculator(CalculatorTypes.ADDITION);
        double a = addition.count(1, 4, 0, 28);
        System.out.println(a);
    }
}
