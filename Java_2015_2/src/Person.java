public class Person {
    private String name;
    private int age;
    private double height;
    
    public Person() {
        this.name = "Ola";
        this.age = 0;
        this.height = 50;
    }
    
    public Person(String name, double height) {
        this.name = name;
        this.age = 0;
        this.height = height; 
    }
    
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height; 
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) throws NameException {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new NameException(name);
        }
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }
}
