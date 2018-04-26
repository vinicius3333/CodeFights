package CodeFights.The_Core.Loop_Tunnel;

public class Increase_Number_Roundness {
    public static void main(String[] args) {
        System.out.println(increaseNumberRoundness(11000));
    }

    static boolean increaseNumberRoundness(int n) {
        boolean b = false;
        String str = String.valueOf(n);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0' && !b) b = true;
            if(str.charAt(i) != '0' && b) return true;
        }

        return false;
    }
}
