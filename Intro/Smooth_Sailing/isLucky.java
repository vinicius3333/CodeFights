package CodeFights.Intro.Smooth_Sailing;

import java.util.stream.IntStream;

public class isLucky {
    public static void main(String[] args){
        System.out.println(isLucky(239017));
    }

    static boolean isLucky(int n){
        int sum = 0;
        String strN = String.valueOf(n);

        for(int i = 0; i < strN.length()/2; i++)
            sum += strN.toCharArray()[i] - strN.toCharArray()[strN.length()-1-i];

        return sum == 0;
    }

}
