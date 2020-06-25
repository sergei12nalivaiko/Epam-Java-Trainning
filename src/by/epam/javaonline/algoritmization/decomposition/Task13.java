package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 
//(��������, 41 � 43). ����� � ���������� ��� ���� ���������� �� ������� [n,2n], 
//��� n - �������� ����������� ����� ������ 2. ��� ������� ������ ������������ ������������. 


public class Task13 {

	public static void main(String[] args) {

		int n;
		int[] ar;

		n = enterData();
		ar = new int[2 * n + 1];
		fillArray(ar);
		show(ar);
		findTwins(n, ar);
	}

	public static int enterData() {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ������ ���� ����������� �����, n > 2");
		System.out.println("������� �������� ���������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("�������� ������ ���� ����������� �����, n > 2 ");
			System.out.println("������� �������� ���������� ");
			System.out.print(">>");
		}

		x = scanner.nextInt();
		if (2 >= x) {
			enterData();
		}
		return x;
	}

	public static void fillArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 10);
		}
	}

	public static void show(int[] ar) {

		for (int i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}

	public static void findTwins(int n, int[] ar) {

		int counter = 0;

		System.out.println("�������� ����� �� " + n + " �� " + n * 2);

		for (int i = n; i <= (2 * n - 1); i++) {
			System.out.print(ar[i] + "\t");
		}

		System.out.println();
		System.out.println();
		
		for (int i = n; i <= (2 * n - 1); i++) {
			for (int j = n; j <= (2 * n - 1); j++) {
				if (Math.abs(ar[i] - ar[j]) == 2) {
					System.out.println(ar[i] + "\t" + ar[j]);
					counter++;
				}
			}
		}

		System.out.println("�������� " + counter + " ���(�) ���������");
	}

}
