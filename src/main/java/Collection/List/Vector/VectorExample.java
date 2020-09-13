// Vector example and
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

        vectorString.add("A");
        vectorString.add("B");
        vectorString.add("C");
        vectorString.add("D");
        vectorString.add("E");

        System.out.println(vectorString);
            // Output: [A, B, C, D, E]

        System.out.println(vectorString.firstElement());
            // Output: A
        System.out.println(vectorString.lastElement());
            // Output: E

        vectorString.remove(2);

        System.out.println(vectorString.get(1));
            // Output: B



    }
}
