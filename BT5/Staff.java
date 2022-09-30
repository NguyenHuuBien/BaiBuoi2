package BT5;

public class Staff extends Person {
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setPay(double pay){
        this.pay = pay;
    }

    public String getSchool(){
        return this.school;
    }

    public double getPay(){
        return this.pay;
    }

    @Override
    public String toString(){
        return String.format("Staff[%s,school=%s,pay=%.2f]", super.toString(), getSchool(), getPay());
    }

//    public static void main(String[] args) {
//        Staff staff = new Staff("Bien", "DanPhuong", "DHXD", 100000);
//        System.out.println(staff.toString());
//    }

}
