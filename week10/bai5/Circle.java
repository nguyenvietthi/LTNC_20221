package bai5;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + ", Area: " + getArea();
    }
    
}
