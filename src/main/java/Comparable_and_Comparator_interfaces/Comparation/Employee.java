//: implements Comparable and override method

package Comparable_and_Comparator_interfaces.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
	
	private int id;
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
}


class IdComparator implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		return emp1.getId() - emp2.getId();	}
	}


class NameComparator implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		int res = emp1.getFirst_name().compareTo(emp2.getFirst_name());
		
		if(res == 0)
			res = emp1.getLast_name().compareTo(emp2.getLast_name());
		return res;
	}
}


class Output {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee employee_1 = new Employee(14,   "Zaur", "Tregulov", 2300);
		Employee employee_2 = new Employee(2,    "Ivan", "Tara",     2600);
		Employee employee_3 = new Employee(315,  "John", "Snow",     1800);
		Employee employee_4 = new Employee(1456, "Petr", "Verhovez", 4200);
		Employee employee_5 = new Employee(64,   "Ivan", "Smirnov",  2600);
		
		list.add(employee_1);
		list.add(employee_2);
		list.add(employee_3);
		list.add(employee_4);
		list.add(employee_5);
		
		System.out.println("Default sorting: 000");
		System.out.println(list);
		
//		Collections.sort(list, new IdComparator());
//		
//		System.out.println("Collections sorting 'id': ");
//		System.out.println(list);
//
		Collections.sort(list, new NameComparator());
		
		System.out.println("Collections sorting 'name': ");
		System.out.println(list);

		
		
		
		
		
	}
}/* Output:

*///:~


