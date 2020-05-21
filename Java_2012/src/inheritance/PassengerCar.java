package inheritance;

public class PassengerCar extends TrainCar {
	private int numberOfPassengers;
	public final int PASSENGER_WEIGHT = 75;
	
	public PassengerCar(int deadWeight, int numberOfPassengers) {
		super(deadWeight);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public String toString() {
		return super.toString() + " carrying " + numberOfPassengers + " passengers";
	}
	
	public String getCarType() {
		return "passenger car";
	}
	
	public int getTotalWeight() {
		return getDeadWeight() + numberOfPassengers * PASSENGER_WEIGHT;
	}
	
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
}
