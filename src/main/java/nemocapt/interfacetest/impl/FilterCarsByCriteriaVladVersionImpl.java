package nemocapt.interfacetest.impl;

import nemocapt.interfacetest.Car;
import nemocapt.interfacetest.FilterCarsByCriteria;
import nemocapt.interfacetest.Predicates;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCarsByCriteriaVladVersionImpl implements FilterCarsByCriteria {

    private Predicates predicates;

    @Override
    public List<Car> filterCarsByColor(List<Car> cars, String color) {
        return cars.stream()
                .filter(this.predicates.isThisColor(color))
                .collect(Collectors.toList());
    }

    public void setPredicates(Predicates predicates) {
        this.predicates = predicates;
    }
}
