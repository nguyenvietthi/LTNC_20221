package bai5;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject> {
    public int compare(GeometricObject o1, GeometricObject o2){
        return ((Double)o1.getArea()).compareTo(o2.getArea());
    }
}
