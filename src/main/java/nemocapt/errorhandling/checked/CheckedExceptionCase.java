package nemocapt.errorhandling.checked;

import java.util.Scanner;

public class CheckedExceptionCase {

    public int whatIsTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

}
