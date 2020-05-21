package inheritance;

public abstract class TrainCar {
	private String color;
	protected int deadWeight;

	public TrainCar(String color, int deadWeight) {
		this.color = color;
		this.deadWeight = deadWeight;
	}

	@Override
	public String toString() {
		return "A " + color + " " + this.getType()
				+ " with dead weight "
				+ deadWeight;
	}

	public abstract String getType();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDeadWeight() {
		return deadWeight;
	}
}
