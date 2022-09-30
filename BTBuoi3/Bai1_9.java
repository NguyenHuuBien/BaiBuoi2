package BTBuoi3;

public class Bai1_9 {

    public void CutString(String str){
        StringBuilder SBD = new StringBuilder(str);
        System.out.println(SBD.substring(2));
    }

    public static void main(String[] args) {
        Bai1_9 b9 = new Bai1_9();
        b9.CutString("012345678");
    }

}
