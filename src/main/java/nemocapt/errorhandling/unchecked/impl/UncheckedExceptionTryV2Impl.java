package nemocapt.errorhandling.unchecked.impl;

import nemocapt.errorhandling.unchecked.UncheckedExceptionTry;

import java.util.List;

public class UncheckedExceptionTryV2Impl implements UncheckedExceptionTry {

    @Override
    public int calculateSum(List<Integer> integersToSum) {
        return integersToSum.stream().reduce(0, Integer::sum);
    }
}
