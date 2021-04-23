package by.epam.javaonline.oop.task3.bean;


public class Date {
	
	private  static final String[] REGULARYEAR = {"January - 31", "February - 28", "March - 31", "April - 30",
												"May - 31", "June - 30", "Jule - 31", "August - 31",
												"September - 30", "October - 31", "November - 30", "December - 31"};
	
	private static final String[] LEAPYEAR = {"January - 31", "February - 29", "March - 31", "April - 30",
											"May - 31", "June - 30", "Jule - 31", "August - 31",
											"September - 30", "October - 31", "November - 30", "December - 31"};
	
	private int year;
	private int month;
	private int day;
	
	
	
	public Date() {
		super();
	}

	public Date(int year) {
		super();
		this.year = year;
	}

	public Date(int year, int month) {
		super();
		this.year = year;
		setMonth(month);
	}

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		setMonth(month);
		setDay(day);
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month > 12 || month < 1 ? 0 : month;
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(year % 4 == 0) {
			this.day = day > Integer.parseInt(Date.LEAPYEAR[getMonth() - 1].replaceAll("[^0-9]", "")) || day < 1 ? 0 : day;
		}else {
			this.day = day > Integer.parseInt(Date.REGULARYEAR[getMonth() - 1].replaceAll("[^0-9]", "")) || day < 1 ? 0 : day;		
		}
	}
	
	public static String[] getRegularyear() {
		return REGULARYEAR;
	}

	public static String[] getLeapyear() {
		return LEAPYEAR;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
	

}
