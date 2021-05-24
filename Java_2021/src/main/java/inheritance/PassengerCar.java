package inheritance;

import java.util.ArrayList;
import java.util.List;

public class PassengerCar extends TrainCar implements PassengerTransport {
    private int numPassengers;

    public PassengerCar(String color, int deadWeight, int numPassengers) {
        super(color, deadWeight);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public int getWeight() {
        return getDeadWeight() + numPassengers * 75;
    }

    public static void main(String[] args) {
        List<TrainCar> cars = new ArrayList<>();
        cars.add(new PassengerCar("red", 10000, 5));
        for (TrainCar car : cars) {
            System.out.println(car.getWeight());
        }
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(cars.get(0));
        vehicles.add(new Bus());
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}
