package by.epam.javaonline.string.stringBuilder;

public class Task10 {

	public static void main(String[] args) {

		int counter = 0;
		String str = "Belarus is the most beautiful country in the world. It is called the lungs of Europe. The population is about 10 million people.";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' | str.charAt(i) == '!' | str.charAt(i) == '?') {
				counter++;
			}
		}
		System.out.println("Количество предложений = " + counter);
	}

}
