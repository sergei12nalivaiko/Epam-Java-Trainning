package by.epam.javaonline.string.array;

//Замените в строке все вхождения 'word' на 'letter'. 

public class Task2 {

	public static void main(String[] args) {

		String str = "Every word has a meaning";
		System.out.println(str);
		taskDecision(str);
	}

	public static void taskDecision(String str) {

		String newStr = new String();
		System.out.println(newStr);
		newStr = replace(str);
		System.out.println(newStr);
	}

	public static String replace(String str) {

		String newString = new String();

		String[] ar = str.split(" ");

		for (int i = 0; i < ar.length; i++) {
			if (ar[i].equals("word")) {
				ar[i] = "letter";
			}
			newString = newString.concat(ar[i] + " ");
		}
		return newString;
	}
}
