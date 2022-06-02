package nemocapt.errorhandling.unchecked;

import nemocapt.errorhandling.unchecked.exception.MyException;

import java.util.List;

public interface UncheckedExceptionTry {

    int calculateSum(List<Integer> integersToSum) throws MyException;
}
