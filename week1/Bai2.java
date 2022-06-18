import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1, y1, x2, y2; 
        double distance;

        System.out.println("Nhap toa do cua diem thu 1: (x1, y1)");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();

        System.out.println("Nhap toa do cua diem thu 2: (x2, y2)");
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        distance = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));

        System.out.print("Khoang cach giua 2 diem la: ");
        System.out.println(distance);
    }
}
