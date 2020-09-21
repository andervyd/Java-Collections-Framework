//: Consumer<T>
//              void accept(T t);

package Interfaces.Consumer;

import java.util.*;
import java.util.function.Consumer;

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

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
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

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {

        Car car1 = new Car("red", 2, 8);
        Car car2 = new Car("black", 4, 12);
        Car car3 = new Car("white", 5, 6);

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for (Car car : carList) {
            System.out.println(car);
        }
        // Output: Car #1 [color: red,   door: 2, engineCapacity: V8]
        //         Car #2 [color: black, door: 4, engineCapacity: V12]
        //         Car #3 [color: white, door: 5, engineCapacity: V6]

        System.out.println(car1);
            // output: Car #4 [color: red, door: 2, engineCapacity: V8]

        changeCar(carList.get(0), carConsumer -> { carConsumer.setColor("black"); carConsumer.setDoorCount(4);});

        System.out.println(car1);
            // output: Car #5 [color: black, door: 4, engineCapacity: V8]

    }
}