package by.epam.javaonline.string.stringBuilder;

//ƒан текст (строка). Ќайдите наибольшее количество подр€д идущих пробелов в нем. 

public class Task1 {

	public static void main(String[] args) {

		String str = "  Ќайдите    наибольшее   количество подр€д   идущих пробелов в строке              ";
		spaceMaxNumber(str);

	}

	public static void spaceMaxNumber(String str) {

		int counter = 0;
		int counterReverse = 0;
		int counterMax = 0;
		int counterMaxReverse = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			while (!Character.isLetter(str.charAt(i))) {
				if (Character.isWhitespace(str.charAt(i))) {
					counter++;
				}
				break;
			}
			if (Character.isLetter(str.charAt(i + 1)) & counter > counterMax) {
				counterMax = counter;
				counter = 0;
			}
		}

		for (int i = str.length() - 1; i > 0; i--) {
			if (Character.isWhitespace(str.charAt(i))) {
				counterReverse++;
				if (Character.isLetter(str.charAt(i - 1)) && counterReverse > counterMaxReverse) {
					counterMaxReverse = counterReverse;
					counterReverse = 0;
				}
			}
		}

		if (counterMax > counterMaxReverse) {
			System.out.println("Max number of spaces = " + counterMax);
		} else {
			System.out.println("Max number of spaces = " + counterMaxReverse);
		}

	}
}
