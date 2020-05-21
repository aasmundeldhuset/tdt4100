package inheritance;

public class CargoCar extends TrainCar {
    private String cargoType;
    private int cargoWeight;
    
    public CargoCar(int weight, String cargoType, int cargoWeight) {
        super("blue", weight);
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
    }
    
    public String getCargoType() {
        return cargoType;
    }
    
    public int getCargoWeight() {
        return cargoWeight;
    }
    
    public int getLoadedWeight() {
        return getWeight() + cargoWeight;
    }
    
    public String getType() {
        return "cargo car";
    }
}
