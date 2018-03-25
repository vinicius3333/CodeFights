package CodeFights.The_Core.Intro_Gates;

public class Largest_Number {
    public static void main(String[] args) {
        System.out.println(largestNumber(3));
    }

    static int largestNumber(int n) {
        String str = "";

        while(n-- > 0){
            str+="9";
        }
        return Integer.parseInt(str);
    }
}
