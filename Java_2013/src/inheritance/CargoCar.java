package inheritance;

public class CargoCar extends TrainCar {
    private int cargoWeight;
    
    public CargoCar(String color, int ownWeight, int cargoWeight) {
        super(color, ownWeight);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
    
    public String toString() {
        return super.toString() + " and contains " + cargoWeight + " kg of cargo";
    }
    
    public int getTotalWeight() {
        return getOwnWeight() + cargoWeight;
    }
    
    public String getCarType() {
        return "cargo car";
    }
}
