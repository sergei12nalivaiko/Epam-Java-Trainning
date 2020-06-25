package by.epam.javaonline.algoritmization.multidimensionalarray;

import java.util.Scanner;

//� �������� ������� �������� ������� ��� ������� ����� �������, �. �. ��� �������� ������ 
//������� ��������� �� ��������������� �� ������� �������, � ��� �������� ������� ����������� 
//� ������. ������ �������� ������ ������������ � ����������. 


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
		System.out.println("������� ����� ����� � ������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ����� ����� � �������");
			System.out.print(">>");
		}

		nRow = scanner.nextInt();

		System.out.println("������� ����� �������� � ������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ����� �������� � �������");
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
		System.out.println("������� ����� �������  ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ����� �������");
			System.out.print(">>");
		}

		indexColumn = scanner.nextInt();

		System.out.println("������� ����� ������� ��� ������ ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ����� ������� ��� ������");
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
