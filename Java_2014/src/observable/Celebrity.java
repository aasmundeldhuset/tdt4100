package observable;

import java.util.ArrayList;

public class Celebrity {
    private String name;
    private int age;
    private ArrayList<CelebrityListener> listeners
        = new ArrayList<CelebrityListener>();
    
    public Celebrity(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void addListener(CelebrityListener listener) {
        listeners.add(listener);
    }
    
    public void removeListener(CelebrityListener listener) {
        listeners.remove(listener);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void haveBirthday() {
        age++;
        notifyBirthday();
    }
    
    private void notifyBirthday() {
        for (CelebrityListener listener : listeners) {
            listener.celebrityHadBirthday(this);
        }
    }
}
