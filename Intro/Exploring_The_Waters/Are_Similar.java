package CodeFights.Intro.Exploring_The_Waters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Are_Similar {
    public static void main(String[] args){
        System.out.println(areSimilar(new int[]{1, 2,2},
                new int[]{1,1}));
    }

    static boolean areSimilar(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i]) list.add(i);
        
        if(list.size() == 2){
            int i = list.get(0), j = list.get(1);
            return a[i] == b[j] && a[j] == b[i];
        }
        return list.size() == 0;
    }
}
