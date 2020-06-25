package by.epam.javaonline.algoritmization.decomposition;

//�������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����. 

public class Task11 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = 1234;
		b = 1234567;
		
		lengthNumberMax(a,b);	
	}
	
	public static int lengthNumber(int x) {

		int length = 0;

		while (x != 0) {
			x = x / 10;
			length++;
		}
		return length;
	}
	
	public static void lengthNumberMax(int a, int b) {
		
		int lengthA;
		int lengthB;
		lengthA = lengthNumber(a);	
		lengthB = lengthNumber(b);
	
		System.out.println("����� ����� " + a +" = " + lengthA);
		System.out.println("����� ����� " + b +" = " + lengthB);
		
		if(lengthA > lengthB) {
			System.out.println("����� ����� " + a + " ������ ����� " + b);
		}
		else if(lengthA < lengthB) {
			System.out.println("����� ����� " + b + " ������ ����� ����� " + a);
		}
		else {
			System.out.println("����� ����� �����");
		}
	}
}
