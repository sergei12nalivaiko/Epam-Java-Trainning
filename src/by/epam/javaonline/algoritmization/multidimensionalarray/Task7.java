package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по правилу:
a[i, j] = sin((i^2 - j^2)/n)
и подсчитать количество положительных элементов в ней.
 */

public class Task7 {

	public static void main(String[] args) {
		
		int n;
		
		n = enterData();
		double[][] ar = new double [n][n];
		taskDecision(ar);
		
	}
	
	public static int enterData() {
		
		int n;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер квадратной матрицы ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите размер квадратной матрицы ");
			System.out.print(">>");
		}

		n = scanner.nextInt();	
		return n;
	}
	
	public static void show(double[][] ar) {

		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t\t\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void taskDecision(double[][] ar) {
		
		int counter = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {				
				ar[i][j] =  (Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / ar.length));
				if(ar[i][j] > 0) {
					counter++;
				}
			}
		}
		show(ar);
		System.out.println("Количество положительных элементов = " + counter);
	}

}
