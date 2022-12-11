package patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car.Builder("Mercedes CLS W212")
                .addColour("Yellow")
                .addEngineDisplacement(2.0)
                .build();
        Car vw = new Car.Builder("Volkswagen Beetle")
                .addColour("White")
                .addType("Convertible")
                .build();
        System.out.println(mercedes);
        System.out.println(vw);
    }
}
