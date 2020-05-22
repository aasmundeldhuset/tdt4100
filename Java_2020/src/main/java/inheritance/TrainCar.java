package inheritance;

public abstract class TrainCar {
    private String color;
    private final int deadWeight;
    private static int numCars;

    public TrainCar(String color, int deadWeight) {
        this.color = color;
        this.deadWeight = deadWeight;
        numCars++;
    }

    public static void main(String[] args) {

    }

    public static int getNumCars() {
        return numCars;
    }

    public TrainCar() {
        this("red", 20000);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDeadWeight() {
        return deadWeight;
    }

    public String toString() {
        return "A " + color + " " + this.getType() + " that weighs " + deadWeight + " kgs";
    }

    public abstract String getType();

    public abstract int getTotalWeight();
}
