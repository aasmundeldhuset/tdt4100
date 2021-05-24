package observable;

import java.util.ArrayList;
import java.util.List;

public class Celebrity {
    private String name;
    private int age;
    private int height;

    private List<CelebrityObserver> observers = new ArrayList<CelebrityObserver>();

    public Celebrity(String name, int age, int height) {
        this.name = name;
        if (age < 0)
            throw new IllegalArgumentException();
        this.age = age;
        this.height = height;
    }

    public void addObserver(CelebrityObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CelebrityObserver observer) {
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
        for (CelebrityObserver o : observers) {
            o.celebrityHasBirthday(this);
        }
    }

    public int getHeight() {
        return height;
    }
}
