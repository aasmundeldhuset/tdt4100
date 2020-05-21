package inheritance;

public class Trains {
	public static void main(String[] args) {
		PassengerCar pc = new PassengerCar(1000, 10);
		pc.setColour("red");
		CargoCar cc = new CargoCar(2000, 3000);
		cc.setColour("blue");
		
		TrainCar[] cars = new TrainCar[2];
		cars[0] = cc;
		cars[1] = pc;
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].toString());
			if (cars[i] instanceof CargoCar)
				System.out.println(((CargoCar)cars[i]).getCargoWeight());
		}
	}
}
