package observable;

public class CelebrityProgram {
    public static void main(String[] args) {
        Celebrity d = new Celebrity("Donald Knuth", 80);
        Celebrity e = new Celebrity("Edsger W. Dijkstra", 75);
        Celebrity g = new Celebrity("George Clooney", 53);
        Celebrity n = new Celebrity("Natalie Portman", 28);
        
        Vogue v = new Vogue();
        Paparazzi p = new Paparazzi();
        
        n.addListener(v);
        g.addListener(p);
        n.addListener(p);
        
        g.haveBirthday();
        g.haveBirthday();
        n.haveBirthday();
    }
}
