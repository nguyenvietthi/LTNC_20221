package bai2;

import java.util.Date;

public class Lecturer extends Employee {
    private double officeHours;
    private String title;
    
    public Lecturer() {
    }

    public Lecturer(double officeHours, String title) {
        this.officeHours = officeHours;
        this.title = title;
    }

    public Lecturer(String name, String address, String phoneNumber, String email, String office, double salary,
            Date startDate, double officeHours, String title) {
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.officeHours = officeHours;
        this.title = title;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + " officeHours=" + officeHours + ", title=" + title;
    }
}
