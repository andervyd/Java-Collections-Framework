//: Supplier<T>
//              T get();

package Interfaces.Supplier;

import java.util.*;
import java.util.function.Supplier;

public class Car {

    private String color;
    private int doorCount;
    private int engineCapacity;
    private static int countCar = 1;

    public Car(String color, int doorCount, int engineCapacity) {
        this.color = color;
        this.doorCount = doorCount;
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car #" + countCar++ +
                " [color: " + color +
                ", door: " + doorCount +
                ", engineCapacity: V" + engineCapacity
                + "]";
    }
}

class Output {

    public static ArrayList<Car> createCars(Supplier<Car> carSupplier) {

        ArrayList<Car> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Car> ourCarList = createCars(() -> new Car("black", 2, 12));
        System.out.println(ourCarList);
            // Output: [Car #1 [color: black, door: 2, engineCapacity: V12], Car #2 [color: black, door: 2, engineCapacity: V12], Car #3 [color: black, door: 2, engineCapacity: V12]]

    }
}