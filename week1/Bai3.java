import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1, x2, y1, y2, r1, r2;
        double distance;
		System.out.println("Nhap toa do va ban kinh cua hing tron thu 1 (x1, y1, r1): ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		r1 = scanner.nextDouble();
		
		System.out.println("Nhap toa do va ban kinh cua hing tron thu 2 (x2, y2, r2): ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		r2 = scanner.nextDouble();
		
        distance = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        
        if(distance <= (r1 - r2)) {
        	System.out.println("Hinh tron 2 nam ben trong hinh tron thu 1");
        } else if (distance <= (r1 + r2)) {
			System.out.println("Hinh tron 2 giao voi hinh tron 1");
		} else {
			System.out.println("Hinh tron 2 nam ngoai hinh tron thu  1");
		}
	}
}
