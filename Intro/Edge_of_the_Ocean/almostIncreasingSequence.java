package CodeFights.Intro.Edge_of_the_Ocean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class almostIncreasingSequence {
    public static void main(String[] args){
        System.out.println(almostIncreasingSequence(new int[]{1, 3, 2}));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        int n = 0;

        for(int i = 0; i < sequence.length - 1; i++){
            if(sequence[i] - sequence[i+1] >= 0){
                n++;
                if(i - 1 >= 0 && i + 2 <= sequence.length - 1
                    && sequence[i] - sequence[i+2] >= 0
                    && sequence[i-1] - sequence[i+1] >= 0){
                    return false;
                }
            }
        }
        return n <= 1;
    }
}
