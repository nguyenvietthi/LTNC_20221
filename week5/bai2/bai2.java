package bai2;

import java.util.Date;

public class bai2 {
    public static void main(String[] args) {
        Student st = new Student("Nguyen Viet Thi", "Nam Dan, Nghe An", "0366939260", "nguyenvietthi.nd@gmail.com", Student.senior);
        System.out.println(st.toString());

        Lecturer lect = new Lecturer("Nguyen Viet Thi", "Nam Dan, Nghe An", "0366939260", "nguyenvietthi.nd@gmail.com",
         "DTVT", 1000, new Date(), 8.0, "Vien Truong");
        System.out.println(lect.toString());

        Staff staff = new Staff("Nguyen Viet Thi", "Nam Dan, Nghe An", "0366939260", "nguyenvietthi.nd@gmail.com",
        "DTVT", 1000, new Date(), "Vien Truong");
        System.out.println(staff.toString());
    }
}
