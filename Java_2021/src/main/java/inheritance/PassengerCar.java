package inheritance;

import java.util.ArrayList;
import java.util.List;

public class PassengerCar extends TrainCar implements PassengerTransport {
    private int numPassengers;

    public PassengerCar(String color, int emptyWeight, int numPassengers) {
        super(color, emptyWeight);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public int getTotalWeight() {
        return this.getEmptyWeight() + this.numPassengers * 80;
    }

//    @Override
//    public int getWeight() {
//        return getEmptyWeight() + numPassengers * 75;
//    }

//    public static void main(String[] args) {
//        List<TrainCar> cars = new ArrayList<>();
//        cars.add(new PassengerCar("red", 10000, 5));
//        for (TrainCar car : cars) {
//            System.out.println(car.getWeight());
//        }
//        List<Vehicle> vehicles = new ArrayList<>();
//        vehicles.add(cars.get(0));
//        vehicles.add(new Bus());
//        for (Vehicle vehicle : vehicles) {
//            vehicle.drive();
//        }
//    }
    public static void main(String[] args) {
        PassengerCar pc = new PassengerCar("green", 12000, 32);
        CargoCar cc = new CargoCar("blue", 7000, 3000);
        System.out.println(pc.getTotalWeight());
        System.out.println(cc.getTotalWeight());
        List<TrainCar> cars = new ArrayList<>();
        cars.add(pc);
        cars.add(cc);
        for (TrainCar tc : cars) {
            System.out.println(tc.getTotalWeight());
        }

        List<PassengerTransport> pts = new ArrayList<>();
        pts.add(pc);
        pts.add(new Bus());
    }
}
