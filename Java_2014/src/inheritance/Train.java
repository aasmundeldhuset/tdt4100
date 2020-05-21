package inheritance;

import java.util.ArrayList;

public class Train {
    private TrainCar firstCar;
    private TrainCar lastCar;
    
    public void addCar(TrainCar newCar) {
        if (firstCar == null) {
            firstCar = newCar;
            lastCar = newCar;
        }
        else {
            lastCar.setNextCar(newCar);
            lastCar = newCar;
        }
    }
    
    public int getWeight() {
        if (firstCar == null)
            return 0;
        else
            return firstCar.getSubtrainWeight();
    }
}
