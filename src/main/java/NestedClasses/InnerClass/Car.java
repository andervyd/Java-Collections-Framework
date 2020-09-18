//: Inner class: example

package NestedClasses.InnerClass;

public class Car {

    private String color;
    private int doorCount;
    Engine engine;
    private static int countCar = 1;

    public Car(String color, int doorCount, int horsepower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsepower);
    }

    public class Engine {                   // inner class

        private int horsepower;
        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return ", horsepower: " + horsepower +
                    " hp.";
        }
    }

    public String getColor() {
        return color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public String toString() {
        return "Car #" + countCar++ + " color: " + color +
                ", doorCount: " + doorCount
                + engine;
    }
}

class Output {
    public static void main(String[] args) {

        Car car1 = new Car("red",   4, 2500);
        Car car2 = new Car("black", 2, 4600);
        Car car3 = new Car("blue",  5, 1500);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}/* Output:
            Car #1 color: red, doorCount: 4, horsepower: 2500 hp.
            Car #2 color: black, doorCount: 2, horsepower: 4600 hp.
            Car #3 color: blue, doorCount: 5, horsepower: 1500 hp.
*///:~