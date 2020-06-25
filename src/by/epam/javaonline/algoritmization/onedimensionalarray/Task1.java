package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

//� ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.

public class Task1 {

	public static void main(String[] args) {

		int k;
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;

		k = enterData();

		for (int x : ar) {

			if (x % k == 0) {
				sum += x;
			}
		}

		System.out.println("����� = " + sum);
	}

	public static int enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����������� �����");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ����������� �����");
			System.out.print(">>");
		}

		int value = scanner.nextInt();
		return value;
	}

}
