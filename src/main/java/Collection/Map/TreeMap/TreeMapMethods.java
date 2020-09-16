//: TreeMap methods:

//              .put()
//              .get()
//              .remove()
//              .descendingMap() 
//              .tailMap()
//              .headMap()
//              .lastEntry()		
//              .firstEntry()				


package Collection.Map.TreeMap;

import java.util.*;

public class TreeMapMethods {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>(); 
		
// .put()
		map.put(32,  "D");
		map.put(2,     "O");
		map.put(112,"H");
		map.put(6,     "L");
		map.put(45,  "S");
		
		System.out.println(map);
			// Output: {2=O, 6=L, 32=D, 45=S, 112=H}
		
// .get()
		System.out.println("Index map #2 = '" + map.get(2) + "'");
			// Output: Index map #2 = 'O'
		
// .remove()
		map.remove(2);
		System.out.println(map);
			// Output: {6=L, 32=D, 45=S, 112=H}
		
// .descendingMap()
		System.out.println(map.descendingMap());
			// Output: {112=H, 45=S, 32=D, 6=L}
		
// .tailMap()
		System.out.println(map.tailMap(30));
			// Output: {32=D, 45=S, 112=H}
		
// .headMap()
		System.out.println(map.headMap(50));
			// Output: {6=L, 32=D, 45=S}
						
// .lastEntry()		
		System.out.println(map.lastEntry());
			// Output: 112=H
	
// .firstEntry()		
		System.out.println(map.firstEntry());
			// Output: 112=H
				
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
