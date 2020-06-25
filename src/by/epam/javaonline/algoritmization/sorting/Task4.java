package by.epam.javaonline.algoritmization.sorting;

import java.util.Scanner;

//Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an .
//Требуется переставить числа в порядке возрастания. 
//Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, 
//то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены 
//в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок. 


public class Task4 {

	public static void main(String[] args) {
		
		int arLength;

		arLength = enterData();

		int[] ar = new int[arLength];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100);
		}
		System.out.println("До сортировки");
		show(ar);
		bubbleSort(ar);
		System.out.println("После сортировки");
		show(ar);
	}
	
	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите размер массива ");
			System.out.print(">>");
		}

		n = scanner.nextInt();
		return n;
	}

	public static void show(int[] ar) {

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + "  |  ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] ar) {
		
		int out,in;
		int counter = 0;
		for(out=ar.length-1;out>1;out--) {
			for(in=0;in<out;in++) {
				if(ar[in]>ar[in+1]) {
					swap(in,in+1,ar);
					counter++;
				}
			}
		}
		System.out.println("Количество перестановок = " + counter);
	}
	
	public static void swap(int one, int two, int[] ar) {
		int temp = ar[one];
		ar[one] = ar[two];
		ar[two] = temp;
	}

}
