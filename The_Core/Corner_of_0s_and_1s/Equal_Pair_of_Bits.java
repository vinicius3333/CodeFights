package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Equal_Pair_of_Bits {
    public static void main(String[] args) {
        System.out.println(equalPairOfBits(10, 11));
    }

    static int equalPairOfBits(int n, int m) {
        return ~(n ^ m) & -(~(n ^ m)) ;
    }
}
