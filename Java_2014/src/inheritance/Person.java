package inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Person {
    private Person mother;
    private Person father;
    private Collection<Person> children;
    private Gender gender;
    
    public Person(Gender gender) {
        this.gender = gender;
    }
    
    public Person getMother() {
        return mother;
    }
    
    public Person getFather() {
        return father;
    }
    
    public ArrayList<Person> getChildren() {
        return new ArrayList<Person>(children);
    }
    
    public void addChild(Person child) {
        if (children.contains(child))
            return;
        children.add(child);
        if (gender == Gender.FEMALE) {
            if (child.mother != null)
                child.mother.children.remove(child);
            child.mother = this;
        }
        else {
            if (child.father != null)
                child.father.children.remove(child);
            child.father = this;
        }
    }
    
    public void setFather(Person father) {
        if (father.gender != Gender.MALE)
            throw new IllegalArgumentException();
        father.addChild(this);
    }
}
