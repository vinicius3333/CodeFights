package CodeFights.The_Core.At_the_Crossroads;

public class Is_Infinite_Process {
    public static void main(String[] args) {
        System.out.println(isInfiniteProcess(0, 1));
    }

    static boolean isInfiniteProcess(int a, int b) {
        return !(b >= a && (b - a) % 2 == 0);
    }
}
