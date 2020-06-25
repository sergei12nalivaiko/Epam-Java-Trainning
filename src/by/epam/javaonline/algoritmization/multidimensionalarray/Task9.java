package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
//Определить, какой столбец содержит максимальную сумму. 


public class Task9 {

	public static int nRow;
	public static int nColumn;
	
	public static void main(String[] args) {
		
		enterArrayLength();
		
		int[][] ar = new int [nRow][nColumn];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 15);
			}
			System.out.println();
		}		
		show(ar);		
		taskDecision(ar);

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
	
	public static void taskDecision(int[][] ar) {
		
		int counterSum = 0;
		
		int[] sumColumn = new int [nColumn];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				counterSum += ar[j][i];
			}
			sumColumn[i] = counterSum;
			counterSum = 0;
		}
		
		for(int i = 0; i < sumColumn.length; i++) {
			System.out.print(sumColumn[i] + "\t");
		}
		
		max(sumColumn);
	}
	
	public static void max(int[] ar) {
		
		int max = ar[0];
		int indexMax = 0;
		
		for (int i = 0; i < ar.length - 1; i++) {
			if((ar[i + 1]) > max) {
				max = ar[i + 1];
				indexMax = i + 1;
			} 			
		}		
		System.out.println("Максимальную сумму содержит столбец под номером " + indexMax);
	}

}
