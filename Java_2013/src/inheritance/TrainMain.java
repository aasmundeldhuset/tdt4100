package inheritance;

import java.util.ArrayList;

public class TrainMain {
    public static void main(String[] args) {
        PassengerCar pc = new PassengerCar("red", 15000, 23);
        CargoCar cc = new CargoCar("green", 18500, 25000);
        TrainCar tc = pc;
        System.out.println(tc.getColor());
        System.out.println(tc.getOwnWeight());
        tc = cc;
        System.out.println(tc.getColor());
        System.out.println(tc.getOwnWeight());
        
        ArrayList<TrainCar> cars = new ArrayList<TrainCar>();
        cars.add(pc);
        cars.add(cc);
        
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
            System.out.println(cars.get(i).getTotalWeight());
        }
        
        ArrayList<PassengerVehicle> vehicles = new ArrayList<PassengerVehicle>();
        vehicles.add(pc);
        vehicles.add(new Bus(5000, 18));
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getNumPassengers());
        }
    }
}
