package by.epam.javaonline.algoritmization.decomposition;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать 
//декомпозицию. 

public class Task16 {

	public static void main(String[] args) {

		int max = 50;

		summa(max);
	}

	public static void summa(int max) {

		int length;
		int summaLength;
		int temp;
		int digit;
		int summaDigit;
		int summa = 0;
		int counter = 0;
		int evenCounter=0;

		for (int i = 1; i < max; i++) {
			length = lengthNumber(i);
			temp = i;
			for (int j = 0; j < length; j++) {
				digit = temp % 10;
				if (!isEven(digit)) {
					counter++;
				}
				temp = temp / 10;
			}
			if (length == counter) {
				System.out.print(i + "\t");
				summa += i;
			}
			counter = 0;
		}
		System.out.println();
		System.out.println("Сумма = " + summa);
		summaLength=lengthNumber(summa);
		for (int j = 0; j < summaLength; j++) {			
			summaDigit = summa % 10;
			if (isEven(summaDigit)) {
				evenCounter++;
			}
			summa = summa / 10;
		}
		System.out.println("Число положительных чисел в сумме = "+evenCounter);
	}

	public static int lengthNumber(int number) {

		int length = 0;

		while (number != 0) {
			number = number / 10;
			length++;
		}
		return length;
	}

	public static boolean isEven(int n) {

		if (n % 2 != 0) {
			return false;
		}
		return true;
	}

}
