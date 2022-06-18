package bai2;

public class Student extends Person{

    final static int freshman = 1;
    final static int sophomore = 2;
    final static int junior = 3;
    final static int senior = 4;

    private int status;
    
    public Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public Student() {
        this.status = freshman;
    }

    public Student(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {

        switch(this.status){
            case 1: return super.toString() + " status=freshman";
            case 2: return super.toString() + " status=sophomore";
            case 3: return super.toString() + " status=junior";
            case 4: return super.toString() + " status=serior";
            default: return "";
        }       
    }

    
    
}
