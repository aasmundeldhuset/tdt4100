public class Date {
	private final int year;
	private final int month;
	private final int day;
	
	private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String[] args) {
		try {
			Date d = new Date(-2010, 1, 1);
			System.out.println("Success");
		}
		catch (InvalidDateValue e) {
			System.out.println("Failure");
		}
		finally {
			System.out.println("This happens anyway, even if an exception is thrown but not caught, and even if a return statement is placed in try or catch");
		}
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		if (!validYear())
			throw new InvalidDateValue("Invalid year");
		if (!validMonth())
			throw new InvalidDateValue("Invalid month");
		if (!validDay())
			throw new InvalidDateValue("Invalid day");
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public boolean validYear() {
		return 1 <= year && year <= 3000;
	}
	
	public boolean validMonth() {
		return 1 <= month && month <= 12;
	}
	
	public boolean validDay() {
		int maxDays = getDaysInMonth();
		return 1 <= day && day <= maxDays;
	}
	
	private int getDaysInMonth() {
		if (month == 2) {
			if (isLeapYear())
				return 29;
			else
				return 28;
		}
		else {
			return daysInMonth[month - 1];
		}
	}
	
	public boolean isLeapYear() {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}
	
	public String toString() {
		return "" + formatNumber(year, 4) + "-" + 
		formatNumber(month, 2) + "-" + formatNumber(day, 2);
	}
	
	private static String formatNumber(int number, int digits) {
		int digitCheck = number;
		String result = "";
		int limit = 1;
		for (int i = 0; i < digits - 1; ++i)
			limit *= 10;
		
		while (digitCheck < limit) {
			digitCheck *= 10;
			result += "0";
		}
		
		return result + number;
	}	
}
