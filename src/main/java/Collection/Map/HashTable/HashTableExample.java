//: HashTable example (synchronized)

package Collection.Map.HashTable;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		
		Map<Integer, String> hashTable = new Hashtable<>();
		
		hashTable.put(23, "G");
		hashTable.put(12, "U");
		hashTable.put(76, "M");
		hashTable.put(1,    "X");
		hashTable.put(13,  "I");
//		hashTable.put(null,    "X");            // Exception: NullPointerException
//		hashTable.put(44,  null);               // Exception: NullPointerException
		
		System.out.println(hashTable);
			// Output: {76=M, 13=I, 1=X, 12=U, 23=G}
	}
}
