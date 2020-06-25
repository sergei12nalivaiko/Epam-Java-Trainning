package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех 
//натуральных чисел. 

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = enterData("Введите значение переменной a = ");
		b = enterData("Введите значение переменной b = ");
		c = enterData("Введите значение переменной c = ");
		d = enterData("Введите значение переменной d = ");

		int nod = nod(nod(nod(a, b), c), d);
		System.out.println("Наибольший общий делитель  = " + nod);
	}

	public static int enterData(String valueName) {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите значение переменной ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Значение должно быть натуральным число ");
			System.out.println("Введите значение переменной ");
			System.out.print(">>");
		}

		x = scanner.nextInt();
		return x;
	}

	public static int nod(int a, int b) {

		if (b == 0) {
			return a;

		} else {
			return nod(b, a % b);
		}
	}

}
