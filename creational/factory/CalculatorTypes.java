package patterns.creational.factory;

public enum CalculatorTypes {

    ADDITION("+"),
    DIVISION("/"),
    MULTIPLICATION("*"),
    SUBTRACTION("-");

    public final String stringValue;

    CalculatorTypes(String stringValue) {
        this.stringValue = stringValue;
    }
}
