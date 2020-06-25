package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//ќтсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 

public class Task13 {

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
		System.out.println("¬ведите число строк в матрице ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите число строк в матрице");
			System.out.print(">>");
		}

		nRow = scanner.nextInt();

		System.out.println("¬ведите число столбцов в матрице ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите число столбцов в матрице");
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
		
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 1; j < ar[i].length; j++) {
				int in;
				int temp = ar[j][i];
				in = j;
				while(in > 0 && ar[in-1][i] >= temp) {
					ar[in][i] = ar[in-1][i];
					--in;
				}
				ar[in][i] = temp;
			}
		}
		show(ar);
		for(int i = 0; i < ar.length; i++) {
			for(int j = 1; j < ar[i].length; j++) {
				int in;
				int temp = ar[j][i];
				in = j;
				while(in > 0 && ar[in-1][i] <= temp) {
					ar[in][i] = ar[in-1][i];
					--in;
				}
				ar[in][i] = temp;
			}
		}
		show(ar);		
	}

}
