package by.epam.javaonline.algoritmization.decomposition;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 

public class Task7 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 9; i += 2) {

			System.out.println("Факториал числа " + i + " = " + factorial(i));
			sum += factorial(i);
		}

		System.out.println("Сумма факториалов = " + sum);
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}

	}

}
