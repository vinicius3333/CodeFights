package CodeFights.Intro.Exploring_The_Waters;

import java.util.Arrays;

public class alternatingSums {
    public static void main(String[] args){
        System.out.println(alternatingSums(new int[]{50, 60, 60, 45, 70}));
    }

    static int[] alternatingSums(int[] a){
        int[] c = new int[2];

        for(int i = 0; i < a.length; i++){
            if(i%2==0) c[0] += a[i];
            else c[1] += a[i];
        }

        return c;
    }
}
