package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

//����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���. 

public class Task5 {

	public static void main(String[] args) {

		char[] ch;
		int counter = 0;
		String str;
		// @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("������� ������:");
		str = in.nextLine();
		ch = str.toCharArray();

		for (char c : ch) {
			if (c == 'a') {
				counter++;
			}
		}
		System.out.println(counter);
		in.close();
	}
}
