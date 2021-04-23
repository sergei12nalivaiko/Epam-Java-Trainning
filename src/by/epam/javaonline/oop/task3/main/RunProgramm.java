package by.epam.javaonline.oop.task3.main;


import by.epam.javaonline.oop.task3.bean.Calendar;

import by.epam.javaonline.oop.task3.bean.Date;

public class RunProgramm {

	public static void main(String[] args) {
		
		Calendar calendar = new Calendar(2020);
		calendar.createCalendar();
		calendar.addWeekendsAndHolidays(new Date(2020,12,28), "EHD");
		calendar.getWeekendsAndHolidays().isHoliday();
		calendar.getWeekendsAndHolidays().isWeekend();
		
		
	}

}
