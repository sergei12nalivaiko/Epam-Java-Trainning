package by.epam.javaonline.string.array;

// ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ �������� �������� �� ��������� �������. 
//������� ������� � ������ �������. 

public class Task5 {

	public static void main(String[] args) {

		String str = "     Every      word       has       a       meaning         ";
		deleteSpaces(str);
	}

	public static void deleteSpaces(String str) {
		
		int index = 0;
		char[] ar = str.toCharArray();
		char[] arStr = new char[ar.length];

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

		System.out.println();

		for (int j = 0; j < ar.length - 1; j++) {
			if (ar[j] != ' ' || (ar[j] == ' ' && ar[j + 1] != ' ')) {
				arStr[index] = ar[j];
				index++;
			}
		}
		
		arStr.toString();
	
		System.out.println(arStr);		
	}
}
