package by.epam.javaonline.algoritmization.sorting;

import java.util.Scanner;

//«аданы два одномерных массива с различным количеством элементов и натуральное число k. 
//ќбъединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
//при этом не использу€ дополнительный массив. 

public class Task1 {

	public static void main(String[] args) {

		int arLength;
		int ar1Length;

		arLength = enterData();
		ar1Length = enterData();

		int[] ar = new int[arLength + ar1Length];
		int[] ar1 = new int[ar1Length];

		for (int i = 0; i < ar.length - ar1.length; i++) {
			ar[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = (int) (Math.random() * 100);
		}

		show(ar);
		show(ar1);
		taskDecision(ar, ar1);

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите размер матрицы ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите размер матрицы ");
			System.out.print(">>");
		}

		n = scanner.nextInt();
		return n;
	}

	public static void show(int[] ar) {

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + "  |  ");
		}
		System.out.println();
	}

	public static void taskDecision(int[] ar, int[] ar1) {

		int k = 2;

		for (int i = ar.length - 1; i > k; i--) {
			ar[i] = ar[i - ar1.length];
		}

		for (int i = 0; i < ar1.length; i++) {
			ar[i + k + 1] = ar1[i];
		}

		show(ar);
	}

}
