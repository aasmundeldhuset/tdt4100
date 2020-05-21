package inheritance;

public class CargoCar extends TrainCar {
	private int cargoWeight;
	
	public CargoCar(int deadWeight, int cargoWeight) {
		super(deadWeight);
		this.cargoWeight = cargoWeight;
	}
	
	public String toString() {
		return super.toString() + " and carrying " + cargoWeight + " kg of cargo";
	}
	
	public String getCarType() {
		return "cargo car";
	}
	
	public int getTotalWeight() {
		return getDeadWeight() + cargoWeight;
	}
	
	public int getCargoWeight() {
		return cargoWeight;
	}
	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
}
