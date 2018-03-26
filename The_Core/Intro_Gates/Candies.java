package CodeFights.The_Core.Intro_Gates;

public class Candies {
    public static void main(String[] args) {
        System.out.println(candies(3, 10));
    }

    static int candies(int n, int m) {
        return (m/n)*n;
    }
}
