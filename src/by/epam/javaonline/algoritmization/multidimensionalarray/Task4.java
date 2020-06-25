package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

/*
4. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
1  2   3   n
n n-1 n-2 n-3
1  2   3   n
n n-1 n-2 n-3
1  2   3   n
n n-1 n-2 n-3
*/
	 
public class Task4 {

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
				if(i % 2 != 0) {
					ar[i][j] = j + 1;
				}
				if(i % 2 == 0) {
					ar[i][j] = ar.length - j;
				}				
			}
		}
		show(ar);
	}

}
