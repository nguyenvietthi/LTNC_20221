package bai1;

public class Circle extends GeometricObject{
    
    private double radius;

    public Circle(){
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter(){
        return 2 * this.radius;
    }

    public void printCircle(){
        System.out.println(super.toString() + ", radius=" + this.radius);
    }
}