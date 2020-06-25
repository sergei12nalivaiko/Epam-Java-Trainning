package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

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

		System.out.println("Сумма = " + sum);
	}

	public static int enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите натуральное число");
			System.out.print(">>");
		}

		int value = scanner.nextInt();
		return value;
	}

}
