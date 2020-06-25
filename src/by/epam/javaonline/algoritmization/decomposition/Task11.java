package by.epam.javaonline.algoritmization.decomposition;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 

public class Task11 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = 1234;
		b = 1234567;
		
		lengthNumberMax(a,b);	
	}
	
	public static int lengthNumber(int x) {

		int length = 0;

		while (x != 0) {
			x = x / 10;
			length++;
		}
		return length;
	}
	
	public static void lengthNumberMax(int a, int b) {
		
		int lengthA;
		int lengthB;
		lengthA = lengthNumber(a);	
		lengthB = lengthNumber(b);
	
		System.out.println("Длина числа " + a +" = " + lengthA);
		System.out.println("Длина числа " + b +" = " + lengthB);
		
		if(lengthA > lengthB) {
			System.out.println("Длины числа " + a + " больше числа " + b);
		}
		else if(lengthA < lengthB) {
			System.out.println("Длины числа " + b + " больше длины числа " + a);
		}
		else {
			System.out.println("Длины чисел равны");
		}
	}
}
