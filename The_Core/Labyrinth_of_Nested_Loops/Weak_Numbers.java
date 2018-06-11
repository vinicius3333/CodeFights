package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Weak_Numbers {
    public static void main(String[] args){
        System.out.println(weakness(9));
    }

    static int[] weakNumbers(int n) {
        ArrayList<Integer> weak = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            weak.add(weakness(i));
        }

        final int max = Collections.max(weak);
        final int c = weak.stream().filter(i -> i == max).collect(Collectors.toList()).size();

        return new int[]{max,c};
    }

    static int weakness(int n){
        int s = 0;
        if(n==1)
            return 0;

        for(int i = 1; i <= n; i++){
            if(divisors(i) > divisors(n)) s++;
        }

        return s;
    }

    static int divisors(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        int s = 0;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) s++;
        }

        return s+2;
    }
}
