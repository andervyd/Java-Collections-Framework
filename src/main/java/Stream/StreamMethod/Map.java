//: Stream method .map() (intermediate)

package Stream.StreamMethod;

import java.util.*;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("goodby");
        list.add("hello");
        list.add("welcome");
        list.add("thanks");
        list.add("what?");

        System.out.println(list);
            // Output: [goodby, hello, welcome, thanks, what?]

//        for(int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

//        System.out.println(list);
//            // Output: [6, 5, 7, 6, 5]

// list stream:

        List<Integer> listToInt = list.stream().map(replaceToInt -> replaceToInt.length()).collect(Collectors.toList());

        System.out.println(listToInt);
            // Output: [6, 5, 7, 6, 5]

// array stream:

        int[] array = {4, 6, 1, 9, 7};

        array = Arrays.stream(array).map(stream -> {
            if(stream % 3 == 0) {
                stream = stream / 3;
            }
            return stream;
            }).toArray();

        for (Integer arrayList : array) {
            System.out.print(arrayList + " ");
        };
            // Output: [6, 5, 7, 6, 5]
            //         [4, 2, 1, 3, 7]

        System.out.println(Arrays.toString(array));
            // Output: [4, 2, 1, 3, 7]

// set stream:

         Set<String> set = new TreeSet<>();

         set.add("goodby");
         set.add("hello");
         set.add("welcome");
         set.add("thanks");
         set.add("what?");

        System.out.println(set);
            // Output: [goodby, hello, thanks, welcome, what?]

        Set<Integer> setInt = set.stream().map(element -> {
            return element.length();
        }).collect(Collectors.toSet());

        System.out.println(setInt);
            // Output: [5, 6, 7]  !!! (6(x), 5(x), 7, 6, 5)



    }
}
