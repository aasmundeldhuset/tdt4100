package observable;

public class Paparazzi implements CelebrityObserver {
    public void celebrityHasBirthday(Celebrity celebrity) {
        System.out.println("Flash!");
    }
}
