package inheritance;

public abstract class TrainCar {
    private String color;
    private final int emptyWeight;

    public TrainCar(String color, int emptyWeight) {
        this.color = color;
        if (emptyWeight <= 0) {
            throw new IllegalArgumentException();
        }
        this.emptyWeight = emptyWeight;
    }

    public TrainCar(int emptyWeight) {
        this("red", emptyWeight);
    }

    //public abstract int getWeight();

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public abstract int getTotalWeight();

    public String getColor() {
        return color;
    }

    public void drive() {
        System.out.println("Tooot!");
    }

    public String toString() {
        return "A " + color + " train car that weighs " + emptyWeight + " kg";
    }
}
