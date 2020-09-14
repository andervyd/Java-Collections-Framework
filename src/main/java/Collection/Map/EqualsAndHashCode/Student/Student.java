//: HashCode example

package Collection.Map.EqualsAndHashCode.Student;

public class Student {
	
	private String firstName;
	private String lastName;
	private int course;
	
	public Student(String firstName, String lastName, int course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName
				+ ", lastName=" + lastName 
				+ ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
	
	
	
	
}
