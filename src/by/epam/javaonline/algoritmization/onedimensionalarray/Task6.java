package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, 
//порядковые номера которых являются простыми числами. 

public class Task6 {

	
	public static void main(String[] args) {
		
		int n;
		double sum = 0;

		n = enterData();

		double[] ar = new double[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (Math.random() * (10 - (-10)) + (-10));
		}

		show(ar);
		
		for (int i = 2; i < ar.length; i++) {
			if(isPrimeNumber(i,ar.length)) {
				sum += ar[i];
			}
		}
		
		System.out.println("Сумма чисел = " + sum);

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
		
	public static boolean isPrimeNumber(int n, int size) {	
	
		int i = 3;
		
		if(n == 2) {
			System.out.println("Простое = " + n);
			return true;
		}
		if(n % 2 == 0) {
			System.out.println("Составное = " + n);
			return false;
		}
				
		for (int j = 0; i < size ;) {
			if (Math.pow(i, 2) <= n && j != 1) {
				if (n % i == 0) {
					j = 1;
				} 
			} else {
				if (j == 1) {
					System.out.println("Составное = " + n);
					return false;
				}
			}
			i = i + 1;
		}
		System.out.println("Простое = " + n);
	   return true;
		
	}
}
