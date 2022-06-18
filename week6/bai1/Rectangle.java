
public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    public void printRetangle() {
        System.out.println("Rectangle: " + super.toString() + "height=" + this.height + ", width=" + this.width);
    }
    
}
