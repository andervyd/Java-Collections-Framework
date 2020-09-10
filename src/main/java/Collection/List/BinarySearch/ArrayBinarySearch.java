// .binarySearch() example array[]

package Collection.List.BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class ArrayBinarySearch {
	public static void main(String[] args) {
	
		String[] stringArray = {"A","Y","H","D","K","F","G","Z"};
		
		System.out.println(Arrays.toString(stringArray));
			// Output: [A, Y, H, D, K, F, G, Z]
		
		Arrays.sort(stringArray);
	
		System.out.println(Arrays.toString(stringArray));
		// Output: [A, D, F, G, H, K, Y, Z]
	
		int index = Arrays.binarySearch(stringArray, "F");
		
		System.out.println("Index letter 'F' - " + index);
			// Output: Index letter 'F' - 2
		
	}
}