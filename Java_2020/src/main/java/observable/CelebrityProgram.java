package observable;

public class CelebrityProgram {
    public static void main(String[] args) {
        Celebrity gb = new Celebrity("Gunnar Bovim", 50, 180);
        Celebrity ej = new Celebrity("Elton John", 65, 170);
        Vogue v = new Vogue();
        Paparazzi a = new Paparazzi("Jack");
        Paparazzi b = new Paparazzi("Jeff");
        
        gb.birthday();
        gb.addObserver(v);
        gb.birthday();
        gb.addObserver(a);
        gb.birthday();
        ej.addObserver(v);
        ej.birthday();
    }
}
