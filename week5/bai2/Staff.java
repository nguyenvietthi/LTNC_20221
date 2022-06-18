package bai2;

import java.util.Date;

public class Staff extends Employee {
    
    private String rank;

    public Staff() {
    }

    public Staff(String rank) {
        this.rank = rank;
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary,
            Date startDate, String rank) {
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + " rank=" + rank;
    }
}
