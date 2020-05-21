import org.junit.Test;
import static org.junit.Assert.*;

public class DateTest {
    @Test
    public void whenDateIsLastDayOfYearThenNextDateShouldProduceFirstDayOfNextYear() {
        Date d = new Date(31, 12, 2012);
        
        d.nextDate();
        
        assertEquals(1, d.getDay());
        assertEquals(1, d.getMonth());
        assertEquals(2013, d.getYear());
    }
}
