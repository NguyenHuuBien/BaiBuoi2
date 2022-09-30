package BTBuoi3;

public class Bai1_8 {
    public int CountLowercase(int count, String str){
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Bai1_8 b8 = new Bai1_8();
        System.out.println("So ki tu thuong trong chuoi la: " + b8.CountLowercase(0, "Af5dhs123B4fds"));
    }
}
