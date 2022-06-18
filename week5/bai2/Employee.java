package bai2;

import java.util.Date;

/**
 * Employee
 */
public class Employee extends Person{

    private String office;
    private double salary;
    private Date startDate;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary,
            Date startDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public Employee(String office, double salary, Date startDate) {
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public Employee() {
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return super.toString() + " office=" + office + ", salary=" + salary + ", startDate=" + startDate;
    }
    
}