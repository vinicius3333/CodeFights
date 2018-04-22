package CodeFights.The_Core.Loop_Tunnel;

public class Magical_Well {
    public static void main(String[] args) {
        System.out.println(magicalWell(1,2,2));
    }

    static int magicalWell(int a, int b, int n) {
        int sum = 0;
        while(n-->0){
            sum += a*b;
            a++;
            b++;
        }
        return sum;
    }
}
