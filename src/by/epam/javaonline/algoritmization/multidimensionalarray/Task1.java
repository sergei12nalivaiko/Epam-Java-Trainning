package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 

public class Task1 {
	
	public static int nRow;
	public static int nColumn;
	
	public static void main(String[] args) {
		
		
		enterData();
		
		int[][] ar = new int[nRow][nColumn];
	
		System.out.println("Число строк = " + nRow + ";Число столбцов = " + nColumn);
		
		for(int i = 0; i < nRow; i++) {
			for(int j = 0; j < nColumn; j++) {
				ar[i][j] = (int)(Math.random() * 15);
			}			
		}
		
		show(ar);
		
		showDecision(ar);
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

		for(int i = 0; i < nRow; i++) {
			for(int j = 0; j < nColumn; j++) {
				System.out.print(ar[i][j] + "  |  ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void showDecision(int[][] ar){
		
		for(int i = 1; i < nRow; i++) {
			for(int j = 0; j < nColumn; j++) {
				if(i % 2 != 0) {
					if(ar[0][i] > ar[nRow-1][i]) {
						System.out.println(ar[j][i] + "    ");
						
					}
				}
			}
			//System.out.println();
		}
	}

}
