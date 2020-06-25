package by.epam.javaonline.string.array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case. 

public class Task1 {

	public static String snakeCase = "snake_case";
	public static char[] snakeCaseChar = snakeCase.toCharArray();

	public static void main(String[] args) {

		String[] camelCase = new String[] { "strOne", "strTwo", "strThree", "strFour" };

		show(camelCase);
		System.out.println();
		extractString(camelCase);
	}

	public static void show(String[] camelCase) {
		for (String i : camelCase) {
			System.out.print(i + "\t");
		}
	}

	public static String nameConversion(String replacementString) {

		char[] camelCaseChar = replacementString.toCharArray();
		char[] temp = new char[snakeCaseChar.length];

		for (int i = 0; i < temp.length; i++) {
			if (i <= camelCaseChar.length) {
				temp[i] = snakeCaseChar[i];
			} else {
				temp[i] = snakeCaseChar[i];
			}
		}

		String buffer = new String(temp);
		return buffer;
	}

	public static void extractString(String[] camelCase) {

		String temp;

		for (String s : camelCase) {
			temp = nameConversion(s);
			for (int i = 0; i < camelCase.length; i++) {
				camelCase[i] = temp;
			}
		}
		show(camelCase);
	}
}
