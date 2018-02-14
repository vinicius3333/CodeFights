package CodeFights.Intro.Smooth_Sailing;

import java.util.stream.IntStream;

public class isLucky {
    public static void main(String[] args){
        System.out.println(isLucky(239017));
    }

    static boolean isLucky(int n){
        String str = String.valueOf(n);
        String L = str.substring(0,str.length()/2);
        String R = str.substring(str.length()/2,str.length());
        int[] l = new int[L.length()];
        int[] r = new int[R.length()];

        for(int i = 0; i < l.length; i++){
            l[i] = Integer.parseInt(L.substring(i,i+1));
        }
        for(int i = 0; i < r.length; i++){
            r[i] = Integer.parseInt(R.substring(i,i+1));
        }

        if(IntStream.of(l).sum() == IntStream.of(r).sum())
            return true;
        else
            return false;
    }
}
