//: Example HashMap (key, value)

package Collection.Map.HashMap;

import java.util.*;

public class PassportData {
	
	private int serial;
	private String firstName;
	
	public PassportData(int serial, String firstName) {
		this.serial = serial;
		this.firstName = firstName;
	}

	public int getSerial() {
		return serial;
	}

	public String getFirstName() {
		return firstName;

	}
}


class PrintPassportData {
	public static void main(String[] args) {
		
		PassportData pd1 = new PassportData(454256, "Ivan");
    	PassportData pd2 = new PassportData(732574, "Mary");
		PassportData pd3 = new PassportData(371936, "Oleg");
		
		Map<Integer, String> mapPD = new HashMap<>();
		
		mapPD.put(pd1.getSerial(), pd1.getFirstName());
		mapPD.put(pd2.getSerial(), pd2.getFirstName());
		mapPD.put(pd3.getSerial(), pd3.getFirstName());
		
		System.out.println(mapPD);
			// Output: {732574=Mary, 371936=Oleg, 454256=Ivan}
		
		Map<Integer, String> mapEx = new HashMap<>();
		
//		mapEx.put(342189, "Alex");   // NOT ADD (key, "Koly")
		mapEx.put(342189, "Koly");
		
		mapEx.put(null,   "Masha");
//		mapEx.put(null,    null);    // NOT ADD (key, null)

		mapEx.put(725378,  null);
		
		System.out.println(mapEx);
			// Output: {null=Masha, 342189=Koly, 725378=null}
		
		
		
	}
}