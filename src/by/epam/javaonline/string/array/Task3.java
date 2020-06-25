package by.epam.javaonline.string.array;

// В строке найти количество цифр. 

public class Task3 {

	public static void main(String[] args) {

		String str = "В Беларуси проживает около 9.400.000";
		String example = "0123456789";
		taskDecision(str, example);
	}

	public static void taskDecision(String str, String example) {
		char[] ar = str.toCharArray();
		char[] arDigit = example.toCharArray();
		digitCounter(ar, arDigit);
	}

	public static void digitCounter(char[] ar, char[] arDigit) {

		int counter = 0;
		for (int i = 0; i < arDigit.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (arDigit[i] == ar[j]) {
					counter++;
				}
			}
		}
		System.out.println("Количество цифр = " + counter);
	}
}
