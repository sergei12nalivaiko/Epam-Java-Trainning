package by.epam.javaonline.algoritmization.sorting;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		int lengthAr;
		int lengthAr1;
		double value;
		int i = 0;
		int j = 0;

		lengthAr = enterData();
		lengthAr1 = enterData();

		double[] ar = new double[lengthAr];
		double[] ar1 = new double[lengthAr1];

		while (i < ar.length - 1) {
			value = Math.random() * 100;
			if (value > ar[i]) {
				ar[i + 1] = value;
				i++;
			}
		}

		while (j < ar1.length - 1) {
			value = Math.random() * 100;
			if (value > ar1[j]) {
				ar1[j + 1] = value;
				j++;
			}
		}

		show(ar);
		show(ar1);
		find(ar, ar1);

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите размер массива ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите размер массива ");
			System.out.print(">>");
		}

		n = scanner.nextInt();
		return n;
	}

	public static void show(double[] ar) {

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + "  |  ");
		}
		System.out.println();
	}

	public static void find(double[] ar, double[] ar1) {
		
	}

}
