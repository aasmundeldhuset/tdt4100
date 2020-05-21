public class PersonMain {
    public static void main(String[] args) {
        System.out.println(Person.getNumPersons());
        Person p;
        p = new Person("Nils", 23, 180);
        System.out.println(Person.getNumPersons());
        //Person q = new Person("", 15, 171);
        Person r = new Person();
        System.out.println(Person.getNumPersons());
        System.out.println(r.getName());
    }
}
