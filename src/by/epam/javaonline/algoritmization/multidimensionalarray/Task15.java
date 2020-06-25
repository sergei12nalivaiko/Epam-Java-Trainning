package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 

public class Task15 {

	public static int nRow;
	public static int nColumn;

	public static void main(String[] args) {
		
		int max;
		
		enterArrayLength();
		
		int[][] ar = new int [nRow][nColumn];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 15);
			}
			System.out.println();
		}		
		show(ar);
		
		max = max(ar);
		
		System.out.println("Максимальный элемент равен = " + max);
		
		taskDecision(ar, max);
		show(ar);

	}
	
	public static void enterArrayLength() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число строк в матрице ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите число строк в матрице");
			System.out.print(">>");
		}

		nRow = scanner.nextInt();

		System.out.println("Введите число столбцов в матрице ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите число столбцов в матрице");
			System.out.print(">>");
		}

		nColumn = scanner.nextInt();
	}
	
	public static void show(int[][] ar) {

		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void taskDecision(int[][] ar, int max) {
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length - 1; j++) {
				if((ar[i][j]) % 2 != 0) {
					ar[i][j] = max;
				} 		
			}
			System.out.println();
		}	
		
	}
	
	public static int max(int[][] ar) {
		
		int max = ar[0][0];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length - 1; j++) {
				if((ar[i][j + 1]) > max) {
					max = ar[i][j + 1];
				} 		
			}
			System.out.println();
		}	
		return max;
	}

}
