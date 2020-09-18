//: Inner class: example

package NestedClasses.InnerClass;

public class NewCar {

    private String color;
    private int doorCount;
    Engine engine;
    private static int countCar = 1;

    public NewCar(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public class Engine {                   // inner class

        private int horsepower;

//        private static int count;         // static variable NOT WORK
        private final static int COUNT = 1;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void someMethod() {

            System.out.println(color);      // private variable top class
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

    public void someMethod() {
        Engine engine = new Engine(2500);
        System.out.println(engine.horsepower);  // private variable inner class
    }

    public String getColor() {
        return color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car #" + countCar++ + " color: " + color +
                ", doorCount: " + doorCount
                + engine;
    }
}

class NewOutput {
    public static void main(String[] args) {

        NewCar car1 = new NewCar("red",   4);
        NewCar.Engine engine1 = car1.new Engine(2500);
        car1.setEngine(engine1);

//        NewCar.Engine engine2 = new NewCar("black", 2).new Engine(4600);

        NewCar car2 = new NewCar("black",   2);
        NewCar.Engine engine2 = car2.new Engine(4600);
        car2.setEngine(engine2);

        NewCar car3 = new NewCar("blue",   5);
        NewCar.Engine engine3 = car3.new Engine(1500);
        car3.setEngine(engine3);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}/* Output:
            Car #1 color: red,   doorCount: 4, horsepower: 2500 hp.
            Car #2 color: black, doorCount: 2, horsepower: 4600 hp.
            Car #3 color: blue,  doorCount: 5, horsepower: 1500 hp.
*///:~