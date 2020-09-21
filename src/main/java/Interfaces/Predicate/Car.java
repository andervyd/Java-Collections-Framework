//: Interface Predicate<T>

package Interfaces.Predicate;

import java.util.*;
import java.util.function.Predicate;

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

    public void sortCarForColor(ArrayList<Car> list, Predicate<Car> sort) {
        for (Car car : list) {
            if(sort.test(car)) {
                System.out.println(car);
            }
        }
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

        Output sortColor = new Output();

        sortColor.sortCarForColor(carList, car -> car.getColor().equals("black"));
            // Output: Car #4 [color: black, door: 4, engineCapacity: V12]

        sortColor.sortCarForColor(carList, car -> car.getEngineCapacity() > 6);
            // Output: Car #5 [color: red, door: 2, engineCapacity: V8]
            //         Car #6 [color: black, door: 4, engineCapacity: V12]


    }
}









