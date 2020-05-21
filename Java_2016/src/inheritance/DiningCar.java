package inheritance;

public class DiningCar extends TrainCar implements HumanCar {
	private int passengerCount;

	public DiningCar(int deadWeight) {
		super("Green", deadWeight);
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	@Override
	public String getType() {
		return "dining car";
	}
}
