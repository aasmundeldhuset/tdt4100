package observable;

public class Paparazzi implements CelebrityListener {
    public void celebrityHadBirthday(Celebrity celebrity) {
        System.out.println("Taking a picture of " + celebrity.getName());
    }
}
