package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//Найти положительные элементы главной диагонали квадратной матрицы. 

public class Task10 {

	public static void main(String[] args) {
		
		int n;
		
		n = enterData();
		int[][] ar = new int [n][n];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * (10 - (-10)) + (-10));
			}
			System.out.println();
		}		
		show(ar);
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
	
	public static void show(int[][] ar) {

		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}		
		
	}
	
	public static void taskDecision(int[][] ar) {
		
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {				
				if(i == j) {
					sum += ar[i][j];
				}
			}
		}
		System.out.println("Сумма главной диагонали равна = " + sum);
	}

}
