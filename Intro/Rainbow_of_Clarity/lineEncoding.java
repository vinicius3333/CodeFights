package CodeFights.Intro.Rainbow_of_Clarity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lineEncoding {
    public static void main(String[] args) {
        System.out.println(lineEncoding("aabbbc"));
    }

    static String lineEncoding(String s) {
        StringBuilder enconding = new StringBuilder();
        char lastChar = s.charAt(0);
        int ocurrences = 1;

        for(int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == lastChar){
                ocurrences++;
            } else{
                enconding.append(ocurrences > 1 ? ocurrences + "" + lastChar : lastChar);
                lastChar = ch;
                ocurrences = 1;
            }
        }

        enconding.append(ocurrences > 1 ? ocurrences + "" + lastChar : lastChar);
        return enconding.toString();
    }
}
