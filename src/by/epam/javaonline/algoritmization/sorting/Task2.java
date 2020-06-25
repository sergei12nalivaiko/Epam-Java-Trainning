package by.epam.javaonline.algoritmization.sorting;

import java.util.Scanner;

//Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn
//Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
//Примечание. Дополнительный массив не использовать. 

public class Task2 {

	public static void main(String[] args) {

		int arLength;
		int ar1Length;

		arLength = enterData();
		ar1Length = enterData();

		int[] ar = new int[arLength + ar1Length];
		int[] ar1 = new int[ar1Length];

		for (int i = 0; i < ar.length - ar1.length; i++) {
			ar[i] = i;
		}

		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = i;
		}
		System.out.println("Первый массив");
		show(ar);
		System.out.println("Второй массив");
		show(ar1);
		ar = taskDecision(ar, ar1);
		System.out.println("Объединение массивов");
		show(ar);
		insertionSort(ar);
		System.out.println("Сортировка массива");
		show(ar);

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите размер массива ");
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

	public static int[] taskDecision(int[] ar, int[] ar1) {

		for (int i = 0; i < ar1.length; i++) {
			ar[ar.length - ar1.length + i] = ar1[i];
		}
		return ar;
	}

	public static void insertionSort(int[] ar) {

		int in, out;

		for (out = 1; out < ar.length; out++) {
			int temp = ar[out];
			in = out;
			while (in > 0 && ar[in - 1] >= temp) {
				ar[in] = ar[in - 1];
				--in;
			}
			ar[in] = temp;
		}
	}
}
