package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Mirror_Bits {
    public static void main(String[] args) {
        System.out.println(mirrorBits(97));
    }

    static int mirrorBits(int a) {
        return Integer.parseInt(new StringBuffer(Integer.toBinaryString(a)).reverse().toString(), 2);
    }
}
