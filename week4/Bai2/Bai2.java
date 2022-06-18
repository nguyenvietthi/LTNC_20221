package Bai2;


public class Bai2 {
    public static void main(String[] args) {
        MyInteger value = new MyInteger(1000);
        System.out.println(value.isEven());

        System.out.println(value.isPrime());
        value = new MyInteger(13);
        System.out.println(value.isPrime());

        System.out.println(value.equals(new MyInteger(25)));

        
        System.out.println(MyInteger.parseInt("-1234".toCharArray()));
        System.out.println(MyInteger.parseInt("12342"));
        System.out.println(MyInteger.parseInt("12342sdsdasd"));

    }
}
                                      