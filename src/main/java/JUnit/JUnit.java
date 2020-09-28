package JUnit;

import java.util.*;

public class JUnit {
    public static void main(String[] args) {

        Car car1 = new Car("red", 4, 1994, 6);
        Car car2 = new Car("white", 4, 1998, 6);
        Car car3 = new Car("black", 2, 1982, 12);
        Car car4 = new Car("red", 5, 2001, 8);
        Car car5 = new Car("black", 4, 1999, 8);

        List<Car> list = new ArrayList<>();

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        list.stream().forEach(System.out::println);
            // Output: Car #1 color: red, door: 4, age: 1994, engine: V6
            //         Car #2 color: white, door: 4, age: 1998, engine: V6
            //         Car #3 color: black, door: 2, age: 1982, engine: V12
            //         Car #4 color: red, door: 5, age: 2001, engine: V8
            //         Car #5 color: black, door: 4, age: 1999, engine: V8

        System.out.println("----------------------------------------------------");

        Car.sortCar(list);
            // Output: Car #6 color: black, door: 2, age: 1982, engine: V12
            //         Car #7 color: black, door: 4, age: 1999, engine: V8


    }
}

class Car {

    private String color;
    private int door;
    private int age;
    private int engine;
    static int countCar = 1;

    public Car(String color, int door, int age, int engine) {
        this.color = color;
        this.door = door;
        this.age = age;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public int getAge() {
        return age;
    }

    public int getEngine() {
        return engine;
    }

    public static void sortCar(List<Car> list) {
        for(Car carList : list) {
            if(carList.getColor().equals("black")) {
                System.out.println(carList);;
            }
        }
    }

    @Override
    public String toString() {
        return "Car #" + countCar++ +
                " color: " + color +
                ", door: " + door +
                ", age: " + age +
                ", engine: V" + engine;
    }
}
