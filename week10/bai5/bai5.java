package bai5;

public class bai5 {
    public static void main(String[] args) {
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
            new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
            new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
            new Circle(6.5), new Rectangle(4, 5)};
        
        GeometricObject.sort(list1, new GeometricObjectComparator());

        for (GeometricObject geometricObject : list1) {
            System.out.println(geometricObject);
        }
    }
}