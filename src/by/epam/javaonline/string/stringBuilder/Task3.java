package by.epam.javaonline.string.stringBuilder;

//Проверить, является ли заданное слово палиндромом. 

public class Task3 {

	public static void main(String[] args) {

		isPalindrom("доход");
		isPalindrom("экономика");
	}

	public static void isPalindrom(String str) {

		StringBuilder sb = new StringBuilder(str);

		if (sb.toString().equals(sb.reverse().toString())) {
			System.out.println("Слово " + str + " является палиндромом");
		} else {
			System.out.println("Слово " + str + " не является палиндромом");
		}
	}
}
