package inheritance;

public class CargoCar extends TrainCar {
	private int cargoWeight;

	public CargoCar(String color, int emptyWeight, int cargoWeight) {
		super(color, emptyWeight);
		this.cargoWeight = cargoWeight;
	}

	public int getTotalWeight() {
		return this.getEmptyWeight() + this.cargoWeight;
	}
}
