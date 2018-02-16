package CodeFights.Intro.Exploring_The_Waters;

import java.util.Arrays;

public class alternatingSums {
    public static void main(String[] args){
        System.out.println(alternatingSums(new int[]{50, 60, 60, 45, 70}));
    }

    static int[] alternatingSums(int[] a){
        int[] c = new int[2];
        int d = 0;

        for(int i  = 0; i < a.length; i++){
            if(d == 0){
                c[0] += a[i];
                d++;
            }
            else if(d == 1){
                c[1] += a[i];
                d = 0;
            }
        }
        return c;
    }
}
