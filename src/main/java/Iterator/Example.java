// Interface Iterator:
//      With an iterator, you can remove an element (in foreach, not)
//          hasNext() - if there is an item in the list
//          next()    - next element
//          remove()  - delete element

// ONE LIFE !!!

package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("32");
        list.add("2");
        list.add("5");
        list.add("12");
        list.add("67");
        list.add("99");

        Iterator<String> iterator = list.iterator();

// hasNext(); next();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
            // Output: 32 2 5 12 67 99

// remove();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}