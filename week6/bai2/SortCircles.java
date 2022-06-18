import java.util.Arrays;

public class SortCircles {
    public static void main(String[] args) {
        Circle[] circle_list = {new Circle("red", true, 0.2), 
                                new Circle("blue", false, 0.56), 
                                new Circle("black", true, 0.3),
                                new Circle("blick", false, 0.1111)};

        Arrays.sort(circle_list);
        for (Circle circle : circle_list) {
            circle.printCircle();
            System.out.println(" Area = " + circle.getArea());
        }
    }
}
