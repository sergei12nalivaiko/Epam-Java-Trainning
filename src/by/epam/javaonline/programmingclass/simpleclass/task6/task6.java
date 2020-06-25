package by.epam.javaonline.programmingclass.simpleclass.task6;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		boolean flag = true;
		int item;
		Scanner in = new Scanner(System.in);
		MyTime myTime = new MyTime();

		while (flag == true) {
			System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Set date and time" + "\r" + "\t\t"
					+ "2 - Set hours " + "\r" + "\t\t" + "3 - Set minuties" + "\r" + "\t\t" + "4 - Set seconds" + "\r"
					+ "\t\t" + "5 - Exit");
			System.out.print("Your choice - ");

			while (!in.hasNextInt()) {
				in.next();
				System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Set date and time" + "\r" + "\t\t"
						+ "2 - Set hours " + "\r" + "\t\t" + "3 - Set minuties" + "\r" + "\t\t" + "4 - Set seconds"
						+ "\r" + "\t\t" + "5 - Exit");
				System.out.print("Your choice - ");
			}

			item = in.nextInt();
			System.out.println("Item = " + item);

			switch (item) {
			case 1:
				myTime.setDateTime();
				System.out.println(myTime.getGC().getTime());
				break;
			case 2:
				myTime.setDateHour();
				System.out.println(myTime.getGC().getTime());
				break;
			case 3:
				myTime.setDateMinute();
				System.out.println(myTime.getGC().getTime());
				break;
			case 4:
				myTime.setDateSecond();
				System.out.println(myTime.getGC().getTime());				
			case 5:
				flag = false;
				break;
			}
		}
		in.close();
	}
}
