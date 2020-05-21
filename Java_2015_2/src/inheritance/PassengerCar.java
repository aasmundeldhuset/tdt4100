package inheritance;

public class PassengerCar extends TrainCar implements PassengerVehicle {
    private int numPassengers;
    
    public PassengerCar(String color, int deadWeight, int numPassengers) {
        super(color, deadWeight);
        this.numPassengers = numPassengers;
    }
    
    public PassengerCar() {
        this("green", 30000, 0);
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
    @Override
    public String toString() {
        return super.toString() 
                + " and contains " + numPassengers + " passengers";
    }
    
    @Override
    public String getType() {
        return "passenger car";
    }
    
    @Override
    public int getTotalWeight() {
        return getDeadWeight() + 75 * numPassengers;
    }
}
