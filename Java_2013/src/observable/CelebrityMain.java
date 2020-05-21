package observable;

public class CelebrityMain {
    public static void main(String[] args) {
        Paparazzi p = new Paparazzi();
        Vogue v = new Vogue();
        Celebrity c = new Celebrity("Knut Jørgen Røed Ødegaard", 45, 170);
        c.addCelebrityObserver(p);
        c.addCelebrityObserver(v);
        c.birthday();
        c.removeCelebrityObserver(p);
        c.birthday();
        Celebrity d = new Celebrity("Per Hansen", 71, 183);
        d.addCelebrityObserver(v);
        d.birthday();
    }
}
