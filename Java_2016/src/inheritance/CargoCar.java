package inheritance;

public class CargoCar extends TrainCar {
	private int cargoWeight;

	public CargoCar(String color, int deadWeight) {
		super(color, deadWeight);
		this.cargoWeight = 42;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getCargoWeight();
	}

	@Override
	public String getType() {
		return "cargo car";
	}

	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
}
