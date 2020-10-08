package by.epam.javaonline.programmingclass.simpleclass.task3;

public class Student {

	private String lastName;
	private String firstName;
	private int groupNumber;
	private int academicPerfomance;

	public Student() {
		this.lastName = null;
		this.firstName = null;
		this.groupNumber = 0;
	}

	public Student(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Student(String lastName, String firstName, int groupNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.groupNumber = groupNumber;
	}
	
	public Student(String lastName, String firstName, int groupNumber, int academicPerfomance) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.groupNumber = groupNumber;
		this.academicPerfomance = academicPerfomance;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getGroupNumber() {
		return this.groupNumber;
	}
	
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public int getAcademicPerfomance() {
		return academicPerfomance;
	}

	public void setAcademicPerfomance(int academicPerfomance) {
		this.academicPerfomance = academicPerfomance;
	}
}
