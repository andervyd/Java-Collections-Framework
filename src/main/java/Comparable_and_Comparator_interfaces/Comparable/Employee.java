//: implements Comparable and override method

package Comparable_and_Comparator_interfaces.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	
	private int id;
//	private Integer id;
	private String first_name;
	private String last_name;
	private int salary;
	
	public Employee(int id, String first_name, String last_name, int salary) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		
		return "Employee: "+ "\n" 
	           + "  id: " + id + ", "
			   + "first name: " + first_name + ", "
			   + "last name: " + last_name + ", "
			   + "salary: " + salary + ";" 
			   + "\n";
	}	
		
	public int compareTo(Employee emp) {
		return this.id - emp.id;
	}
	
//    public int compareTo(Employee emp) {   // sort 'id'
//		if(this.id == emp.id) 
//			return 0;
//		else if(this.id < emp.id)
//			return -1;
//		else return 1;
//	} 
	
//	public int compareTo(Employee emp) {   // sort 'id'
//		return this.id.compareTo(emp.id);
//	}
	
//	public int compareTo(Employee emp) {   // sort 'name' (if first_name == first_name => sort last_name)
//		int res = this.first_name.compareTo(emp.first_name);
//		
//		if(res == 0)
//			res = this.last_name.compareTo(emp.last_name);
//		return res;
//	}
	
}


class Output {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee employee_1 = new Employee(14,   "Zaur", "Tregulov", 2300);
		Employee employee_2 = new Employee(2,    "Ivan", "Tara",     2600);
		Employee employee_3 = new Employee(315,  "John", "Snow",     1800);
		Employee employee_4 = new Employee(1456, "Petr", "Verhovez", 4200);
		Employee employee_5 = new Employee(64,   "Ivan", "Tara",     2600);
		
		list.add(employee_1);
		list.add(employee_2);
		list.add(employee_3);
		list.add(employee_4);
		list.add(employee_5);
		
		System.out.println("Default sorting: ");
		System.out.println(list);
		
//		but:
//		Collections.sort(list); -- NOT WORK

//		implements Comparable<Employee> and @Override
	
		Collections.sort(list);
		
		System.out.println("Collections sorting 'id': ");
		System.out.println(list);

//		System.out.println("Collections sorting 'name': ");
//		System.out.println(list);

	}
}/* Output:
			Default sorting: 
			[Employee: 
			  id: 14, first name: Zaur, last name: Tregulov, salary: 2300;
			, Employee: 
			  id: 2, first name: Ivan, last name: Tara, salary: 2600;
			, Employee: 
			  id: 315, first name: John, last name: Snow, salary: 1800;
			, Employee: 
			  id: 1456, first name: Petr, last name: Verhovez, salary: 4200;
			, Employee: 
			  id: 64, first name: Ivan, last name: Tara, salary: 2600;
			]
			
			Collections sorting 'id': 
			[Employee: 
			  id: 2, first name: Ivan, last name: Tara, salary: 2600;
			, Employee: 
			  id: 14, first name: Zaur, last name: Tregulov, salary: 2300;
			, Employee: 
			  id: 64, first name: Ivan, last name: Tara, salary: 2600;
			, Employee: 
			  id: 315, first name: John, last name: Snow, salary: 1800;
			, Employee: 
			  id: 1456, first name: Petr, last name: Verhovez, salary: 4200;
			]

			Collections sorting 'name': 
			[Employee: 
			  id: 2, first name: Ivan, last name: Tara, salary: 2600;
			, Employee: 
			  id: 64, first name: Ivan, last name: Tara, salary: 2600;
			, Employee: 
			  id: 315, first name: John, last name: Snow, salary: 1800;
			, Employee: 
			  id: 1456, first name: Petr, last name: Verhovez, salary: 4200;
			, Employee: 
			  id: 14, first name: Zaur, last name: Tregulov, salary: 2300;
			]
*///:~