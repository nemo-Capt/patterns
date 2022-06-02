package nemocapt.errorhandling.unchecked.impl;

import nemocapt.errorhandling.unchecked.UncheckedExceptionTry;
import nemocapt.errorhandling.unchecked.exception.MyException;

import java.util.List;

public class UncheckedExceptionTryImpl implements UncheckedExceptionTry {

    @Override
    public int calculateSum(List<Integer> integersToSum) throws MyException {
        if (!integersToSum.stream().reduce(Integer::sum).isPresent()) {
            throw new MyException("Empty list");
        } else {
            return integersToSum.stream().reduce(Integer::sum).get();
        }
    }
}
