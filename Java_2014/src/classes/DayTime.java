package classes;

public class DayTime {
    public final int hours, minutes;
    
    public DayTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    
    public DayTime(int minutesFromMidnight) {
        this.hours = minutesFromMidnight / 60;
        this.minutes = minutesFromMidnight % 60;
    }
    
    public String toString() {
        return hours + ":" + minutes;
    }
}
