package comparable;

public class Celebrity implements Comparable<Celebrity> {
    private String name;
    private int age;
    private int height;
    
    public int compareTo(Celebrity other) {
        if (this.height < other.height)
            return -1;
        else if (this.height > other.height)
            return 1;
        else {
            return this.name.toLowerCase().compareTo(other.name.toLowerCase());
        }
    }
    
    public Celebrity(String name, int age, int height) {
        this.name = name;
        if (age < 0)
            throw new IllegalArgumentException();
        this.age = age;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void birthday() {
        age++;
    }
    
    public int getHeight() {
        return height;
    }
}
