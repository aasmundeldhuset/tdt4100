package observable;

import java.util.ArrayList;

public class Celebrity {
    private String name;
    private int age;
    private int height;
    private ArrayList<CelebrityObserver> observers 
            = new ArrayList<CelebrityObserver>();
    
    public Celebrity(String name, int age, int height) {
        this.name = name;
        if (age < 0)
            throw new IllegalArgumentException();
        this.age = age;
        this.height = height;
    }
    
    public void addCelebrityObserver(CelebrityObserver observer) {
        observers.add(observer);
    }
    
    public void removeCelebrityObserver(CelebrityObserver observer) {
        observers.remove(observer);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void birthday() {
        age++;
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).celebrityHasBirthday(this);
        }
    }
    
    public int getHeight() {
        return height;
    }
}
