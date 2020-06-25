package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
//Например, если было введено "abc cde def", то должно быть выведено "abcdef". 

public class Task7 {

	public static void main(String[] args) {

		String str;
		Scanner in = new Scanner(System.in);

		System.out.println("Введите строку:");
		str = in.nextLine();
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length();) {
			if (Character.isWhitespace(sb.charAt(i))) {
				sb.deleteCharAt(i);
			}
			if (Character.isLetter(sb.charAt(i))) {
				i++;
			}
		}

		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
		in.close();
	}
}
