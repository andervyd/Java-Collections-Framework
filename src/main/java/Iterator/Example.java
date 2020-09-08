// Interface Iterator:
//      With an iterator, you can remove an element (in foreach, not)
//          hasNext() - if there is an item in the list
//          next()    - next element
//          remove()  - delete element

package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("32");
//        list.add("2");
//        list.add("5");
//        list.add("12");
//        list.add("67");
//        list.add("99");
//
//        Iterator<String> iterator = list.iterator();
//
//// hasNext(); next();
//        while(iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//            // Output: 32 2 5 12 67 99
//
//// remove();
//        while(iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }
//
//        System.out.println("\n" + "-------- V1 --------");
//
//        while(iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        System.out.println("-------- V2 --------");
//
//        for (String i : list) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\n" + "-------- V3 --------");
//
//        System.out.println(list);
//////////////////////////////////////////////////
//
//        ArrayList<String> aList = new ArrayList<>();
//
//        aList.add("Apple");
//        aList.add("Mango");
//        aList.add("Guava");
//        aList.add("Orange");
//        aList.add("Peach");
//
//        System.out.println("The ArrayList elements are: ");
//
//        for (String s: aList) {
//            System.out.println(s);
//        }
//
//        Iterator i = aList.iterator();
//
//        while (i.hasNext()) {
//            i.next();
//            i.remove();
//        }
//
//        System.out.println("\n" + "-------- V1 --------");
//
//        while(i.hasNext()) {
//        System.out.print(i.next() + " ");
//        }
//
//        System.out.println("-------- V2 --------");
//
//        for (String s : aList) {
//            System.out.print(s + " ");
//        }
//
//        System.out.println("\n" + "-------- V3 --------");
//
//        System.out.println(aList);
//////////////////////////////////////////////////////////

        List<String> list = new ArrayList<>();

        list.add("Ivan");
        list.add("Petr");
        list.add("Mary");
        list.add("Oleg");

        System.out.println("-------- V0 --------");
        for(String s : list) {
            System.out.print(s + " ");
        }

        Iterator<String> iterator = list.iterator();

        System.out.println("\n-------- V1 --------");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("\n-------- V2 --------");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("-------- V3 --------");
        for (String s : list) {
            System.out.println(s + " ");
        }

        System.out.println("-------- V4 --------");
        System.out.println(list);










    }
}
