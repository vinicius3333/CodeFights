package CodeFights.The_Core.At_the_Crossroads;

public class Arithmetic_Expression {
    public static void main(String[] args) {
        System.out.println(arithmeticExpression(2, 3, 5));
    }

    static boolean arithmeticExpression(double a, int b, int c) {
        return a + b == c || a * b == c || a / b == c || a - b == c;
    }
}
