package misc;

public class Program {
    public static void main(String[] args) throws NameException {
        Person p = new Person();
            p.setName("Ola");
        System.out.println(p.getName());

//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            try {
//                int x = sc.nextInt();
//                System.out.println(x * x);
//                break;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Not a number; try again!");
//                sc.next();
//            } catch (Exception e) {
//                System.out.println("Some other problem");
//            } finally {
//                System.out.println("Done");
//            }
//            System.out.println("Also done?");
//        }


//        misc.Person p = new misc.Person("", -53.2);
//        if (p.setName("Ola")) {
//            System.out.println("Success!");
//        } else {
//            System.out.println("Failure!");
//        }



//        questions.MyArrayList a = new questions.MyArrayList();
//        a.add(5);
//        a.add(3);
//        a.add(9);
//        a.add(3.14);
//        a.add(2.2456);
//
//        for (int i = 0; i < a.getSize(); i++) {
//            System.out.println(a.get(i));
//        }
    }
}
