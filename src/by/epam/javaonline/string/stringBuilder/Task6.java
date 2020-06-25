package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

//»з заданной строки получить новую, повторив каждый символ дважды. 

public class Task6 {

	public static void main(String[] args) {

		String str;
		char ch;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите строку");
		str = in.nextLine();
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length() * 2; i += 2) {
			ch = sb.charAt(i);
			sb.insert(i + 1, ch);
		}
		System.out.println(sb);
		in.close();
	}

}
