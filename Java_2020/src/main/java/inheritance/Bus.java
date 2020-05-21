package inheritance;

public class Bus implements PassengerVehicle, HasTires {
    private int numPassengers;
    
    public Bus(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
    public int getNumPassengers() {
        return numPassengers;
    }
    
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
    public int getNumTires() {
        return 4;
    }
}
