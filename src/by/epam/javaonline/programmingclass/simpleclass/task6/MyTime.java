package by.epam.javaonline.programmingclass.simpleclass.task6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyTime {
	private GregorianCalendar gc;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int second;
	private int minute;

	public MyTime() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		this.gc = new GregorianCalendar(year, month, day, hour, minute, second);
	}

	public MyTime(int year, int month, int day, int hour, int minute, int second) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.gc = new GregorianCalendar(year, month, day, hour, minute, second);
	}

	public void setYear(int year) {
		if (year < 0) {
			this.gc.set(Calendar.YEAR, 0);
		} else {
			this.gc.set(Calendar.YEAR, year);
		}
	}

	public int getYear() {
		return this.gc.get(Calendar.YEAR);
	}

	public void setMonth(int month) {
		if (month < 0 || month > 11) {
			this.gc.set(Calendar.MONTH, 0);
		} else {
			this.gc.set(Calendar.MONTH, month);
		}
	}

	public int getMonth() {
		return this.gc.get(Calendar.MONTH);
	}

	public void setDay(int day) {
		if (day < 0 || day > 30) {
			this.gc.set(Calendar.DAY_OF_MONTH, 0);
		} else {
			this.gc.set(Calendar.DAY_OF_MONTH, day);
		}
	}

	public int getDay() {
		return this.gc.get(Calendar.DAY_OF_MONTH);
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			this.gc.set(Calendar.HOUR, 0);
		} else {
			this.gc.set(Calendar.HOUR, hour);
		}
	}

	public int getHour() {
		return this.gc.get(Calendar.HOUR);
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 53) {
			this.gc.set(Calendar.MINUTE, 0);
		} else {
			this.gc.set(Calendar.MINUTE, minute);
		}
	}

	public int getMinute() {
		return this.gc.get(Calendar.MINUTE);
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			this.gc.set(Calendar.SECOND, 0);
		} else {
			this.gc.set(Calendar.SECOND, second);
		}
	}

	public int getSecond() {
		return this.gc.get(Calendar.SECOND);
	}

	public GregorianCalendar getGC() {
		return this.gc;
	}

	public void setDateTime() {

		int item;
		int index = 0;
		Scanner in = new Scanner(System.in);
		String[] myDate = { "year", "month", "day", "hours", "minuties", "second" };

		for (int i = 0; i < myDate.length; i++) {
			System.out.printf("Set [%s] - ", myDate[i]);
			while (!in.hasNextInt()) {
				in.next();
				System.out.print("Set year - ");
			}
			item = in.nextInt();
			switch (index) {
			case 0:
				setYear(item);
				index++;
				break;
			case 1:
				setMonth(item);
				index++;
				break;
			case 2:
				setDay(item);
				index++;
				break;
			case 3:
				setHour(item);
				index++;
				break;
			case 4:
				setMinute(item);
				index++;
				break;
			case 5:
				setSecond(item);
				break;
			}
		}
	}

	public void setDateHour() {

		int item;
		Scanner in = new Scanner(System.in);

		System.out.print("Set hour - ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Set year - ");
		}
		item = in.nextInt();
		setHour(item);
	}

	public void setDateMinute() {

		int item;
		Scanner in = new Scanner(System.in);

		System.out.print("Set minuties - ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Set minuties - ");
		}
		item = in.nextInt();
		setMinute(item);
	}

	public void setDateSecond() {

		int item;
		Scanner in = new Scanner(System.in);

		System.out.print("Set seconds - ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Set seconds - ");
		}
		item = in.nextInt();
		setSecond(item);
	}
}
