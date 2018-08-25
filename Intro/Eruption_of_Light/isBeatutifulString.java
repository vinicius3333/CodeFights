package CodeFights.Intro.Eruption_of_Light;

/*** 
---Pergunta/ Question---
A string is said to be beautiful if b occurs in it no more times than a; c occurs in it no more times than b; etc.

Diz-se que uma corda é bonita se b ocorre nela não mais que uma; c não ocorre mais vezes que b; etc.
---Comentários/ Comments---
Make an algorithm that discovers whether a String is beautiful or not.

Faça um algoritmo que descubra se uma String é bonita ou não.
***/

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
