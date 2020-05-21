package inheritance;

public class PassengerCar extends TrainCar implements HumanCar {
	private int passengerCount;

	public PassengerCar(String color, int deadWeight) {
		super(color, deadWeight);
		this.deadWeight *= 2;
	}

	@Override
	public String toString() {
		return super.toString() + " that contains " +
				passengerCount + " passengers";
	}

	@Override
	public String getType() {
		return "passenger car";
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
}
