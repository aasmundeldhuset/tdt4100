package observable;

public class Paparazzi implements CelebrityObserver {
    private String name;
    
    public Paparazzi(String name) {
        this.name = name;
    }
    
    public void celebrityHasBirthday(Celebrity celebrity) {
        System.out.println(name + " takes a picture of " + celebrity.getName());
    }
}
