package comparable;

import java.util.Comparator;

public class CelebrityAgeComparator implements Comparator<Celebrity> {
    public int compare(Celebrity that, Celebrity other) {
        if (that.getAge() < other.getAge())
            return -1;
        else if (that.getAge() > other.getAge())
            return 1;
        else
            return 0;
    }
}
