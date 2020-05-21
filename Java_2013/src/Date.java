public class Date {
    private static final int[] daysInMonth = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        validateDate(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        validateDate(this.day, this.month, year);
        this.year = year;
    }
    
    public void setMonth(int month) {
        validateDate(this.day, month, this.year);
        this.month = month;
    }
    
    public void setDay(int day) {
        validateDate(day, this.month, this.year);
        this.day = day;
    }
    
    public String toString() {
        String result = "";
        if (day < 10)
            result += "0";
        result += day + ".";
        if (month < 10)
            result += "0";
        result += month + "." + year;
        return result;
    }
    
    public void nextDate() {
        if (day == getDaysInMonth(month, year)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            }
            else {
                month++;
            }
        }
        else {
            day++;
        }
    }
    
    public void previousDate() {
        if (day > 1) {
            day--;
        }
        else {
            if (month == 1) {
                month = 12;
                year--;
            }
            else {
                month--;
            }
            day = getDaysInMonth(month, year);
        }
    }
    
    private void validateDate(int day, int month, int year) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException();
        int days;
        if (month == 2) {
            days = 28;//isLeapYear(year) ? 29 : 28;
        }
        else {
            days = daysInMonth[month - 1];
        }
        if (day < 1 || day > days)
            throw new IllegalArgumentException();
    }
    
    private int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return 28;//isLeapYear(year) ? 29 : 28;
        }
        else {
            return daysInMonth[month - 1];
        }
    }
}
