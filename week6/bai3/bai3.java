public class bai3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle("blue", true, 0.325);
        Circle circle2 = new Circle("black", true, 0.25);

        GeometricObject circle_max = GeometricObject.max(circle1, circle2);
        ((Circle)circle_max).printCircle();
    }
}
