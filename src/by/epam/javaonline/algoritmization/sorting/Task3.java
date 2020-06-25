package by.epam.javaonline.algoritmization.sorting;

import java.util.Scanner;

//Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an .
//Требуется переставить элементы так, чтобы они были расположены по убыванию. 
//Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
//а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. 
//Написать алгоритм сортировки выбором. 

public class Task3 {

	public static void main(String[] args) {

		int arLength;

		arLength = enterData();

		int[] ar = new int[arLength];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}
		System.out.println("До сортировки");
		show(ar);
		selectionSort(ar);
		System.out.println("После сортировки");
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

	public static void selectionSort(int[] ar) {
		
		int out, in, max;
		
		for (out = 0; out < ar.length - 1; out++) {
			max = out;
			for (in = out + 1; in < ar.length; in++) {
				if (ar[in] > ar[max]) {
					max = in;
				}
			}
			swap(out, max, ar);
		}
	}

	public static void swap(int one, int two, int[] ar) {
		int temp = ar[one];
		ar[one] = ar[two];
		ar[two] = temp;
	}

}
