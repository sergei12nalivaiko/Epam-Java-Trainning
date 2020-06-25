package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 

public class Task2 {

	public static void main(String[] args) {
		
		int n;
		
		n = enterData();
		
		int[][] ar = new int [n][n];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 15);
			}
			System.out.println();
		}
		show(ar);
		showTaskDecision(ar);

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
				System.out.print(ar[i][j] + "  |  ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void showTaskDecision(int[][] ar) {
		
		int z = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = z; j < ar[i].length;) {
				System.out.print(ar[i][j] + "  |  ");
				z++;
				break;
			}
			System.out.println();
		}
	}

}
