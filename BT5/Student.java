package BT5;

public class Student extends Person {
    String program;
    int year;
    double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

    public String getProgram(){
        return this.program;
    }

    public int getYear(){
        return this.year;
    }

    public double getFee(){
        return this.fee;
    }

    @Override
    public String toString(){
        return String.format("Student[%s,program=%s,year=%d,Fee=%.2f]", super.toString(), getProgram(), getYear(), getFee());
    }

//    public static void main(String[] args) {
//        Student student = new Student("Bien", "DanPhuong", "HiveTech", 3, 1.2);
//        System.out.println(student.toString());
//    }

}
