import java.util.Date;
abstract class GeometricObject implements Comparable<GeometricObject> {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "color=" + color + ", dateCreated=" + dateCreated + ", filled=" + filled;
    }

    @Override
    public int compareTo(GeometricObject geometricObject){
        return ((Double)this.getArea()).compareTo(geometricObject.getArea());
    }

    public static GeometricObject max(GeometricObject geometricObject1, GeometricObject geometricObject2){
        if(geometricObject1.getArea() > geometricObject2.getArea()){
            return geometricObject1;
        } else {
            return geometricObject2;
        }
    }

}