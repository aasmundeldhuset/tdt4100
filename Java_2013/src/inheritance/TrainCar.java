package inheritance;

public abstract class TrainCar {
    private String color;
    private final int ownWeight;
    
    public TrainCar(String color, int ownWeight) {
        this.color = color;
        this.ownWeight = ownWeight;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOwnWeight() {
        return ownWeight;
    }
    
    public String toString() {
        return "A " + color + " " + this.getCarType() + " that weighs " + ownWeight + " kg";
    }
    
    public abstract String getCarType();
    public abstract int getTotalWeight();
}
