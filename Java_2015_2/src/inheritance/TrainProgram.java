package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TrainProgram {
    public static void main(String[] args) {
        TrainCar tc = new PassengerCar("gray", 23456, 12);
        
        System.out.println(TrainCar.getNumCars());
        List<TrainCar> cars = new ArrayList<TrainCar>();
        cars.add(new PassengerCar("green", 10000, 28));
        cars.add(new CargoCar("black", 12000, 23000));
        //cars.add(new TrainCar("brown", 10000));
        System.out.println(TrainCar.getNumCars());
        
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car number " + i + " weighs "
                    + cars.get(i).getTotalWeight());
        }
        
        ArrayList<PassengerVehicle> pvs = new ArrayList<PassengerVehicle>();
        pvs.add(new PassengerCar("blue", 13245, 35));
        pvs.add(new Bus(12));
        
        for (int i = 0; i < pvs.size(); i++) {
            System.out.println(pvs.get(i).getNumPassengers());
        }
        
        print((PassengerVehicle) new PassengerCar("qwe", 234567, 45));
    }
    
    public static void print(TrainCar tc) {
        System.out.println(tc);
    }
    
    public static void print(PassengerVehicle pv) {
        System.out.println(pv.getNumPassengers() + " passengers");
    }
    
    public static void printList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
    
    public static List<Integer> makeList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        return numbers;
    }
}
