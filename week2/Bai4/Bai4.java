import java.util.Random;

public class Bai4 {
    public static void main(String[] args) {
        Random generator = new Random(1000);
        int value;
        for(int i = 0; i < 50; i++) {
            value = generator.nextInt((100 - 0) + 1) + 0;
            System.out.println(value);
        }
    }
}