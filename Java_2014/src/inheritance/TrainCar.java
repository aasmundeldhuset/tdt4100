package inheritance;

public abstract class TrainCar implements Vehicle {
    private String color;
    private int weight;
    private TrainCar nextCar;
    private static int numTrainCars;
    
    public TrainCar() {
        this("red", 20000);
    }
    
    public static int getTrainCars() {
        return numTrainCars;
    }
    
    public TrainCar(String color, int weight) {
        setColor(color);
        setWeight(weight);
        numTrainCars++;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setNextCar(TrainCar nextCar) {
        this.nextCar = nextCar;
    }
    
    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
        else
            throw new IllegalArgumentException();
    }
    
    public void setColor(String color) {
        if (color.equals("red") || color.equals("green") || color.equals("blue"))
            this.color = color;
        else
            throw new IllegalArgumentException();
    }
    
    public abstract int getLoadedWeight();
    
    public void makeNoise() {
        System.out.println("Toot!");
    }
    
    public String toString() {
        return "This is a " + color + " "
                + this.getType() + " that weighs " + weight + " kg";
    }
    
    public abstract String getType();
    
    public int getSubtrainWeight() {
        if (nextCar == null) {
            return getLoadedWeight();
        }
        else {
            return nextCar.getSubtrainWeight()
                    + getLoadedWeight();
        }
    }
}
