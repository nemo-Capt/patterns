package nemocapt.interfacetest;

public class Car {
    private int wheels;
    private double engineDisplacement;
    private String color;
    private int price;

    public Car(int wheels, double engineDisplacement, String color, int price) {
        this.wheels = wheels;
        this.engineDisplacement = engineDisplacement;
        this.color = color;
        this.price = price;
    }

    public Car() {
        this.wheels = 4;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
