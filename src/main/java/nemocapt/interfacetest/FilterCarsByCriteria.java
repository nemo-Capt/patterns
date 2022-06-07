package nemocapt.interfacetest;

import java.util.List;

public interface FilterCarsByCriteria {

    List<Car> filterCarsByColor(List<Car> cars, String color);

}
