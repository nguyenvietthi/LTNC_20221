public class bai1 {
    public static void main(String[] args) {
        GeometricObject [] geometricObjects = {new Circle("red", true, 0.256), 
                                               new Square("blue", false, 0.32), 
                                               new Rectangle("black", true, 0.7, 0.9),
                                               new Square("yellow", false, 0.9)};

        System.out.format("Sum area of shapes in array: %f\n", GeometricObject.sumArea(geometricObjects));

        for (GeometricObject a : geometricObjects) {
            if(a instanceof Circle){
                ((Circle) a).printCircle();;
            } else if(a instanceof Rectangle){
                ((Rectangle) a).printRetangle();;
            } else if(a instanceof Square){
               ((Square) a).printSquare();;
            }
        }
    }
}
