package by.epam.javaonline.programmingclass.simpleclass.task3;

public class Task3 {

	public static void main(String[] args) {

		Student[] students = { new Student("������1", "����", "��������", 1),
				new Student("������2", "����", "��������", 2), new Student("������3", "����", "��������", 3),
				new Student("������4", "����", "��������", 4), new Student("������5", "����", "��������", 5),
				new Student("������6", "����", "��������", 6), new Student("������7", "����", "��������", 7),
				new Student("������8", "����", "��������", 8), new Student("������9", "����", "��������", 9),
				new Student("������0", "����", "��������", 10) };

		int[] raiting;

		for (int i = 0; i < students.length; i++) {
			raiting = new int[students[i].getRaiting().length];
			for (int j = 0; j < raiting.length; j++) {
				raiting[j] = (int) (7 + Math.random() * 10);
			}
			students[i].setRaiting(raiting);
			students[i].findExcellentStudents();
		}
	}
}
