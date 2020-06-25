package by.epam.javaonline.algoritmization.onedimensionalarray;

import java.util.*;

//���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ��� �� �����, 
//������� ������� Z, ����������. ���������� ���������� �����.

public class Task2 {

	public static void main(String[] args) {

		double[] ar = { 1, 1.1, 10.123, 99, -100, 59, 86, 45 };
		int counter = 0;
		double z;
		show(ar);
		z = enterData();
		show(replace(z, ar, counter));
	}

	public static double enterData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������������� �����");
		System.out.print(">>");

		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("������� �������������� �����");
			System.out.print(">>");
		}

		double value = scanner.nextDouble();
		return value;
	}

	public static void show(double[] ar) {

		for (double i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}

	public static double[] replace(double z, double[] ar, int counter) {

		double[] ar1 = new double[ar.length];
		int ar1Counter = 0;

		for (double i : ar) {

			if (i > z) {
				ar1[ar1Counter] = z;
				counter++;

			} else {
				ar1[ar1Counter] = i;
			}

			ar1Counter++;
		}
		System.out.println("���������� ����� = " + counter);
		return ar1;
	}

}
