package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

//��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������. ��������� ������ ���������� �����. 

public class Task9 {

	public static void main(String[] args) {

		String str;
		Scanner in = new Scanner(System.in);
		int counterL = 0;
		int counterU = 0;

		System.out.println("������� ������:");
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
		System.out.println("���������� �������� ���� = " + counterL);
		System.out.println("���������� ��������� ���� = " + counterU);

		in.close();
	}
}
