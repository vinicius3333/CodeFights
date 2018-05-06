package CodeFights.The_Core.Loop_Tunnel;

public class Count_Black_Cells {
    public static void main(String[] args) {
        System.out.println(countBlackCells(2,3));
    }

    static int countBlackCells(int n, int m) {
        return n + m + gcd(n, m) - 2;
    }

    static int gcd(int a, int b)
    {
        if(a == 0 || b == 0) return a+b;
        return gcd(b,a%b);
    }
}
