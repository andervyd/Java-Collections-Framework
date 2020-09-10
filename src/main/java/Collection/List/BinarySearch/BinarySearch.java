// .binarySearch() example

package Collection.List.BinarySearch;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		
		int search = 42;
		int index;
		
		List<Integer> list = new ArrayList<>();

		list.add(-3);
		list.add(0);
		list.add(12);
		list.add(98);
		list.add(-28);
		list.add(-123);
		list.add(67);
		list.add(42);
		list.add(-1);
		list.add(92);

//		Random random = new Random();

//		for(int i = 0; i <= 100; i++) {
//			list.add(i, random.nextInt(65536)-32768);
//		}
		
		System.out.println(list);
			// Output: [-3, 0, 12, 98, -28, -123, 67, 42, -1, 92]
		
		Collections.sort(list);
		System.out.println(list);
			// Output: [-123, -28, -3, -1, 0, 12, 42, 67, 92, 98]
		
//		Collections.reverse(list);
//		System.out.println(list);
//			// Output: [98, 92, 67, 42, 12, 0, -1, -3, -28, -123]

		Collections.shuffle(list);
		System.out.println(list);
			// Output: [98, 92, 67, 42, 12, 0, -1, -3, -28, -123]

		
		index = Collections.binarySearch(list, search);
		System.out.println("Index number " + search + " - " + index);
	
	}
}