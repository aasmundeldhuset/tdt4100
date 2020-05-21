package observable;

public class Vogue implements CelebrityObserver {
    public void celebrityHasBirthday(Celebrity celebrity) {
        System.out.println("Writing an article about " + celebrity.getName()
                + ", who turns " + celebrity.getAge() + " today");
    }
}
