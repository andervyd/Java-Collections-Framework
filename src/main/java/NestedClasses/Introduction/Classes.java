//: Types of classes

package NestedClasses.Introduction;

public class Classes {                      // External class (top level)
    
    // some code ...

    static class SomeStaticClass {          // static class

        // some code ...

    }

    class SomeClass {                       // inner class

        // some code ...

    }

    void someMethod() {

        // some code ...

        class SomeClass {                   // local class

            // some code ...

        }
    }

    public static void main(String[] args) {

        Classes anonymousClass = new Classes() { // anonymous class

                /// some code ...
        };

     }

}