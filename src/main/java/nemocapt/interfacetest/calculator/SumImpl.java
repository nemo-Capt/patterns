package nemocapt.interfacetest.calculator;

import java.util.Arrays;

public class SumImpl implements Caculatable {

    @Override
    public double calculate(double... a) {
        return Arrays.stream(a).sum();
    }


}
