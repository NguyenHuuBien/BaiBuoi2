package BTBuoi3;

public class Bai1_5 {

    public void PrintOddPosition(String str){
        if (str.length() > 1) {
            for (int i = 1; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.println("Chuoi phai lon hon 2");
        }
    }

    public static void main(String[] args) {
        Bai1_5 b5 = new Bai1_5();
        b5.PrintOddPosition("123456789");
    }
}
