package observable;

public class Vogue implements CelebrityListener {
    public void celebrityHadBirthday(Celebrity celebrity) {
        System.out.println("Writing an article about "
                + celebrity.getName() + "'s "
                + celebrity.getAge() + "th birthday");
    }
}
