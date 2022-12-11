package patterns.builder;

public class Car {

    private String name;
    private String colour;
    private double engineDisplacement;
    private String type;
    private int hp;
    private String torque;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", engineDisplacement=" + engineDisplacement +
                ", type='" + type + '\'' +
                ", hp=" + hp +
                ", torque='" + torque + '\'' +
                '}';
    }

    public static class Builder {

        private Car car;

        public Builder(String name) {
            this.car = new Car();
            this.car.setName(name);
        }

        public Builder addColour(String colour) {
            this.car.setColour(colour);
            return this;
        }

        public Builder addEngineDisplacement(double engineDisplacement) {
            this.car.setEngineDisplacement(engineDisplacement);
            return this;
        }

        public Builder addType(String type) {
            this.car.setType(type);
            return this;
        }

        public Builder addHp(int hp) {
            this.car.setHp(hp);
            return this;
        }

        public Builder addTorque(String torque) {
            this.car.setTorque(torque + " Nm");
            return this;
        }

        public Car build() {
            return this.car;
        }
    }
}
