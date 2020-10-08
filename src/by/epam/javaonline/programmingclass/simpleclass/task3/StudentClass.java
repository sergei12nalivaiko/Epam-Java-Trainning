package by.epam.javaonline.programmingclass.simpleclass.task3;

public class StudentClass {
	
	private int maxQuantity;
	private Student[] students;
	private int index = 0;
	
	public StudentClass(int maxQuantity) {
		super();
		this.maxQuantity = maxQuantity;
		this.students = new Student[maxQuantity];
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		if(classIsFull()) {
			students[index] = student;
			index++;
		}else {
			System.out.println("Class is full!");
		}			
	}
	
	public boolean classIsFull() {
		if(index < 10) {
			return true;
		}		
		return false;
	}
	
	public void findExcellentStudents() {
		System.out.println("List of exñellent students");
		for(Student student: students) {
			if(student.getAcademicPerfomance() >= 9) {
				showStudent(student);
			}
		}
	}
	
	public void showAllStudent(Student[] students) {
		for(Student x: students) {
			System.out.println(x.getLastName() + "\t\t" + x.getGroupNumber() + "\t\t" + x.getAcademicPerfomance());
		}
	}
	
	public void showStudent(Student student) {
		System.out.println(student.getLastName() + "\t\t" + student.getGroupNumber() + "\t\t" + student.getAcademicPerfomance());
	}

}
