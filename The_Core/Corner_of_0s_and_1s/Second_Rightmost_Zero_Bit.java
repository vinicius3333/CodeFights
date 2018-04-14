package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Second_Rightmost_Zero_Bit {
    public static void main(String[] args) {
        System.out.println(secondRightmostZeroBit(37));
    }

    static int secondRightmostZeroBit(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
