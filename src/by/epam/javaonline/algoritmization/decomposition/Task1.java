package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
НОК(a,b) = (a*b)/НОД(a,b)
 */

public class Task1 {

	public static void main(String[] args) {

		int a;
		int b;

		a = enterData();
		b = enterData();

		nok(a, b);
	}

	public static int enterData() {

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
			System.out.println("Наибольший общий делитель  = " + a);
			return a;

		} else {
			return nod(b, a % b);
		}
	}

	public static void nok(int a, int b) {

		int nok;
		nok = a * b / nod(a, b);
		System.out.println("Наименьшее общее кратное = " + nok);
	}

}
