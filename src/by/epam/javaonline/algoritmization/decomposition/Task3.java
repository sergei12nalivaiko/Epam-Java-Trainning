package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной а, 
//используя метод вычисления площади треугольника. 

public class Task3 {

	public static void main(String[] args) {

		int a;

		a = enterData();
		squareTriangle(a);

	}

	public static void squareTriangle(int a) {

		double square;

		square = ((Math.sqrt(3) / 4) * Math.pow(a, 2)) * 6;
		System.out.println("Площадь шестиугольника = " + square);
	}

	public static int enterData() {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите значение стороны шестиугольника ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Значение должно быть целым числом ");
			System.out.println("Введите значение стороны шестиугольника ");
			System.out.print(">>");
		}

		x = scanner.nextInt();
		return x;
	}

}
