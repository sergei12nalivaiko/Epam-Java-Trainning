package by.epam.javaonline.string.stringBuilder;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”. 

public class Task4 {

	public static void main(String[] args) {

		String computerScience = "информатика";
		String cake = "торт";
		String result = new String();

		char[] comSciArray = computerScience.toCharArray();
		char[] cakeArray = cake.toCharArray();

		for (int i = 0; i < cake.length(); i++) {
			for (char ch : comSciArray) {
				if (cakeArray[i] == ch) {
					result += String.valueOf(ch);
					break;
				}
			}
		}
		System.out.println(result);
	}
}
