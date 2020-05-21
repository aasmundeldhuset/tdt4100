package inheritance;

public class Bus implements PublicTransport {
    private int ticketPrice;
    
    public Bus(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    public int getTicketPrice() {
        return ticketPrice;
    }
    
    public void makeNoise() {
        System.out.println("Wroom!");
    }
}
