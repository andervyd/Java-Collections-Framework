//: LinkedHashMap example

package Collection.Map.LinkedHashMap;

import java.util.*;

public class ABC {
	public static void main(String[] args) {
		
		Map<Integer, String> LHMfalse = new LinkedHashMap<>(16, 0.75f, false);  // default

		LHMfalse.put(21, "G");
		LHMfalse.put(1,    "P");
		LHMfalse.put(56, "X");
		
		System.out.println(LHMfalse.get(1));
			// Output: P
		System.out.println(LHMfalse);
			// Output:{21=G, 1=P, 56=X}
		
		Map<Integer, String> LHMtrue= new LinkedHashMap<>(16, 0.75f, true);
		
		LHMtrue.put(21, "G");
		LHMtrue.put(1,    "P");
		LHMtrue.put(56, "X");
		
		System.out.println(LHMtrue.get(1));
			// Output: P
		System.out.println(LHMtrue);
			// Output:{21=G, 56=X, 1=P}
		
	}
}