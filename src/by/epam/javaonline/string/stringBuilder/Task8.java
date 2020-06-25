package by.epam.javaonline.string.stringBuilder;

import java.util.Scanner;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
//Случай, когда самых длинных слов может быть несколько, не обрабатывать. 

public class Task8 {

	public static void main(String[] args) {
		
		String str;	
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);	
		int counter=0;
		int counterMax=0;
		
		System.out.println("Введите строку:");
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
		System.out.println("Длинна самого длинного слова = "+ counter+ " букв;"+ "\tслово - "+sb);
	
		in.close();

	}

}
