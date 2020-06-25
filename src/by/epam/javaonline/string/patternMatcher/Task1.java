package by.epam.javaonline.string.patternMatcher;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {

		int item;
		boolean flag = true;
		Scanner in = new Scanner(System.in);

		String str = "The Republic of Belarus is situated in the centre of Europe. It borders on Latvia, Lithuania, the Ukraine, Russia and Poland. Its territory is much larger than such countries as Austria, Belgium, Bulgaria, Greece and a number of others. Its present population is about 12 million people. Belarus is a land of vast plains and picturesque hills, thick forests and green meadows, deep blue lakes and flowing rivers. Forests cover 2/5 of Belarus, they are scattered all over the country. There are a lot of rivers and lakes in our country. The Dnieper, Pripyat, Beresins, Sozh, Zapadnaya Dvina, Neman are the biggest rivers with more then 500 kilometers in length. The largest lake in Belarus is Lake Naroch which stretches 13 kilometers from West to East. It is a very popular recreation area in our country. Belarus has a moderately continental climate due to the influence of the Atlantic Ocean with a warm winter and warm summer."
				+ "\r\n"
				+ "To most of the world, Belarus is thought of as a relatively new country in Central Europe. For Belorussians, it's an ancient land. The history of Belarus goes back to ancient times beginning with the Polotsk Principality in the 10th century."
				+ "\r\n"
				+ "From the 13th century until the 16th centuiy the territory of present -day Belarus was the core of the Grand Duchy of Lithuania in which Belarussian was the official language. It was one of the largest, most powerful and flourishing states, in Eastern Europe. The 16th century is considered to be the Golden Age of Belarussian history. This period was marked by prolific growth and foundation of many new cities and towns. There was significant progress in the development of culture and economy of the Belarussian people. As Belarus is situated in the centre of Europe many wars took place on its territory.";

		// Matcher matcher = Pattern.compile("([^.!?]+[.!?])\\s*").matcher(str);
		// while (matcher.find())
		// {
		// System.out.println(matcher.group(1));
		// }

		// splitParagraph(str);

		while (flag == true) {
			System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Sort paragraphs by number of sentences" + "\r"
					+ "\t\t" + "2 - In each sentence, sort words by length" + "\r" + "\t\t"
					+ "3 - Sort tokens in a sentence in descending order of the number of occurrences of a given character, and in case of equality by alphabet"
					+ "\r" + "\t\t" + "4 - Exit");
			System.out.print("Your choice - ");
			while (!in.hasNextInt()) {
				in.next();
				System.out.println("Enter an integer from 1 to 3!!!");
				System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Sort paragraphs by number of sentences"
						+ "\r" + "\t\t" + "2 - In each sentence, sort words by length" + "\r" + "\t\t"
						+ "3 - Sort tokens in a sentence in descending order of the number of occurrences of a given character, and in case of equality by alphabet"
						+ "\r" + "\t\t" + "4 - Exit");
				System.out.print("Your choice - ");
			}
			item = in.nextInt();
			System.out.println("Item = " + item);
			switch (item) {

			case 1:
				sortByNumSentences(str);
				break;
			case 2:
				sortByLenWords(str);
				break;
			case 3:
				System.out.println("число равно 9");
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}

	public static void sortByNumSentences(String str) {

		int counter = 0;
		String temp;
		String[] s = str.split("\r\n");

		System.out.println("Number of paragraphs = " + s.length);

		for (int i = 0; i < s.length; i++) {
			counter = s[i].split("[.!?]").length;
			System.out.println("The number of sentences in the paragraph under number " + i + " = " + counter);
		}

		for (int i = 0; i < s.length - 1; i++) {
			temp = s[i];
			if (s[i].split("[.!?]").length > s[i + 1].split("[.!?]").length) {
				s[i] = s[i + 1];
				s[i + 1] = temp;
			}
		}

		System.out.println("----------------------------------------------------------------------------");

		for (String st : s) {
			System.out.println(st);
		}

		System.out.println("----------------------------------------------------------------------------");
	}

	public static void sortByLenWords(String str) {

		int counter = 0;
		//Counting the number of sentences
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' | str.charAt(i) == '!' | str.charAt(i) == '?') {
				counter++;
			}
		}
		//break the text into sentences
		String[] s = str.split("\\s*[.!?]\\s*");
		
		String[][] word = new String[s.length][counter];
		
		for (String st : s) {
			System.out.println(st);
		}
		//break the sentences into words
		for (int i = 0; i < s.length; i++) {
			word[i] = s[i].split("\\s*[\\s*.,\\s*]\\s*");
		}

		for (int i = 0; i < counter; i++) {
			for (int j = 0; j < word[i].length; j++) {
				System.out.print(word[i][j] + "\t|");
			}
			System.out.println();
			System.out.println();
		}

	}
}
