package inheritance;

public class PassengerCar extends TrainCar implements PassengerVehicle {
    private int numPassengers;
    
    public PassengerCar(String color, int ownWeight, int numPassengers) {
        super(color, ownWeight);
        this.numPassengers = numPassengers;
    }
    
    public PassengerCar(int ownWeight, int numPassengers) {
        super("red", ownWeight);
        this.numPassengers = numPassengers;
    }
    
    public int getNumPassengers() {
        return numPassengers;
    }
    
    public int getTicketPrice() {
        return 50;
    }
    
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
    public String toString() {
        return super.toString() + " and contains " + numPassengers + " passengers";
    }
    
    public int getTotalWeight() {
        return getOwnWeight() + numPassengers * 75;
    }
    
    public String getCarType() {
        return "passenger car";
    }
}
