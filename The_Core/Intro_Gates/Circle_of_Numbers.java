package CodeFights.The_Core.Intro_Gates;

public class Circle_of_Numbers {
    public static void main(String[] args) {
        System.out.println(circleOfNumbers(10, 2));
    }

    static int circleOfNumbers(int n, int firstNumber) {
        return firstNumber + (n/2) >= n ? firstNumber - (n/2) : firstNumber + (n/2);
    }

}
