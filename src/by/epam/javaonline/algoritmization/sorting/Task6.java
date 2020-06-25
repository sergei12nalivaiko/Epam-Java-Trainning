package by.epam.javaonline.algoritmization.sorting;

import java.util.Scanner;


//���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������. 
//�������� ��� ��������� �������: ������������ ��� �������� �������� ai � ai+1. 
//���� ai<=ai+1, �� ������������ �� ���� ������� ������. ���� ai>ai+1 , 
//�� ������������ ������������ � ���������� �� ���� ������� �����. ��������� �������� ���� ����������. 


public class Task6 {

	public static void main(String[] args) {

		int n;

		n = enterData();
		double[] ar = new double[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = Math.random() * 100;
		}

		System.out.println("�� ����������");
		show(ar);
		shellSort(ar);
		System.out.println("����� ����������");
		show(ar);

	}

	public static int enterData() {

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ ������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("������� ������ ������� ");
			System.out.print(">>");
		}

		n = scanner.nextInt();
		return n;
	}

	public static void show(double[] ar) {

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + "  |  ");
		}
		System.out.println();
	}

	public static void shellSort(double[] ar) {

		int inner, outer;
		double temp;
		int h = 1;

		while (h <= ar.length / 3) {
			h = h * 3 + 1;
		}

		while (h > 0) {
			for (outer = h; outer < ar.length; outer++) {
				temp = ar[outer];
				inner = outer;
				while (inner > h - 1 && ar[inner - h] >= temp) {
					ar[inner] = ar[inner - h];
					inner -= h;
				}
				ar[inner] = temp;
			}
			h = (h - 1) / 3;
		}
	}

}
