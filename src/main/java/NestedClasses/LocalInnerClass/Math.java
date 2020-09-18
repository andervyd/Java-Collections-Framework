//: Local inner class example

package NestedClasses.LocalInnerClass;

public class Math {

    private int var;

    public void getResult() {

        class Division {

            private int divident;
            private int divider;
            private String div = "\u00F7";

            public void methodCallPrivateVar() {
                System.out.println(var);          // call var top class
            }

            public int getDivident() {
                return divident;
            }

            public void setDivident(int divident) {
                this.divident = divident;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public String getDiv() {
                return div;
            }

            public int getDivisionResult() {
                return divident / divider;
            }

            public int getRemainder() {
                return divident % divider;
            }
        }

        Division division = new Division();
        division.setDivident(21);
        division.setDivider(4);
        System.out.print(division.getDivident() + " " + division.getDiv() + " " + division.getDivider()
                + " = " + division.getDivisionResult() + " (remaider = " + division.getRemainder() + ")");
    }
}

class Output {
    public static void main(String[] args) {

        Math divisionMath = new Math();
        divisionMath.getResult();
    }
}/* Output:
            21 ÷ 4 = 5 (remaider = 1)
*///:~