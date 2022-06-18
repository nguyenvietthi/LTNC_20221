package bai1;

public class bai1 {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 3.55);
        circle.printCircle();

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

    }
}
