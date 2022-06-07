package nemocapt.interfacetest;

import java.util.List;

public class FilterCarsByCriteriaImpl implements FilterCarsByCriteria {

    @Override
    public List<Car> filterCarsByColor(List<Car> cars, String color) {
        for (Car c : cars) {
            if(!c.getColor().equals(color)){
                cars.remove(c);
            }

        }
        return cars;
    }


}
