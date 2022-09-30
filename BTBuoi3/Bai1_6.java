package BTBuoi3;

public class Bai1_6 {

    public void StringContainsSpecial(String str){
        for (int i = 0; i < str.length(); i++) {
            if(((int)str.charAt(i) > 57 && (int)str.charAt(i) < 65) ||
                    ((int)str.charAt(i) > 90 && (int)str.charAt(i) < 97) ||
                    ((int)str.charAt(i) > 122 && (int)str.charAt(i) <= 126) ||
                    ((int)str.charAt(i) >= 32 && (int)str.charAt(i) < 48)){
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Bai1_6 b6 = new Bai1_6();
        b6.StringContainsSpecial("!@#jfdnsifds7678&*?/");
    }
}
