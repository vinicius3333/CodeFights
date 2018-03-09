package CodeFights.Intro.Eruption_of_Light;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class isBeatutifulString {
    public static void main(String[] args) {
        System.out.println(isBeautifulString("zaa"));
    }

    static boolean isBeautifulString(String inputString) {
        int[] alphabet = new int[26];
        for(int i = 0; i < inputString.length(); i++){
            alphabet[inputString.toCharArray()[i]-97]++;
        }
        System.out.println(Arrays.toString(alphabet));
        for(int i = 0; i < alphabet.length-1; i++){
            if(alphabet[i+1]>alphabet[i]){
                return false;
            }
        }
        return true;
    }
}
