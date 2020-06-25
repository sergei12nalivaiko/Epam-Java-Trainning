package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//—оставить программу, котора€ в массиве A[N] находит второе по величине число 
//(вывести на печать число, которое меньше максимального элемента массива, 
//но больше всех других элементов). 

public class Task5 {

	public static void main(String[] args) {

		int n;
		int[] ar;

		n = enterData();
		ar = new int[n];
		fillArray(ar);
		System.out.println("ƒо сортировки ");
		show(ar);
		shellSort(ar);
		System.out.println();
		System.out.println("ѕосле сортировки ");
		show(ar);
		System.out.println();
		System.out.println("ћаксимальное значение в массиве = " + ar[ar.length - 1]);
		System.out.println("¬торое по величине значение в массиве = " + ar[ar.length - 2]);

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите значение размера массива (положительное число) ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("«начение должно быть целым числом ");
			System.out.println("¬ведите значение размера массива (положительное число)");
			System.out.print(">>");

		}

		n = scanner.nextInt();
		if (n <= 0) {
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
			System.out.print(ar[i] + "\t");
		}

	}

	public static void shellSort(int[] ar) {

		int inner, outer;
		int temp;
		int h = 1;

		while (h <= ar.length / 3) {
			h = h * 3 + 1;
		}

		while (h > 0) {
			for (outer = h; outer < ar.length; outer++) {
				temp = ar[outer];
				inner = outer;
				while (inner > h - 1 && ar[inner - h] >= temp) {
					ar[inner] = ar[inner - h];
					inner -= h;
				}
				ar[inner] = temp;
			}
			h = (h - 1) / 3;
		}
	}

}
