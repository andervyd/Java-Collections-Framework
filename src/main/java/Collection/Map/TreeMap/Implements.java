//: TreeMap implements Comparable

package Collection.Map.TreeMap;

import java.util.*;


class Students implements Comparable<Students> {
	
	private String name;
	private int course;
	
	public Students(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "\n Students name student=" + name
									   + ", course=" + course + ", id";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Students students) {
		return this.course - students.course;
	}
}


public class Implements {
	public static void main(String[] args) {
		
		Students st1 = new Students("Ivan", 3);
		Students st2 = new Students("Petr", 2);
		Students st3 = new Students("Alex", 5);
		Students st4 = new Students("Oleg", 4);
		Students st5 = new Students("Mary", 6);
		
		Map<Students, Integer> map = new TreeMap<>();
		
		map.put(st1, 21);
		map.put(st2, 34);
		map.put(st3, 8);
		map.put(st4, 12);
		map.put(st5, 98);
		
		System.out.println(map);      // sort: course
			// Output:  Students name student=Petr, course=2, id=34, 
		    //                    Students name student=Ivan, course=3, id=21, 
			//                	Students name student=Oleg, course=4, id=12, 
			//	                Students name student=Alex, course=5, id=8, 
			//	                Students name student=Mary, course=6, id=98
		
		Map<Students, Integer> map2 = new TreeMap<>(new Comparator<Students> () {

			@Override
			public int compare(Students st1, Students st2) {
				return st1.getName().compareTo(st2.getName());
			}
		});
				
		map2.put(st1, 21);
		map2.put(st2, 34);
		map2.put(st3, 8);
		map2.put(st4, 12);
		map2.put(st5, 98);
		
		System.out.println(map2);   // sort: name
			// Output: Students name student=Alex, course=5, id=8, 
		    //                   Students name student=Ivan, course=3, id=21, 
			//  	               Students name student=Mary, course=6, id=98, 
			//	               Students name student=Oleg, course=4, id=12, 
			//	               Students name student=Petr, course=2, id=34
	}
}