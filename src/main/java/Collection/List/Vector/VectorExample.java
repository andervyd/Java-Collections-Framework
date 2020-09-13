//: Vector example and
//       his methods:
//                   .add()
//                   .get()
//                   .remove()
//                   .firstElement()
//                   .lastElement()


package Collection.List.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vectorString = new Vector<>();

        // .add()
        vectorString.add("A");
        vectorString.add("B");
        vectorString.add("C");
        vectorString.add("D");
        vectorString.add("E");

        System.out.println(vectorString);
            // Output: [A, B, C, D, E]

        // .firstElement()
        System.out.println(vectorString.firstElement());
            // Output: A
        
        // .lastElement()
        System.out.println(vectorString.lastElement());
            // Output: E

        // .remove()
        vectorString.remove(2);

        // .get()
        System.out.println(vectorString.get(1));
            // Output: B

    }
}