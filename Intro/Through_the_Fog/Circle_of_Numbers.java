package CodeFights.Intro.Through_the_Fog;

public class Circle_of_Numbers {
    public static void main(String[] args){
        System.out.println(circleOfNumbers(6,3));
    }

    static int circleOfNumbers(int n, int firstNumber){
        return firstNumber + (n/2) >= n ? firstNumber - (n/2) : firstNumber + (n/2);
    }
}
