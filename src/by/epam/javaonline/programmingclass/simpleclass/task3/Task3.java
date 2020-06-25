package by.epam.javaonline.programmingclass.simpleclass.task3;

public class Task3 {

	public static void main(String[] args) {

		Student[] students = { new Student("Иванов1", "Иван", "Иванович", 1),
				new Student("Иванов2", "Иван", "Иванович", 2), new Student("Иванов3", "Иван", "Иванович", 3),
				new Student("Иванов4", "Иван", "Иванович", 4), new Student("Иванов5", "Иван", "Иванович", 5),
				new Student("Иванов6", "Иван", "Иванович", 6), new Student("Иванов7", "Иван", "Иванович", 7),
				new Student("Иванов8", "Иван", "Иванович", 8), new Student("Иванов9", "Иван", "Иванович", 9),
				new Student("Иванов0", "Иван", "Иванович", 10) };

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
