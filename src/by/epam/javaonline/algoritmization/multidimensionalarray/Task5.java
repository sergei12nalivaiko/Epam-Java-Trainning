package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

/*
—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
 1  1  1  1  1  1
 2  2  2  2  2  0
 3  3  3  3  0  0
 4  4  4  0  0  0
 5  5  0  0  0  0
 6  0  0  0  0  0
 */

public class Task5 {

	public static void main(String[] args) {
		
		int n;
		
		n = enterData();
		
		int[][] ar = new int [n][n];
		
		showTaskDecision(ar);
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
	
	public static void showTaskDecision(int[][] ar) {		
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {
				if (j < ar.length - i) {
                    ar[i][j] = i + 1;
                }
				else {
					ar[i][j] = 0;
				}
			}
		}
		show(ar);
	}

}
