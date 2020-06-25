package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 


public class Task3 {
	
	public static int nRow;
	public static int nColumn;

	public static void main(String[] args) {
		
		enterData();
		
		int[][] ar = new int[nRow][nColumn];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 15);
			}
			System.out.println();
		}
		show(ar);
		showTaskDecision(ar);

	}
	
	public static void enterData() {
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
				System.out.print(ar[i][j] + "  |  ");
			}
			System.out.println();
		}
		
		//System.out.println();
	}
	
	public static void showTaskDecision(int[][] ar) {
		
		int row;
		int column;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите номер строки для вывода ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите номер строки для вывода");
			System.out.print(">>");
		}
		row = scanner.nextInt();
		
		System.out.println("Введите номер столбца для вывода ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите номер столбца для вывода");
			System.out.print(">>");
		}
		column = scanner.nextInt();
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {
				if(i == row) {
					System.out.print(ar[i][j] + "    ");	
				}			
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {
				if(j == column) {
					System.out.println(ar[i][j] + "    ");	
				}			
			}
			
		}
	}

}
