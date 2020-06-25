package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

/*
����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
��������� �����(������) ��� ���������� ����� ���� ��������������� ������������� ��������� ������� � �������� �� k �� m.
 */

public class Task8 {

	public static int k;
	public static int m;

	public static void main(String[] args) {

		int n;
		int[] ar;

		n = enterData();
		ar = new int[n];
		fillArray(ar);
		show(ar);
		taskDecision(ar);
	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ �������. ����������� ������ ������� 10 ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ������ �������. ����������� ������ ������� 10 ");
			System.out.println("�������� ������ ���� ����� ������������� ������  � > � ");
			System.out.print(">>");

		}

		n = scanner.nextInt();

		if (n <= 0 || n < 10) {
			enterData();
		}
		return n;
	}

	public static void fillArray(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100);
		}
	}

	public static void show(int[] ar) {

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + "  |  ");
		}
		System.out.println();
	}

	public static void variableInput(int n) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� ��������� � ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� �������� ���������� � ");
			System.out.println("�������� ������ ���� ����� ������������� ������ ");
			System.out.print(">>");
		}

		k = scanner.nextInt();

		if (k <= 0 || k > n) {
			variableInput(n);
		}

		System.out.println("������� �������� ��������� m ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� �������� ���������� m ");
			System.out.println("�������� ������ ���� ����� ������������� ������ ");
			System.out.print(">>");
		}

		m = scanner.nextInt();

		// if (m <= 0 || k > m || m > n) {
		// variableInput(n);
		// }
	}

	public static void taskDecision(int[] ar) {

		int numOfSum;
		int range = 3;
		int step = 0;
		int counter = 0;
		int[] sum;

		variableInput(ar.length);
		numOfSum = (m - k) / range;
		System.out.println("� ������ ���������� " + numOfSum + " ��������� �� 3 �����");
		sum = new int[numOfSum];

		for (int j = 0; j < sum.length; j++) {
			for (int i = k + step; i < m; i++) {

				if (counter < range) {
					sum[j] += ar[i];
					counter++;
				}
			}

			System.out.println("����� ��������� ��� � " + j + " = " + sum[j]);
			step += range;
			counter = 0;
		}
		System.out.println();
		show(sum);

	}
}
