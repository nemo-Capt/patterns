package nemocapt.interfacetest.calculator;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Calculator {
    //TODO Need to add subtraction, multiplication, division as lambdas
    Caculatable sum = (double... a) -> Arrays.stream(a).sum();
    Caculatable testSum = (double... a) -> {
        OptionalDouble optionalDouble = Arrays.stream(a).reduce((iter1, iter2) -> (iter1 + iter2));
        if(optionalDouble.isPresent()){
            return optionalDouble.getAsDouble();
        }
        return 0;
    };

    Caculatable sumImpl = new SumImpl();


        public Caculatable getSum() {
        return sum;
    }

    public void setSum(Caculatable sum) {
        this.sum = sum;
    }

    public Caculatable getTestSum() {
        return testSum;
    }

    public void setTestSum(Caculatable testSum) {
        this.testSum = testSum;
    }

    public Caculatable getSumImpl() {
        return sumImpl;
    }

    public void setSumImpl(Caculatable sumImpl) {
        this.sumImpl = sumImpl;
    }
}
