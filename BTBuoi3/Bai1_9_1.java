package BTBuoi3;

public class Bai1_9_1 {
    public void CutString2_8(String str){
        StringBuilder SBD = new StringBuilder(str);
        System.out.println(SBD.substring(2, 9));
    }

    public static void main(String[] args) {
        Bai1_9_1 b9_1 = new Bai1_9_1();
        b9_1.CutString2_8("01234567891011");
    }
}
