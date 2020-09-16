//: HashSet example methods.:
//                         .add()
//                         .remove()
//                         .size()
//                         .isEmpty()
//                         .contains()

//                         union: .addAll()
//                         intersect: .retailAll()
//                         subtract: removeAll()


package Collection.Set.HashSet;

import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

// .add()
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(8);
        set.add(123);

        System.out.println(set);
            // Output: [1, 2, 3, 5, 8, 123]

// .remove()
        set.remove(123);
        System.out.println(set);
            // Output: [1, 2, 3, 5, 8]

// .size()
        System.out.println("Size set - " + set.size());
            // Output: Size set - 5

// .isEmpty()
        System.out.println(set.isEmpty());
            // Output: false

// .contains()
        System.out.println(set.contains(2));
            // Output: true
    }
}

class HashSetMethodsNew {
    public static void main(String[] args) {

        Set<Integer> setOne = new HashSet<>();

        setOne.add(2);
        setOne.add(3); //
        setOne.add(5); //
        setOne.add(1);
        setOne.add(8); //

        Set<Integer> setTwo = new HashSet<>();

        setTwo.add(7);
        setTwo.add(4);
        setTwo.add(5); //
        setTwo.add(3); //
        setTwo.add(8); //

// union: .addAll()
        Set<Integer> union = new HashSet<>(setOne);
        union.addAll(setTwo);

        System.out.println(union);
            // Output: [1, 2, 3, 4, 5, 7, 8]

// intersect: .retailAll()
        Set<Integer> intersect = new HashSet<>(setOne);
        intersect.retainAll(setTwo);

        System.out.println(intersect);
        // Output: [3, 5, 8]

// subtract: removeAll()
        Set<Integer> subtract1 = new HashSet<>(setOne);
        subtract1.removeAll(setTwo);

        System.out.println(subtract1);
        // Output: [1, 2]

    // or

        Set<Integer> subtract2 = new HashSet<>(setTwo);
        subtract2.removeAll(setOne);

        System.out.println(subtract2);
        // Output: [4, 7]
    }
}