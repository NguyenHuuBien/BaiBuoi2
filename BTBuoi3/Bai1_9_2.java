package BTBuoi3;

import java.util.ArrayList;

public class Bai1_9_2 {

    public void ArrayNumber(String str){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57){
                arr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        Bai1_9_2 bai1_9_2 = new Bai1_9_2();
        bai1_9_2.ArrayNumber("f1hbdsf2nu3n 4.5/6");
    }

}
