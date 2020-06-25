package by.epam.javaonline.programmingclass.simpleclass.task4;

import java.util.Date;
import java.util.Scanner;

public class Task4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		int item;
		boolean flag = true;
		Scanner in = new Scanner(System.in);

		Train[] trains = { new Train("Варшава", 134, new Date(2017, 12, 20, 12, 23)),
				new Train("Лондон", 100, new Date(2017, 12, 20, 11, 34)),
				new Train("Париж", 154, new Date(2017, 12, 20, 6, 54)),
				new Train("Лондон", 200, new Date(2017, 12, 20, 8, 23)),
				new Train("Варшава", 103, new Date(2017, 12, 20, 9, 12)) };

		Train train = new Train(trains);

		while (flag == true) {
			System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Show train list" + "\r" + "\t\t"
					+ "2 - Sort list train by train number" + "\r" + "\t\t" + "3 - Search for a train by number" + "\r"
					+ "\t\t" + "4 - Sort by number and name of station" + "\r" + "\t\t" + "5-Exit");
			System.out.print("Your choice - ");
			while (!in.hasNextInt()) {
				in.next();
				
				System.out.println("Select menu item:" + "\r" + "\t\t" + "1 - Show train list" + "\r" + "\t\t"
						+ "2 - Sort list train by train number" + "\r" + "\t\t" + "3 - Search for a train by number"
						+ "\r" + "\t\t" + "4 - Sort by number and name of station" + "\r" + "\t\t" + "5 - Exit");
				System.out.print("Your choice - ");
			}
			item = in.nextInt();
			System.out.println("Item = " + item);
			switch (item) {

			case 1:
				train.display();
				break;
			case 2:
				train.quickSortByNumber();
				train.display();
				break;
			case 3:
				train.searchByNumber();
				break;
			case 4:
				train.sortByDestinationName();
				break;
			case 5:
				flag = false;
				break;
			}
		}
		in.close();

	}
}
