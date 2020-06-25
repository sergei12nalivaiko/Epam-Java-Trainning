package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		int n;
		double sum;
		double max;
		
		n = enterData();
		double[] ar = new double[n];

		for (int i = 0; i < n; i++) {
			ar[i] = (Math.random() * (10 - (-10)) + (-10));
		}

		show(ar);
				 
	    sum = ar[0] + ar[ar.length - 1];
	    max = sum;
	    
	    for (int i = 1; i < (ar.length - 1) / 2 + 1; i++) {
	        sum = ar[i] + ar[(ar.length -1) - i];
	        if (sum > max) {
	            max = sum;
	        }
	    }
	        System.out.println("Max = " + max);
	}
	
	public static int enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите размерность массива");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите размерность массива");
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

}
