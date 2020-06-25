package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

/*
—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
1 1 1 1 1 1
0 1 1 1 1 0
0 0 1 1 0 0
0 1 1 1 1 0
1 1 1 1 1 1
 */

public class Task6 {
	
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
				if (ar.length - i - 1 > j && i > j || i > ar.length - j - 1 && ar.length - i - 1 > ar.length - j - 1) {
                    ar[i][j] = 0;
                } else {
                    ar[i][j] = 1;
                }
			}
		}
		show(ar);
	}

}
