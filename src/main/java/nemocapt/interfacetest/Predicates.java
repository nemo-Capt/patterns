package nemocapt.interfacetest;

import java.util.function.Predicate;

public class Predicates {

    public Predicate<Car> isThisColor(String color) {
        return car -> car.getColor().equalsIgnoreCase(color);
    }

    public Predicate<Car> isCarWIthPrice() {
        return car -> car.getPrice() > 0;
    }
}
