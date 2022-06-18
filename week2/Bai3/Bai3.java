import java.util.Date;

public class Bai3 {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(10000);
        System.out.println(date.toString());
        date.setTime(100000);
        System.out.println(date.toString());
        date.setTime(1000000);
        System.out.println(date.toString());
        date.setTime(10000000);
        System.out.println(date.toString());
        date.setTime(100000000);
        System.out.println(date.toString());
        date.setTime(1000000000);
        // System.out.println(date.toString());
        // date.setTime(10000000000);
        // System.out.println(date.toString());
        // date.setTime(100000000000);
        // System.out.println(date.toString());
    }
}
