package Bai1;

/**
 * Fan
 */
public class Fan {

    public static final int SLOW   = 1;
    public static final int MEDIUM = 2;
    public static final int FAST   = 1;

    private int     speed ;
    private boolean on    ;
    private double  radius;
    private String  color ;
    
    public Fan() {
        this.speed  = SLOW;
        this.on     = false;
        this.radius = 5.0;
        this.color  = "Blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String tmp;
        if(on) {
            tmp = "Fan is on. \nSpeed: " + this.speed + "\nRadius: " + this.radius + "\nColor: " + this.color;
        } else {
            tmp = "Fan is off. " + "\nRadius: " + this.radius + "\nColor: " + this.color;

        }
        return tmp;
    }
}