//: Predicate methods:
//                .and()
//                .or()
//                .negate()

package Interfaces.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class PredicateMethods {

    public void sortMethod(ArrayList<Car> carList, Predicate<Car> carPredicate) {
        for(Car carSort : carList) {
            if(carPredicate.test(carSort)) {
                System.out.println(carSort);;
            }
        }
    }

    public static void main(String[] args) {

        Car car1 = new Car("red",   2, 8);
        Car car2 = new Car("black", 4, 12);
        Car car3 = new Car("white", 5, 6);
        Car car4 = new Car("white", 4, 12);
        Car car5 = new Car("red", 4, 12);
        Car car6 = new Car("black",   3, 6);

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        for (Car car : carList) {
            System.out.println(car);
        }
            // Output: Car #1 [color: red,   door: 2, engineCapacity: V8]
            //         Car #2 [color: black, door: 4, engineCapacity: V12]
            //         Car #3 [color: white, door: 5, engineCapacity: V6]
            //         Car #4 [color: white, door: 4, engineCapacity: V12]
            //         Car #5 [color: red,   door: 4, engineCapacity: V12]
            //         Car #6 [color: black, door: 3, engineCapacity: V6]

        System.out.println("-------------------------------------------------");

        PredicateMethods sortCarPredicate = new PredicateMethods();

        Predicate<Car> sortColor = prColor -> prColor.getColor().equals("black");
        sortCarPredicate.sortMethod(carList, sortColor);
            // Output: Car #7 [color: black, door: 4, engineCapacity: V12]
            //         Car #8 [color: black, door: 3, engineCapacity: V6]

        System.out.println("-------------------------------------------------");

        Predicate<Car> sortEngine = prEngine -> prEngine.getEngineCapacity() == 6;
        sortCarPredicate.sortMethod(carList, sortEngine);
            // Output: Car #9 [color: white,  door: 5, engineCapacity: V6]
            //         Car #10 [color: black, door: 3, engineCapacity: V6]

        System.out.println("----------------------- .and() -----------------------");

        sortCarPredicate.sortMethod(carList, sortColor.and(sortEngine));
            // Output: Car #11 [color: black, door: 3, engineCapacity: V6]

        System.out.println("------------------------ .or() ------------------------");

        sortCarPredicate.sortMethod(carList, sortColor.or(sortEngine));
            // Output: Car #12 [color: black, door: 4, engineCapacity: V12]
            //         Car #13 [color: white, door: 5, engineCapacity: V6]
            //         Car #14 [color: black, door: 3, engineCapacity: V6]

        System.out.println("-------------------- .negate() --------------------");

        sortCarPredicate.sortMethod(carList, sortEngine.negate());
            // Output: Car #15 [color: red,   door: 2, engineCapacity: V8]
            //         Car #16 [color: black, door: 4, engineCapacity: V12]
            //         Car #17 [color: white, door: 4, engineCapacity: V12]
            //         Car #18 [color: red,   door: 4, engineCapacity: V12]

    }
}
