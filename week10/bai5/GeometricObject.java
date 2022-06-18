package bai5;

import java.util.Date;
import java.util.Comparator;

/**
 * GeometricObject
 */
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreate;

    public GeometricObject(String color, boolean filled) {
        dateCreate = new Date();
        this.color = color;
        this.filled = filled;
    }

    protected GeometricObject(){
        dateCreate = new Date();
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public abstract double getArea();
    public abstract double getPerimeter();   

    public static void sort(GeometricObject arr[], Comparator<GeometricObject> c) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            GeometricObject key = arr[i];
            int j = i - 1;
            while (j >= 0 && c.compare(arr[j], key) == 1) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}