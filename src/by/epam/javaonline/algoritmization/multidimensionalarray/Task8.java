package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного 
//столбца поставить на соответствующие им позиции другого, а его элементы второго переместить 
//в первый. Номера столбцов вводит пользователь с клавиатуры. 


public class Task8 {

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
		
		int indexColumn;
		int indexColumnReplace;
		int buffer;
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите номер столбца  ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите номер столбца");
			System.out.print(">>");
		}

		indexColumn = scanner.nextInt();

		System.out.println("Введите номер столбца для замены ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите номер столбца для замены");
			System.out.print(">>");
		}

		indexColumnReplace = scanner.nextInt();
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {
				if(j == indexColumn) {
					buffer = ar[i][j];
					ar[i][j] = ar[i][indexColumnReplace];
					ar[i][indexColumnReplace] = buffer;
				}				
			}
		}
		show(ar);
	}
}
