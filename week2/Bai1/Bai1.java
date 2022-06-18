import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lan luot chieu dai va chieu rong cua hinh chu nhat: ");
        width = scanner.nextDouble();
        height = scanner.nextDouble();

        Rectangle hinh = new Rectangle (width, height);
        System.out.println("Dien tich va chu vi cua hinh chu nhat lan luot la: " + hinh.getArea() + ", " + hinh.getPerimeter());
    }
    
}