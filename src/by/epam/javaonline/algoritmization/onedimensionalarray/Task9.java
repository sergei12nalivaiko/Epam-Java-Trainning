package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них. 


public class Task9 {

	public static void main(String[] args) {
		
		int n;		
		int counterMax = 0;		//Максимальное число повторений
		int lengthNewArray = 0; //Длина нового массива
		
		n = enterData();
		
		int[] ar = new int[n];
				
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random() * 15);
		}
		
		show(ar);
		
		counterMax = maxRepeat(ar);
		lengthNewArray = calculationOfArrayLength(ar,counterMax);
		
		System.out.println("Максимальное число повторений   = " + counterMax);
		System.out.println("Длина нового массива   = " + lengthNewArray);
		
		int[] digitArray = new int[lengthNewArray];
		
		digitArray = createNewArray(ar,lengthNewArray,counterMax);
		
		min(digitArray);
		//show(counterOfDigits);
	}

	public static int enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите размер массива");
			System.out.print(">>");
		}

		int value = scanner.nextInt();
		return value;
	}

	public static void show(int[] ar) {

		for (int i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}
	
	public static int maxRepeat(int[] ar) {
		
		int counter = 0;
		int counterMax = 0;		
		
		for(int i = 0; i < ar.length;) {
			
			for(int j = 0; j < ar.length; j++) {				
				if(ar[i] == ar[j]) {
					counter++;	 				
				}								
			}
			
			if(counter >= counterMax) {
				counterMax = counter;				
			}	
						
			counter = 0;
			i++;
		}
						
		return counterMax;
	}
	
	public static int  calculationOfArrayLength(int[] ar, int counterMax){
		
		int counterNewArray = 0;
		int counter = 0;
		int bufferIndex = 0;
		int[] buffer = new int[ar.length];
							
		for(int i = 0; i < ar.length;) {
			
			for(int j = 0; j < ar.length; j++) {				
				if(ar[i] == ar[j]) {
					counter++;	 				
				}								
			}
			
			if(counter == counterMax) {
				if(ar[i] != buffer[bufferIndex]) {
					buffer[bufferIndex] = ar[i];
					counterNewArray++;
					bufferIndex++;
				}				
			}	
						
			counter = 0;
			i++;
		}
		
		return counterNewArray;
	}
	
	public static int[] createNewArray(int[] ar, int length, int counterMax) {
		
		int[] newArray = new int [length];
		int counter = 0;
		int index = 0;
		
		for(int i = 0; i < ar.length;) {
			
			for(int j = 0; j < ar.length; j++) {				
				if(ar[i] == ar[j]) {
					counter++;	 				
				}								
			}
			
			if(counter == counterMax) {
				newArray[index] = ar[i];
				index++;
			}	
						
			counter = 0;
			i++;
		}
		show(newArray);
		return newArray;
	}
	
	public static void min(int[] ar) {
		
		int min = ar[0];
		 
		if(ar.length == 1) {
			min = ar[0];
		}
		else {
			for (int i = 0; i < ar.length - 1; i++) {
				if((ar[i + 1]) < min) {
					min = ar[i + 1];
				} 			
			}	
		}
				
		System.out.println("Минимальное значение в массиве = " + min);
	}
	
	
}
