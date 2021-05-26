package inheritance;

public class Bus extends Object implements Vehicle, PassengerTransport {
	@Override public void drive() {
		System.out.println("Honk!");
	}

	@Override public int getNumPassengers() {
		return 0;
	}
}
