package nemocapt.errorhandling.unchecked;

import nemocapt.errorhandling.unchecked.exception.MyException;
import nemocapt.errorhandling.unchecked.impl.UncheckedExceptionTryImpl;
import nemocapt.errorhandling.unchecked.impl.UncheckedExceptionTryV2Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UncheckedExceptionTryRun {


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> emptyIntegers = new ArrayList<>();
        UncheckedExceptionTry uncheckedExceptionTry = new UncheckedExceptionTryImpl();
        UncheckedExceptionTry uncheckedExceptionTryV2 = new UncheckedExceptionTryV2Impl();
        try {
            System.out.println(uncheckedExceptionTry.calculateSum(integers));
            System.out.println(uncheckedExceptionTryV2.calculateSum(emptyIntegers));
            System.out.println(uncheckedExceptionTry.calculateSum(emptyIntegers));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(uncheckedExceptionTryV2.calculateSum(null));
        } catch (NullPointerException | MyException e) {
            System.out.println(e);
        }
    }
}
