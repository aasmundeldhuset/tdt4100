package inheritance;

public class PassengerCar extends TrainCar implements PublicTransport {
    private int numPassengers;
    private int ticketPrice;
    
    public PassengerCar() {
        this(0);
    }
    
    public PassengerCar(String color, int weight) {
        super(color, weight);
    }
    
    public PassengerCar(int numPassengers) {
        this("red", 20000, numPassengers);
    }
    
    public PassengerCar(String color, int weight, int numPassengers) {
        super(color, weight);
        setNumPassengers(numPassengers);
        this.ticketPrice = 35;
    }
    
    public int getNumPassengers() {
        return numPassengers;
    }
    
    public void setNumPassengers(int numPassengers) {
        if (numPassengers >= 0)
            this.numPassengers = numPassengers;
        else
            throw new IllegalArgumentException();
    }
    
    public int getLoadedWeight() {
        return getWeight() + numPassengers * 70;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }
    
    public String toString() {
        return super.toString() + " and contains "
                    + numPassengers + " passengers ";
    }
    
    public String getType() {
        return "passenger car";
    }
}
