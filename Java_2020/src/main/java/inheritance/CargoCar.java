package inheritance;

public class CargoCar extends TrainCar {
    private int cargoWeight;
    
    public CargoCar() {
        super("grey", 25000);
        this.cargoWeight = 0;
    }
    
    public CargoCar(String color, int deadWeight, int cargoWeight) {
        super(color, deadWeight);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + " kgs and contains " + cargoWeight + " kgs of cargo";
    }
    
    @Override
    public String getType() {
        return "cargo car";
    }
    
    @Override
    public int getTotalWeight() {
        return getDeadWeight() + cargoWeight;
    }
}
