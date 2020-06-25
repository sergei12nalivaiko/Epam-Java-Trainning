package by.epam.javaonline.algoritmization.decomposition;

//����� ��� ����������� n-������� �����, ����� � ������� �������� ������ ������������ 
//������������������ (��������, 1234, 5789). ��� ������� ������ ������������ ������������. 

public class Task15 {

	public static void main(String[] args) {

		int max = 1000;

		increasingNumber(max);
	}

	public static void increasingNumber(int max) {

		int maxDigit;
		int digit;
		int length;
		int counter=0;

		for (int i = 10; i < max; i++) {
			length = lengthNumber(i);
			int temp = i;
			for (int j = 0; j < length; j++) {				
				maxDigit = temp%10;
				temp = temp/10;
				digit = temp%10;
				if(max(maxDigit,digit)){
					counter++;
					continue;
				}
			}
			if(counter==length) {
				System.out.println(i);
			}
			counter=0;
		}
	}

	public static int lengthNumber(int number) {

		int length = 0;

		while (number != 0) {
			number = number / 10;
			length++;
		}
		return length;
	}

	public static boolean max(int maxDigit, int digit) {
		if (maxDigit > digit) {
			return true;
		}
		return false;
	}
}
