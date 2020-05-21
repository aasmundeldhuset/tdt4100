package observable;

public class Vogue implements CelebrityObserver {
    public void celebrityHasBirthday(Celebrity celebrity) {
        System.out.println("Writing an article about " + celebrity.getName()
                + "'s " + celebrity.getAge() + "th birthday");
    }
}
