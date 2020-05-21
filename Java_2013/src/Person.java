public class Person {
    private String name;
    private int age;
    private int height;
    private static int numPersons;
    
    public Person(String name, int age, int height) {
        numPersons++;
        setName(name);
        if (age < 0)
            throw new IllegalArgumentException();
        this.age = age;
        setHeight(height);
    }
    
    public Person(String name, int height) {
        this(name, 0, height);
    }
    
    public Person() {
        this("Ola", 50);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;
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
    
    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }
    
    public static int getNumPersons() {
        return numPersons;
    }
    
    public static void setNumPersons(int numPersons) {
        Person.numPersons = numPersons;
    }
}
