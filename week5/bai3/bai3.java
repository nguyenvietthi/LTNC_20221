package bai3;
public class bai3 {
    public static void main(String[] args) {
        MyRectangle2D rect1 = new MyRectangle2D(1, 1, 3, 3);
        MyRectangle2D rect2 = new MyRectangle2D(0.5, 0.5, 0.5, 0.5);
        
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println(rect1.contains(2, 2));
        System.out.println(rect1.contains(rect2));
    }
}
