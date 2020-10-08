package by.epam.javaonline.programmingclass.simpleclass.task3;

public class Task3 {

	public static void main(String[] args) {
		
		StudentClass studentClass = new StudentClass(10);
		
		for(int i = 0; i < 10; i++) {
			studentClass.addStudent(new Student ("Ivanov" + i, "Ivan", i,(int) (1 + Math.random() * 10)));
		}		
		studentClass.showAllStudent(studentClass.getStudents());
		studentClass.findExcellentStudents();
	}
}
