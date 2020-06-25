package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы. 

public class Task9 {

	public static void main(String[] args) {

		String str;
		Scanner in = new Scanner(System.in);
		int counterL = 0;
		int counterU = 0;

		System.out.println("Введите строку:");
		str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) && str.charAt(i) < 123) {
				if (Character.isLowerCase(str.charAt(i))) {
					counterL++;
				}
				if (Character.isUpperCase(str.charAt(i))) {
					counterU++;
				}
			}
		}
		System.out.println("Количество строчных букв = " + counterL);
		System.out.println("Количество прописных букв = " + counterU);

		in.close();
	}
}
