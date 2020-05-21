public class DateMain {
    public static void main(String[] args) {
        Date d = new Date(31, 12, 2012);
        d.previousDate();
        System.out.println(d);
        d = new Date(1, 1, 2012);
        d.previousDate();
        System.out.println(d);
        d = new Date(1, 12, 2012);
        d.previousDate();
        System.out.println(d);
        d = new Date(1, 3, 2012);
        d.previousDate();
        System.out.println(d);
        d = new Date(1, 3, 2011);
        d.previousDate();
        System.out.println(d);
        
        d = new Date(1, 3, 2011);
        d.nextDate();
        System.out.println(d);
        d = new Date(31, 3, 2011);
        d.nextDate();
        System.out.println(d);
        d = new Date(31, 12, 2011);
        d.nextDate();
        System.out.println(d);
    }
}
