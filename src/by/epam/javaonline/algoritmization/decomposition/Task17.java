package by.epam.javaonline.algoritmization.decomposition;

import java.util.Scanner;

//�� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. 
//������� ����� �������� ���� ����������, ����� ��������� ����? 
//��� ������� ������ ������������ ������������. 

public class Task17 {

	public static void main(String[] args) {
		
		int number;
		number = enterData();
		substraction(number);
	}

	public static int enterData() {

		int x;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ������ ���� ����������� ������");
		System.out.println("������� �������� ���������� ");
		System.out.print(">>");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("�������� ������ ���� ����������� ������ ");
			System.out.println("������� �������� ���������� ");
			System.out.print(">>");
		}

		x = scanner.nextInt();
		
		return x;
	}
	
	public static int lengthNumber(int number) {

		int length = 0;

		while (number != 0) {
			number = number / 10;
			length++;
		}
		return length;
	}
	
	public static int summaSubstraction(int number) {

		int length;				
		int digit;		
		int summa = 0;
			
		length = lengthNumber(number);
		System.out.println(number);
		for (int i = 0; i < length; i++) {				
			digit = number % 10;
			summa +=digit;
			number = number / 10;		
		}
		System.out.println(summa);
		System.out.println("________");
		
		return summa;
	}
	
	public static void substraction(int number) {
		
		int summa;
		int counter=0;
		while(number!=0) {
			summa = summaSubstraction(number);
			number = number-summa;
			counter++;
		}
		System.out.println("���������� �������� = " + counter);
	}
}



