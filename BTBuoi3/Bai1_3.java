package BTBuoi3;

public class Bai1_3 {

    public int CountUpperCharacter(int count, String str){
        for (int i = 0; i < str.length(); i++) {
            if(65 <= (int)str.charAt(i) && (int)str.charAt(i) <= 90){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Bai1_3 b3 = new Bai1_3();
        System.out.println("So ki tu duoc viet hoa trong chuoi la: " + b3.CountUpperCharacter(0, "A5B3fhdjsfY"));
    }

}
