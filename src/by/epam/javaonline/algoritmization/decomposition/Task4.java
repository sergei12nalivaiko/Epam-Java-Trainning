package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//�� ��������� ������ ������ ������������ n �����. 
//�������� �����(������), ������������, ����� ������ �� ��� ����� ����� 
//������� ����������. ��������. ���������� ����� ������� � ������. 

public class Task4 {

	public static void main(String[] args) {

		int n;
		int[][] coordinates;

		n = enterData();
		coordinates = new int[2][n];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				coordinates[i][j] = (int) (Math.random() * 30);
			}
		}

		show(coordinates);
		distanceCalc(coordinates);

	}

	public static int enterData() {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� ���������� ����� �� ��������� (������������� �����) ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("�������� ������ ���� ����� ������ ");
			System.out.println("������� �������� ���������� ����� �� ��������� ");
			System.out.print(">>");

		}

		x = scanner.nextInt();
		if (x <= 0) {
			enterData();
		}
		return x;
	}

	public static void show(int[][] ar) {

		int pointName = 1;
		int i = 0;

		for (int z = 0; z < 2; z++) {
			for (int j = 0; j < ar[z].length; j++) {
				System.out.print(ar[z][j] + "\t|");
			}
			System.out.println();
		}

		System.out.println();

		for (int j = 0; j < ar[i].length; j++) {
			System.out.println("����� �" + pointName++ + "\tX = " + ar[i][j] + "\tY = " + ar[i + 1][j]);
		}
		System.out.println();
	}

	public static void distanceCalc(int[][] ar) {

		int pointName = 1;
		int i = 0;
		double distance;
		double distanceMax = 0;

		for (int j = 0; j < ar[i].length - 1; j++) {

			distance = Math.sqrt(Math.pow(ar[i][j + 1] - ar[i][j], 2) + Math.pow(ar[i + 1][j + 1] - ar[i + 1][j], 2));

			if (distance > distanceMax) {
				distanceMax = distance;
			}

			System.out.println("���������� �� ����� �" + pointName++ + "\tX = " + ar[i][j] + "\tY = " + ar[i + 1][j]
					+ "   �� ����� �" + pointName + "\tX = " + ar[i][j + 1] + "\tY = " + ar[i + 1][j + 1] + " \t= "
					+ distance);
		}
		System.out.println();
		System.out.println("������������ ���������� = " + distanceMax);

	}

}
