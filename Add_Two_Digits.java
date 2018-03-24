package CodeFights.The_Core.Intro_Gates;

public class Add_Two_Digits {
    public static void main(String[] args){
        System.out.println(addTwoDigits(24));
    }

    static int addTwoDigits(int n) {
        return Integer.parseInt(String.valueOf(n).substring(0,1)) + Integer.parseInt(String.valueOf(n).substring(1,2));
    }

}
