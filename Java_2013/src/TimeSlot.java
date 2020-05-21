public class TimeSlot {
    private final DayTime start;
    private final int duration;
    
    public TimeSlot(DayTime start, int duration) {
        this.start = start;
        this.duration = duration;
        getEnd();
    }
    
    public DayTime getStart() {
        return start;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public DayTime getEnd() {
        int minutes = (start.minutes + duration) % 60;
        int hours = start.hours + duration / 60;
        if (hours >= 24)
            throw new IllegalArgumentException();
        return new DayTime(hours, minutes);
    }
}
