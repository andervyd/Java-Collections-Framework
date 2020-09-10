// .binarySearch() example

package Collection.List.BinarySearch;

import java.util.*;

class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", salary: " + salary + "\n";
	}

	@Override
	public int compareTo(Employee employee) {
		int result = this.salary - employee.salary;
		return result;
	}
}


public class SearchSalary {
	public static void main(String[] args) {
				
		Employee emp1 = new Employee(12,  "Petr",  23000);
		Employee emp2 = new Employee(14,  "Mary",  20500);
		Employee emp3 = new Employee(76,  "Sveta", 16000);
		Employee emp4 = new Employee(23,  "Sasha", 8000);
		Employee emp5 = new Employee(78,  "Alex",  21000);
		Employee emp6 = new Employee(110, "Zaur",  32000);
		Employee emp7 = new Employee(32,  "Oleg",  12000);
		Employee emp8 = new Employee(147, "John",  9500);
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		
		System.out.println(employeeList);
			// Output: id: 12,  name: Petr,  salary: 23000
		    //         id: 14,  name: Mary,  salary: 20500
		    //         id: 76,  name: Sveta, salary: 16000
		    //         id: 23,  name: Sasha, salary: 8000
		    //         id: 78,  name: Alex,  salary: 21000
		    //         id: 110, name: Zaur,  salary: 32000
		    //         id: 32,  name: Oleg,  salary: 12000
	    	//         id: 147, name: John,  salary: 9500
		
		Collections.sort(employeeList);
		
		System.out.println(employeeList);
		
		int index = Collections.binarySearch(employeeList, 
				    	new Employee(12,  "Petr",  23000));
		
		System.out.println("Index employee: " + employeeList.get(index).getName() + " = " + index);
		
	}
}