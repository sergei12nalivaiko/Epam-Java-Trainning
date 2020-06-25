package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.Scanner;

//Дан целочисленный массив с количеством элементов п. 
//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
//Примечание. Дополнительный массив не использовать. 


public class Task10 {

	public static void main(String[] args) {
		
		int n;
		
		n = enterData();
		
		int[] ar = new int[n];
				
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random() * 15);
		}
		
		show(ar);
		squeeze(ar);

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
	
	public static void squeeze(int[] ar) {
		
        int currentIndex = 1;
        for (int i = 2; i < ar.length; i += 2) {
            ar[currentIndex] = ar[i];
            currentIndex++;
        }
        for (int i = currentIndex; i < ar.length; i++) {
            ar[i] = 0;
        }
		show(ar);
	}

}
