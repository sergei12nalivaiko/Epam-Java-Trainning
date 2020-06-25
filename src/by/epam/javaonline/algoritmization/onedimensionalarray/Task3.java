package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов

public class Task3 {

	public static void main(String[] args) {
		int n;

		n = enterData();

		double[] ar = new double[n];

		for (int i = 0; i < n; i++) {
			ar[i] = (Math.random() * (10 - (-10)) + (-10));
		}

		show(ar);
		countingPolarityNum(ar);
	}

	public static int enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите размерность массива");
			System.out.print(">>");
		}

		int value = scanner.nextInt();
		return value;
	}

	public static void show(double[] ar) {

		for (double i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}

	public static void countingPolarityNum(double[] ar) {
		int counterPos = 0;
		int counterNeg = 0;
		int counter0 = 0;

		for (double x : ar) {
			if (x > 0) {
				counterPos++;
			}
			if (x < 0) {
				counterNeg++;
			}
			if (x == 0) {
				counter0++;
			}
		}
		System.out.println("Количество положительных элементов = " + counterPos);
		System.out.println("Количество отрицательных элементов = " + counterNeg);
		System.out.println("Количество нулевых элементов = " + counter0);
	}

}
