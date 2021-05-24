package inheritance;

public abstract class TrainCar implements Vehicle {
    private String color;
    private final int deadWeight;

    public TrainCar(String color, int deadWeight) {
        this.color = color;
        if (deadWeight <= 0) {
            throw new IllegalArgumentException();
        }
        this.deadWeight = deadWeight;
    }

    public abstract int getWeight();

    public int getDeadWeight() {
        return deadWeight;
    }

    public void drive() {
        System.out.println("Tooot!");
    }
}
