package CodeFights.Intro.Edge_of_the_Ocean;

import java.util.Collections;
import java.util.HashSet;

public class Make_Array_Consecutive_2 {
    public static void main(String[] args){
        System.out.println(makeArrayConsecutive2(new int[]{6,2,3,8}));
    }

    static int makeArrayConsecutive2(int[] statues) {
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < statues.length; i++){
            set.add(statues[i]);
        }
        int min = Collections.min(set);
        int max = Collections.max(set);

        for(int i = min; i < max; i++){
            if(!set.contains(i)) c++;
        }

        return c;
    }
}
