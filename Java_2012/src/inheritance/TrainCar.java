package inheritance;

public abstract class TrainCar {
	private int deadWeight;
	private String colour;
	
	public TrainCar(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
	public String toString() {
		return "A " + this.colour + " " + this.getCarType() + " weighing " + getTotalWeight() + " kg";
	}
	
	public abstract String getCarType();
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getDeadWeight() {
		return deadWeight;
	}
	public int getTotalWeight() {
		return deadWeight;
	}
}
