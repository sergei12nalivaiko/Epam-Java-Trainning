package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

public class Task16 {

public static void main(String[] args) {
		
		int n;
		
		n = enterData();
		
		int[][] ar = new int [n][n];
		
		taskDecision(ar);
	}
	
	public static int enterData() {
		
		int n;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите размер квадратной матрицы ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите размер квадратной матрицы ");
			System.out.print(">>");
		}

		n = scanner.nextInt();	
		return n;
	}
	
	public static void show(int[][] ar) {

		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "  |  ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void taskDecision(int[][] ar) {
			
		int num = 1;
		int nn = ar.length * 3 / 2; 
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {
				  ar[(j - i + nn) % ar.length][(i * 2 - j + ar.length) % ar.length] = num++; 		
			}
		}
		show(ar);
	}
}
