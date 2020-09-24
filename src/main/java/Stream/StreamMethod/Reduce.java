//: Stream method .reduce() (terminal)

package Stream.StreamMethod;

import java.util.*;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list = List.of(4, 7, 2, 9, 4);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();

        System.out.println(result);
            // Output: 2016

// Exception: NoSuchElementException

//        List<Integer> nullList = new ArrayList<>();
//
//        int nullResult = nullList.stream().reduce((accumulator, element) ->
//                accumulator * element).get();
//
//        System.out.println(nullList); // exception

// Optional

        List<Integer> optionalList = new ArrayList<>();

        Optional<Integer> optional = optionalList.stream().reduce((accumulator, element) ->
                accumulator * element);

        if(optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present");
        }
            // Output: Not present

// Identity accumulator:

        List<Integer> identityList = list;

        int identitytResult = identityList.stream().reduce(1, (accumulator, element) ->
                accumulator * element);

        System.out.println(identitytResult);
        // Output: 2016


    }
}
