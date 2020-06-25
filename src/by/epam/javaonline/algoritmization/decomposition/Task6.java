package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//�������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������. 

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
			System.out.println("����� �������� ������� ��������");
		} else {
			System.out.println("����� �� �������� ������� ��������");
		}

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� ���������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� �������� ���������� ");
			System.out.println("�������� ������ ���� ����� ������ ");
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
