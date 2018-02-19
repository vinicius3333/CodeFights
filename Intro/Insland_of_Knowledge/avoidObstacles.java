package CodeFights.Intro.Insland_of_Knowledge;

import java.util.ArrayList;
import java.util.Collections;

public class avoidObstacles {
    public static void main(String[] args) {
        System.out.println(avoidObstacles(new int[]{1, 4, 10, 6, 2}));
    }

    static int avoidObstacles(int[] inputArray){
        int t = 0;
        int r = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < inputArray.length; i++){
            list.add(inputArray[i]);
        }
        Collections.sort(list);
        for(int i = 1; i <= Collections.max(list)+1; i++){
            t=0;
            for(int j = 0; j < list.size(); j++){
                if(list.get(j)%i == 0){
                    j = list.size();
                } else if(list.get(j)%i != 0){
                    t++;
                    if(t == inputArray.length){
                        r = i;
                        return i;
                    }
                }
            }
        }
        return r;
    }
}
