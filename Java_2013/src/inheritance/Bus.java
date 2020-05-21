package inheritance;

public class Bus implements PassengerVehicle {
    private int ownWeight;
    private int numPassengers;
    
    public Bus(int ownWeight, int numPassengers) {
        this.ownWeight = ownWeight;
        this.numPassengers = numPassengers;
    }
    
    public int getTotalWeight() {
        return ownWeight + numPassengers * 80;
    }
    
    public int getOwnWeight() {
        return ownWeight;
    }

    public void setOwnWeight(int ownWeight) {
        this.ownWeight = ownWeight;
    }

    public int getNumPassengers() {
        return numPassengers;
    }
    
    public int getTicketPrice() {
        return 40;
    }
    
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
