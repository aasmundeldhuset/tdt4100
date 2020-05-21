package inheritance;

import java.util.ArrayList;
import java.util.List;

public class TrainProgram {
    public static void main(String[] args) {
        TrainCar tc = new PassengerCar(42);
        TrainCar tc2 = new CargoCar(20000, "steel", 12000);
        PassengerCar pc = new PassengerCar("blue", 25000, 23);
        CargoCar cc = new CargoCar(15000, "green", 45000);
        
        Train t = new Train();
        t.addCar(tc);
        t.addCar(tc2);
        t.addCar(pc);
        t.addCar(cc);
        System.out.println(t.getWeight());
    }
}
