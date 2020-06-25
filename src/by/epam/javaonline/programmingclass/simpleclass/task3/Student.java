package by.epam.javaonline.programmingclass.simpleclass.task3;

public class Student {

	private String lastName;
	private String firstName;
	private String middleName;
	private int groupNumber;
	private int[] raiting = new int[5];

	public Student() {
		this.lastName = null;
		this.firstName = null;
		this.middleName = null;
		this.groupNumber = 0;
		this.raiting = null;
	}

	public Student(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}

	public Student(String lastName, String firstName, String middleName, int groupNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.groupNumber = groupNumber;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getGroupNumber() {
		return this.groupNumber;
	}

	public void setRaiting(int[] raiting) {
		this.raiting = raiting;
	}

	public int[] getRaiting() {
		return this.raiting;
	}

	public void findExcellentStudents() {
		int counter = 0;
		for (int i : this.raiting) {
			if (i > 8) {
				counter++;
				if(counter==raiting.length) {
					System.out.println(
						this.lastName + "\t\t" + this.firstName + "\t\t" + this.middleName + "\t\t" + this.groupNumber);
				}				
			}
		}
	}
}
