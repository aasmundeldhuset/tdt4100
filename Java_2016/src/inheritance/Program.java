package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
//		PassengerCar pc = new PassengerCar("Red", 10);
//		CargoCar cc = new CargoCar("Blue", 15);
//		DiningCar dc = new DiningCar(20);
//
//		HumanCar hc = dc;
//
//		CargoCar cc2 = (CargoCar) hc;
//
//
//		TrainCar tc = pc;
//		TrainCar tc2 = cc;
//		List<TrainCar> cars = new ArrayList<>();
//		cars.add(cc);
//		cars.add(pc);
//		cars.add(new CargoCar("Pink", 24));
//		for (TrainCar trainCar : cars) {
//			System.out.println(trainCar.toString());
//		}
	}

	public static void doSomething(TrainCar tc) {
		if (tc instanceof CargoCar) {
			System.out.println(
					((CargoCar) tc).getCargoWeight()
			);
		} else if (tc instanceof PassengerCar) {
			System.out.println(
					((PassengerCar) tc).getPassengerCount()
			);
		}
	}
}
