package CodeFights.Intro.Smooth_Sailing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class commonCharacterCount {
    public static void main(String[] args){
        System.out.println(commonCharacterCount("aabcc", "adcaa"));
    }

    static int commonCharacterCount(String s1, String s2){
        int pairs = 0;
        ArrayList<Character> set = new ArrayList<>();
        ArrayList<Character> set2 = new ArrayList<>();

        for(int i = 0; i < s2.length(); i++){
            set2.add(s2.toCharArray()[i]);
        }
        for(int i = 0; i < s1.length(); i++){
            set.add(s1.toCharArray()[i]);
        }

        for(int i = 0; i < set.size() ; i++){
            for(int j = 0; j < set2.size(); j++){
                if(set.get(i) == set2.get(j)){
                    set2.remove(j);
                    j = set2.size();
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
