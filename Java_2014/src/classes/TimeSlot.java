package classes;

public class TimeSlot {
    private final String description;
    private final int startMinutes;
    private final int endMinutes;
    
    public TimeSlot(String description, int hours, int minutes, int duration) {
        this.description = description;
        this.startMinutes = hours * 60 + minutes;
        this.endMinutes = this.startMinutes + duration;
    }
    
    public String toString() {
        return description + "@" + getStartTime() + "-" + getEndTime();
    }
    
    public DayTime getStartTime() {
        return new DayTime(startMinutes);
    }
    
    public DayTime getEndTime() {
        return new DayTime(endMinutes);
    }
    
    public int getDuration() {
        return endMinutes - startMinutes;
    }
    
    public boolean contains(int hours, int minutes) {
        int minutesFromMidnight = hours * 60 + minutes;
        return minutesFromMidnight >= startMinutes && minutesFromMidnight < endMinutes;
    }
    
    public boolean overlaps(TimeSlot timeSlot) {
        return timeSlot.endMinutes > this.startMinutes && timeSlot.startMinutes < this.endMinutes;
    }
}
