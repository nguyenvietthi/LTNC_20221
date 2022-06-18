import java.util.Date;

/**
 * GeometricObject
 */
public class GeometricObject {

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

    @Override
    public String toString() {
        return "color=" + color + ", dateCreated=" + dateCreated + ", filled=" + filled;
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject geometricObject : a) {
            if(geometricObject instanceof Circle){
                sum += ((Circle) geometricObject).getArea();
            } else if(geometricObject instanceof Rectangle){
                sum += ((Rectangle) geometricObject).getArea();
            } else if(geometricObject instanceof Square){
                sum += ((Square) geometricObject).getArea();
            }
        }
        return sum;
    }

}