//: TreeMap example

package Collection.Map.TreeMap;

import java.util.*; 

public class Priority {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(35,     "C");
		map.put(12,     "G");
		map.put(134,   "Z");
		map.put(21,     "P");
		map.put(100,  "W");
		map.put(9,        "A");
		map.put(46,     "O");
		
		System.out.println(map);
			// Output: {9=A, 12=G, 21=P, 35=C, 46=O, 100=W, 134=Z} 
		
		}
}