package by.epam.javaonline.string.stringBuilder;

//���������, �������� �� �������� ����� �����������. 

public class Task3 {

	public static void main(String[] args) {

		isPalindrom("�����");
		isPalindrom("���������");
	}

	public static void isPalindrom(String str) {

		StringBuilder sb = new StringBuilder(str);

		if (sb.toString().equals(sb.reverse().toString())) {
			System.out.println("����� " + str + " �������� �����������");
		} else {
			System.out.println("����� " + str + " �� �������� �����������");
		}
	}
}
