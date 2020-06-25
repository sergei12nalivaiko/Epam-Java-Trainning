package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

// �������� ������ ����, ����������� ���������. ����� ����� ������� ����� � ������� ��� �� �����. 
//������, ����� ����� ������� ���� ����� ���� ���������, �� ������������. 

public class Task8 {

	public static void main(String[] args) {
		
		String str;	
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);	
		int counter=0;
		int counterMax=0;
		
		System.out.println("������� ������:");
		str = in.nextLine();
				
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				counter++;
				sb.append(str.charAt(i));
			}
			if(Character.isWhitespace(str.charAt(i)) && counter>counterMax) {
				counterMax=counter;
				sb.delete(0, sb.length());
				counter=0;
			}
		}
		System.out.println("������ ������ �������� ����� = "+ counter+ " ����;"+ "\t����� - "+sb);
	
		in.close();

	}

}
