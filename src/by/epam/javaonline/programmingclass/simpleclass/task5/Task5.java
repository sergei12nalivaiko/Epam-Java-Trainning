package by.epam.javaonline.programmingclass.simpleclass.task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		boolean flag = true;
		int item;
		Scanner in = new Scanner(System.in);
		DecimalCounter dc = new DecimalCounter();

		while (flag == true) {
			System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Show counter" + "\r" + "\t\t"
					+ "2 - Increase counter" + "\r" + "\t\t" + "3 - Decrease counter" + "\r" + "\t\t" + "4 - Exit");
			System.out.print("Your choice - ");

			while (!in.hasNextInt()) {
				in.next();
				System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Show counter" + "\r" + "\t\t"
						+ "2 - Increase counter" + "\r" + "\t\t" + "3 - Decrease counter" + "\r" + "\t\t" + "4 - Exit");
				System.out.print("Your choice - ");
			}

			item = in.nextInt();		
			System.out.println("Item = " + item);

			switch (item) {
			case 1:
				System.out.println("Counter = " + dc.currentState());
				break;
			case 2:
				dc.increaseCounter();
				System.out.println("Counter = " + dc.currentState());
				break;
			case 3:
				dc.decreaseCounter();
				System.out.println("Counter = " + dc.currentState());
				break;
			case 4:
				flag = false;
				break;
			}
		}
		in.close();
	}
}
