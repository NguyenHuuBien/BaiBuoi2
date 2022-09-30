package BTBuoi3;

public class Bai1_4 {
    public int CountNumber(int count, String str){
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Bai1_4 b4 = new Bai1_4();
        System.out.println("So ki tu so trong chuoi la: " + b4.CountNumber(0, "Af5dhs123B4fds"));
    }
}
