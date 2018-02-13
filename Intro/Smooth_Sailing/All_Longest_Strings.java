package CodeFights.Intro.Smooth_Sailing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class All_Longest_Strings {
    public static void main(String[] args){
        String[] inputArray = {"a",
                "abc",
                "cbd",
                "zzzzzz",
                "a",
                "abcdef",
                "asasa",
                "aaaaaa"};
        System.out.println(allLongestString(inputArray));
    }

    public static String[] allLongestString(String[] inputarray){
        ArrayList<String> set = new ArrayList<>();
        ArrayList<String> set2 = new ArrayList<>();
        int j = 0;

        for(int i = 0 ; i < inputarray.length; i++){
            set.add(inputarray[i]);
        }
        int l = inputarray[0].length();

        for(int i = 0; i < inputarray.length; i++){
            if(set.get(i).length() >= l){
                l = set.get(i).length();
            }
        }
        for(int i = 0; i < inputarray.length; i++){
            if(set.get(i).length() == l){
                set2.add(set.get(i));
            }
        }


        String[] aux = new String[set2.size()];
        aux = set2.toArray(aux);

        return aux;
    }
}
