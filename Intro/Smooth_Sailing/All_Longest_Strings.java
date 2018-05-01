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
        int longest = 0;
        ArrayList<String> answer = new ArrayList<>();

        for(String i : inputArray)
            if(i.length() > longest) longest = i.length();

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].length() == longest) answer.add(inputArray[i]);
        }

        return answer.toArray(new String[0]);
    }
}
