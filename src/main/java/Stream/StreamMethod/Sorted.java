//: Stream method .sorted() (intermediate)

package Stream.StreamMethod;

import java.util.*;

class Car {

    private String color;
    private int door;
    private int age;

    public Car(String color, int door, int age) {
        this.color = color;
        this.door = door;
        this.age = age;
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

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", age=" + age +
                '}';
    }
}

public class Sorted {
    public static void main(String[] args) {

// sorted array

        int[] array = {-3, 8, 2, 0, -4, 12};

        array = Arrays.stream(array).sorted().toArray();

        System.out.println(Arrays.toString(array));
            // Output: [-4, -3, 0, 2, 8, 12]

// sorted simple List

        List<Integer> list = List.of(-3, 8, 2, 0, -4, 12);

        list.stream().sorted().forEach(element ->
                System.out.print(element + " "));
            // Output: -4 -3 0 2 8 12

        System.out.println();

// sorted List

        Car car1 = new Car("white", 4, 1995);
        Car car2 = new Car("black", 5, 2005);
        Car car3 = new Car("red", 2, 1982);

        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        carList.stream().sorted((element1, element2) ->
                element1.getAge() - element2.getAge()).forEach(car ->
                System.out.println(car));
            // Output: Car{color='red', door=2, age=1982}
            //         Car{color='white', door=4, age=1995}
            //         Car{color='black', door=5, age=2005}



    }
}
