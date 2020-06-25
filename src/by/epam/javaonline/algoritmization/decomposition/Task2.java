package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//�������� �����(������) ��� ���������� ����������� ������ �������� ������� 
//����������� �����. 

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = enterData("������� �������� ���������� a = ");
		b = enterData("������� �������� ���������� b = ");
		c = enterData("������� �������� ���������� c = ");
		d = enterData("������� �������� ���������� d = ");

		int nod = nod(nod(nod(a, b), c), d);
		System.out.println("���������� ����� ��������  = " + nod);
	}

	public static int enterData(String valueName) {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� ���������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("�������� ������ ���� ����������� ����� ");
			System.out.println("������� �������� ���������� ");
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
