package KlasyIinterfejsy.Ex3;

import lombok.Data;

@Data
public class Car {
    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        engine = new Car.Engine();
        engine.setEngineType(type);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine {

        private String engineType;

        public void setEngineType(String carType) {
            switch (carType) {
                case "economy":
                    engineType = "diesel";
                    break;
                case "luxury":
                    engineType = "electric";
                    break;
                default:
                    engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }


}
