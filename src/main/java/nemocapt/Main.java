package nemocapt;

import nemocapt.interfacetest.calculator.Calculator;
import nemocapt.interfacetest.calculator.SumImpl;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.getTestSum().calculate());
        System.out.println(calculator.getSumImpl().calculate());
        System.out.println(new SumImpl().calculate());
    }
}
