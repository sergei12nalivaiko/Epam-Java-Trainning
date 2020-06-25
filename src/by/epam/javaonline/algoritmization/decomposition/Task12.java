package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//���� ����������� ����� � � N. �������� �����(������) ������������ ������� �, 
//���������� �������� �������� �����, ����� ���� ������� ����� � � ������� �� ������� N. 

public class Task12 {

	public static void main(String[] args) {

		int k;
		int n;
		int length;
		int[] arr;
		System.out.println("������� �������� ���������� k");
		k = enterData();
		System.out.println("������� �������� ���������� n");
		n = enterData();
		length = findLength(k, n);
		System.out.println("����� ������� = " + length);
		arr = fillArr(k, n, length);
		show(arr);
	}

	public static int enterData() {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ������ ���� ����������� ����� ");
		System.out.println("������� �������� ���������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("�������� ������ ���� ����������� ����� ");
			System.out.println("������� �������� ���������� ");
			System.out.print(">>");
		}

		x = scanner.nextInt();
		if (0 > x) {
			enterData();
		}
		return x;
	}

	public static int findLength(int k, int n) {

		int length = 0;
		int sum = 0;

		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k; j++) {
				sum = i + j;
				if (sum == k) {
					length++;
				}
			}
		}
		return length;
	}

	public static int[] fillArr(int k, int n, int length) {
		int sum = 0;
		int[] arr = new int[length];

		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j <= arr.length; j++) {
				sum = i + j;
				if (sum == k) {
					if (sum <= n) {
						sum = i * 10 + j;
						arr[i] = sum;
					}
				}
			}
		}
		return arr;
	}

	public static void show(int[] ar) {

		for (int i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}

}
