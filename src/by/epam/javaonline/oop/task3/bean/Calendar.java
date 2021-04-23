package by.epam.javaonline.oop.task3.bean;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	
	private static final String[] DAYOFWEEK = {"Monday", "Tuesday", "Wensday", "Thursday", "Friday", "Saturday", "Sunday"};
	private static final int DEFAULTYEAR = 2018;
	private static final int NUMBER_OF_MONTHS_IN_YEAR = 12;
	private WeekendsAndHolidays weekendsAndHolidays;
	private Month[] calendarYear;
	private int year;
    private int index = 0;//for 2018 year
	
	public Calendar() {
		super();
	}

	


	public Calendar(int year) {
		super();
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String[] isLeapYear() {
		if(year % 4 == 0) {
			return Date.getLeapyear();
		}else {
			return Date.getRegularyear();
		}
	}
	
	public WeekendsAndHolidays getWeekendsAndHolidays() {
		return weekendsAndHolidays;
	}
	
	public void createCalendar() {   //Create a calendar for 2020 - 2021
		int firstJanuaryDayNumber;
		int differenceOfYears;
		int numberOfDaysInMonth;
		
		calendarYear = new Month [NUMBER_OF_MONTHS_IN_YEAR];
		if((year - 1) % 4 == 0) {
			differenceOfYears = year % 4 == 0 ? year - DEFAULTYEAR + 1 : year - DEFAULTYEAR + 2;
		}else {
			differenceOfYears = year % 4 == 0 ? year - DEFAULTYEAR + 1 : year - DEFAULTYEAR;
		}
			
		firstJanuaryDayNumber = differenceOfYears > DAYOFWEEK.length - 1 ? differenceOfYears / DAYOFWEEK.length : index + differenceOfYears;
				
		int indexOfDay = firstJanuaryDayNumber - 1;
		
		for (int month = 0; month < NUMBER_OF_MONTHS_IN_YEAR; month++) {
			numberOfDaysInMonth = Integer.parseInt(isLeapYear()[month].replaceAll("[^0-9]", ""));
			calendarYear[month] = new Month();
			
			for(int dayNumber = 1, numberOfWeek = 0;  dayNumber <= numberOfDaysInMonth && numberOfWeek <= 5; ) {
							
				if(indexOfDay < DAYOFWEEK.length) {							
					calendarYear[month].month[numberOfWeek][indexOfDay] = dayNumber;			
					indexOfDay++;				
					dayNumber++;								
				}else {
					indexOfDay = 0;
					numberOfWeek++;				
				}					
			}		
			calendarYear[month].display(month);
		}		
	}
	
	public class Month{
		
		private static final int NUMBER_DAYS_PERWEEK = 7;
		private static final int MAX_NUMBER_WEEKS = 6;
		int[][] month;
		
		public Month() {
			super();
			month = new int[MAX_NUMBER_WEEKS][NUMBER_DAYS_PERWEEK];
		}
		
		public void display(int numberOfMonth) {
			String nameOfMonth = Date.getLeapyear()[numberOfMonth].replaceAll("[^a-zA-Z]", "");
			System.out.println(nameOfMonth);
			System.out.println("M\t" + "T\t" + "W\t" + "T\t" + "F\t" + "S\t" + "S\t");
			System.out.println("_______________________________________________________");
			
			for (int i = 0; i < MAX_NUMBER_WEEKS; i++) {				
				for (int j = 0; j < NUMBER_DAYS_PERWEEK; j++) {
					System.out.print(month[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}		
	}
	
	public WeekendsAndHolidays addWeekendsAndHolidays(Date date, String str) {
		return weekendsAndHolidays = new WeekendsAndHolidays(date,str);
	}
	

	public class WeekendsAndHolidays{
		
		private final Date[] HOLIDAYS = {new Date(year,1,1),new Date(year,1,2),new Date(year,1,7),new Date(year,3,8),
										new Date(year,5,1),new Date(year,5,9),new Date(year,7,3),new Date(year,11,7),new Date(year,12,25)};
		private Date date;
		private String info;
		
		private List<WeekendsAndHolidays> list = new ArrayList<WeekendsAndHolidays>();
		
		
		public WeekendsAndHolidays() {
			super();
		}

		public WeekendsAndHolidays(Date date, String info) {
			super();
			this.date = date;
			this.info = info;		
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
		
		public boolean isHoliday() {
			for(int i = 0; i < HOLIDAYS.length; i++) {
				if(this.date.equals(HOLIDAYS[i])) {
					list.add(new WeekendsAndHolidays(date,info));
					System.out.println("spghsohbvoerhvbo");
					return true;
				}
			}
			return false;
		}
		
		public boolean isWeekend() {
			int[][] month = calendarYear[date.getMonth() - 1].month;
			for (int i = 0; i < 6; i++) {				
				for (int j = 5; j < 7; j++) {
					if(date.getDay() == month[i][j]) {
						System.out.println("LLLLLLLLLLLFFFFFFFFFFFFFFFFF");
						return true;
					}					
				}				
			}
			return false;
		}
	}
}
