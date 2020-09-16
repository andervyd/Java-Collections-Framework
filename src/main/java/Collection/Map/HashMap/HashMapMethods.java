//: HashMap methods:
//           .put()
//           .putIfAbsent()
//           .get()
//           .remove()		
//           .containsValue()
//           .containsKey()
//           .keySet()
//           .values()
//           .entrySet()


package Collection.Map.HashMap;

import java.util.*;

public class HashMapMethods {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
// .put()
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		System.out.println(map);
			// Output: {1=A, 2=B, 3=C}
	
// .putIfAbsent()
		map.putIfAbsent(4, "D");
		//map.putIfAbsent(4, "E"); // NOT ADD (key = 4)
		
		map.putIfAbsent(5, "D");
		
		System.out.println(map);
			// Output: {1=A, 2=B, 3=C, 4=D, 5=D}
	
// .get()
		System.out.println(map.get(2));
			// Output: B
		
// .remove()		
		map.remove(5); // delete "5=D"
		System.out.println(map);
			// Output: {1=A, 2=B, 3=C, 4=D}
	
// .containsValue()
		System.out.println(map.containsValue("C"));
			// Output: true
	
		System.out.println(map.containsValue("E"));
			// Output: false
	
// .containsKey()
		System.out.println(map.containsKey(2));
			// Output: true
			
		System.out.println(map.containsKey(6));
			// Output: false
					
// .keySet()
		System.out.println(map.keySet());
			// Output: [1, 2, 3, 4]
		
// .values()
		System.out.println(map.values());
			// Output: [A, B, C, D]
		
// .entrySet()
		System.out.println(map.entrySet());
			// Output: [1=A, 2=B, 3=C, 4=D]
	
		for(Map.Entry<Integer, String> mapEntry : map.entrySet()) {
			System.out.print(mapEntry + " ");
		}
			// Output: 1=A 2=B 3=C 4=D 
		
	}
}