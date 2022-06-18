public class Square extends GeometricObject{
   
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side * this.side;
    }

    public double getPerimeter(){
        return this.side * 4;
    }

    public void printSquare(){
        System.out.println("Square: " + super.toString() + ", side=" + this.side);
    }

}
