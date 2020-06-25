package by.epam.javaonline.string.array;

//В строке найти количество чисел. 

public class Task4 {

	public static void main(String[] args) {
		
		String str = "100 : 5 = 20";
		countingNumbers(str);
	}

	public static void countingNumbers(String str) {
		
		char digit;
		char number;
		int counter=0;
		String str1=new String(str).concat(" ");
		
		for(int i =0;i<str1.length()-1;i++) {
			digit=str1.charAt(i);
			number = str1.charAt(i+1);
			if(Character.isDigit(digit)) {
				if(!Character.isDigit(number)) {
					counter++;
				}
			}
		}
		System.out.println(str1);
		System.out.println(counter);
	}
}
