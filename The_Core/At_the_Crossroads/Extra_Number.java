package CodeFights.The_Core.At_the_Crossroads;

public class Extra_Number {
    public static void main(String[] args){
        System.out.println(extraNumber(2, 7, 2));
    }

    static  int extraNumber(int a, int b, int c){
        return a == b ? c : (b == c ? a : b);
    }
}
