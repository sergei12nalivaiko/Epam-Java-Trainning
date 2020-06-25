package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно простыми. 

public class Task6 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = enterData();
		b = enterData();
		c = enterData();

		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);

		if (isSimple(a, b, c)) {
			System.out.println("„исла €вл€ютс€ взаимно простыми");
		} else {
			System.out.println("„исла не €вл€ютс€ взаимно простыми");
		}

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите значение переменной ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("¬ведите значение переменной ");
			System.out.println("«начение должно быть целым числом ");
			System.out.print(">>");

		}

		n = scanner.nextInt();

		return n;
	}

	public static int nod(int a, int b) {

		if (b == 0) {
			return a;

		} else {
			return nod(b, a % b);
		}
	}

	public static boolean isSimple(int a, int b, int c) {

		return nod(nod(a, b), c) == 1;
	}

}
