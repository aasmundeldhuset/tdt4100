package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {
    public static void main(String[] args) {
        ArrayList<Celebrity> cel = new ArrayList<Celebrity>();
        cel.add(new Celebrity("Knut Jørgen Røed Ødegaard", 45, 190));
        cel.add(new Celebrity("Per Hansen", 71, 183));
        cel.add(new Celebrity("Barack Obama", 42, 190));
        
        //Collections.sort(cel); // This only works if Celebrity implements Comparable
        Collections.sort(cel, new CelebrityAgeComparator()); // This will work anyway
        
        for (int i = 0; i < cel.size(); i++) {
            System.out.println(cel.get(i).getName());
        }
    }
}
