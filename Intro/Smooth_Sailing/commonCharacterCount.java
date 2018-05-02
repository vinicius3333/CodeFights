package CodeFights.Intro.Smooth_Sailing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class commonCharacterCount {
    public static void main(String[] args){
        System.out.println(commonCharacterCount("aabcc", "adcaa"));
    }

    static int commonCharacterCount(String s1, String s2) {
        ArrayList<Character> list = new ArrayList<>();
        char c;
        int pairs = 0;

        for(char i : s1.toCharArray())
            list.add(i);

        for(int i = 0; i < s2.length(); i++){
            c = s2.toCharArray()[i];
            if(list.contains(c)) {
                list.remove(list.indexOf(c));
                pairs++;
            }
        }

        return pairs;
    }
}
