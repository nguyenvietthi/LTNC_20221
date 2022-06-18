package bai3;

public class MyRectangle2D {
    private double x, y;
    private double width, height;
    
    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }
    
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    public boolean contains(double x, double y){
        if((x < this.x + this.width / 2) && (x > this.x - this.width / 2) && (y < this.y + this.height / 2) && (y > this.y - this.height / 2)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean contains (MyRectangle2D r){
        double x1, y1;
        double x2, y2;
        double x3, y3;
        double x4, y4;

        x1 = r.getX();
        y1 = r.getY() + r.getHeight() / 2;

        x2 = r.getX() + r.getWidth() / 2;
        y2 = r.getY(); 

        x3 = r.getX();
        y3 = r.getY() - r.getHeight() / 2;

        x4 = r.getX() - r.getWidth() / 2;
        y4 = r.getY();

        return contains(x1, y1) && contains(x2, y2) && contains(x3, y3) && contains(x4, y4);
    }
}
