package by.epam.javaonline.algoritmization.decomposition;

//Дано натуральное число N. Написать метод(методы) для формирования массива, 
//элементами которого являются цифры числа N. 

public class Task10 {

	public static void main(String[] args) {

		int number = 123456789;
		int length;

		length = arrLength(number);
		System.out.println("Количество цифр в числе " + number + " = " + length);
		
		addElements(number, length);
	}

	public static int arrLength(int x) {

		int length = 0;

		while (x != 0) {
			x = x / 10;
			length++;
		}

		return length;
	}
	
	public static void addElements(int number, int length) {
		
        int[] arr = new int[length];

        while (number != 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = number % 10;
                arr[i] = digit;
                number = number / 10;
            }
        }
        show(arr);
    }
	
	public static void show(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}

	}
}
