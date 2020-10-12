package IOAndNIO.Serialization.ProgOutput;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private String color;
    private static int count = 1;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Car #" + count++
                + ", model: " + model
                + ", color: " + color;
    }
}
