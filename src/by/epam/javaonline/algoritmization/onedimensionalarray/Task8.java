package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

/*
Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( , , , ) 1 2 n a a  a .
 */

public class Task8 {

	public static void main(String[] args) {
		
		int n;
		int minIndex;
		double minEl;
		
		n = enterData();
		
		double[] ar = new double[n];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = Math.random() * 100;
		}
		
		show(ar);
		
		for(int i = 0; i <= ar.length + 1; i++) {
			minEl = minEl(ar);
			System.out.println("MinEl = " + minEl);
			minIndex = minIndex(ar);
			System.out.println("MinIndex = " + minIndex);
			ar = deleteMinEl(ar,minIndex);
			show(ar);
		}
	}
	
	public static int enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите размерность массива");
			System.out.print(">>");
		}

		int value = scanner.nextInt();
		return value;
	}

	public static void show(double[] ar) {

		for (double i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}
	
	public static double minEl(double[] ar) {
		
		double minEl = ar[0];
		
		for (int i = 0; i < ar.length - 1; i++) {
			if((ar[i + 1]) < minEl) {
				minEl = ar[i + 1];
			} 			
		}		
		return minEl;
	}
	
	public static int minIndex(double[] ar) {
		
		double minEl = ar[0];	
		int minIndex = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			
			if((ar[i + 1]) < minEl) {
				minEl = ar[i + 1];
				minIndex = i + 1;
			} 			
		}		
		return minIndex;
	}
	
	public static double[] deleteMinEl(double[] ar, int minIndex) {
			
		for (int i = minIndex; i < ar.length - 1; i++) {
			ar[i] = ar[i +1];	
		}		
	
		double[] ar1 = new double[ar.length-1]; 
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = ar[i];	
		}	
		return ar1;
	}

}
