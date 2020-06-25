package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//����������� �����, � ������ �������� n ����, ���������� ������ ����������, 
//���� ����� ��� ����, ����������� � ������� n, ����� ������ �����. 
//����� ��� ����� ���������� �� 1 �� k. ��� ������� ������ ������������ ������������. 

public class Task14 {

	public static void main(String[] args) {

		int k;
		k = enterData();
		findArmstrongNum(k);

	}

	public static int enterData() {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ������ ���� ����������� ������");
		System.out.println("������� �������� ���������� k ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("�������� ������ ���� ����������� ������ ");
			System.out.println("������� �������� ���������� k ");
			System.out.print(">>");
		}

		x = scanner.nextInt();
		if (2 >= x) {
			enterData();
		}
		return x;
	}

	public static void findArmstrongNum(int k) {

		int sum = 0;
		int count;
		int temp;

		for (int i = 1; i < k; i++) {
			temp = i;

			count = getDegree(i);

			temp = i;
			while (temp > 0) {
				sum += Math.pow(temp % 10, count);
				temp = temp / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
			sum = 0;
			count = 0;
		}
	}

	public static int getDegree(int i) {
		int degree = 0;

		do {
			degree += 1;
		} while ((i /= 10) > 0);
		return degree;
	}
}
