package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Different_Rightmost_Bit {
    public static void main(String[] args){
        System.out.println(differentRightmostBit(42, 22));
    }

    static int differentRightmostBit(int n, int m) {
        return (n^m) & -(n^m) ;
    }

}
