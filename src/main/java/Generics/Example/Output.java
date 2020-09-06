//: Output class for play game

package Generics.Example;

public class Output {
	public static void main(String[] args) {
		
		// Create scholars:
		Scholar scholar1 = new Scholar("Ivan", 12, 98);
		Scholar scholar2 = new Scholar("Petr", 13, 102);
		Scholar scholar3 = new Scholar("Mary", 12, 120);
		Scholar scholar4 = new Scholar("Kary", 13, 89);
	
		//Create students:
		Student student1 = new Student("Mike", 21, 107);
		Student student2 = new Student("Liza", 19, 89);
		Student student3 = new Student("Mark", 23, 99);
		Student student4 = new Student("John", 23, 103);
		
	    //Create employees:
		Employee employee1 = new Employee("Kiril", 38, 100);
		Employee employee2 = new Employee("Lina", 34, 93);
		Employee employee3 = new Employee("Ryslana", 28, 113);
		Employee employee4 = new Employee("Petr", 41, 102);

		//Creating teams and adding players
		System.out.println("------------------- Scholar team -------------------" + "\n");
		
//		Team scholarTeam = new Team("Globe");
//but:	Team<String> anotheTeam = new Team<>("StringTeam");
		Team<Scholar> scholarTeam = new Team<>("Globe");
		
		scholarTeam.addNewParticipant(scholar1);
		scholarTeam.addNewParticipant(scholar2);
//but:	scholarTeam.addNewParticipant(student1);  //NOT CORRECT
		
		System.out.println();
		
		Team<Scholar> scholarTeam2 = new Team<>("Maths");
       
		scholarTeam2.addNewParticipant(scholar3);
		scholarTeam2.addNewParticipant(scholar4);
		
		System.out.println("\n" + "------------------- Student team -------------------" + "\n");
		
		Team<Student> studentTeam = new Team<>("Space");
		
		studentTeam.addNewParticipant(student1);
		studentTeam.addNewParticipant(student2);
		
		System.out.println();
		
		Team<Student> studentTeam2 = new Team<>("Shark");
		
		studentTeam2.addNewParticipant(student3);
		studentTeam2.addNewParticipant(student4);
		
		System.out.println("\n" + "------------------ Employee team ------------------" + "\n");
		
		Team<Employee> employeeTeam = new Team<>("CNC");
		
		employeeTeam.addNewParticipant(employee1);
		employeeTeam.addNewParticipant(employee2);
		
		System.out.println();
		
		Team<Employee> employeeTeam2 = new Team<>("3D");
		
		employeeTeam2.addNewParticipant(employee3);
		employeeTeam2.addNewParticipant(employee4);
		
		System.out.println("\n" + "------ Play ------" + "\n");
		
		//Play:
		scholarTeam.playWith(scholarTeam2);
//but:	scholarTeam.playWith(studentTeam);
		
		studentTeam.playWith(studentTeam2);
		
		employeeTeam.playWith(employeeTeam2);
	
	}
}/* Output:
			------------------- Scholar team -------------------
			
			To the team 'Globe' has a new member been added Ivan
			To the team 'Globe' has a new member been added Petr
			
			To the team 'Maths' has a new member been added Mary
			To the team 'Maths' has a new member been added Kary
			
			------------------- Student team -------------------
			
			To the team 'Space' has a new member been added Mike
			To the team 'Space' has a new member been added Liza
			
			To the team 'Shark' has a new member been added Mark
			To the team 'Shark' has a new member been added John
			
			------------------ Employee team ------------------
			
			To the team 'CNC' has a new member been added Kiril
			To the team 'CNC' has a new member been added Lina
			
			To the team '3D' has a new member been added Ryslana
			To the team '3D' has a new member been added Petr
			
			------ Play ------
			
			Team winner 'Globe'
			Team winner 'Space'
			Team winner 'CNC'
*///:~