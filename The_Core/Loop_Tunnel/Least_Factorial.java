package CodeFights.The_Core.Loop_Tunnel;

public class Least_Factorial {
    public static void main(String[] args) {
        System.out.println(leastFactorial(17));
    }

    static int leastFactorial(int n) {
        return (n > 1 ? (n >= 6 ? (n >= 24 ? (n >= 120 ? 120 : 120) : 24) : 6) : 1) ;
    }

}
