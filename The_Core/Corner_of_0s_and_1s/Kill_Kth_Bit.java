package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Kill_Kth_Bit {
    public static void main(String[] args) {
        System.out.println(killKthBit(2738, 30));
    }

    static int killKthBit(int n, int k) {
        return n == 0 ? 0 : Integer.toBinaryString(n).length() < k ? n : new StringBuffer(Integer.toBinaryString(n)).reverse().charAt(k-1) == '1' ? (int) (n - Math.pow(2, k-1)) : n;
    }

}
