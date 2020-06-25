package by.epam.javaonline.string.stringBuilder;

//В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {

	public static void main(String[] args) {

		String str = "Java is the most popular programming language";
		insertB(str);
	}

	public static void insertB(String str) {

		StringBuilder sb = new StringBuilder(str);

		System.out.println("Вefore - " + sb);

		char[] chAr = str.toCharArray();
		
		for (int i = 0; i < chAr.length; i++) {
			if (chAr[i] == 'a') {
				sb.setCharAt(i + 1, 'b');
			}
		}

		System.out.println("After - " + sb);
	}
}
