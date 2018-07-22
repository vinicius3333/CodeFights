package CodeFights.Intro.Smooth_Sailing;

/*** 
---Pergunta/ Question---
Given an array of strings, return another array containing all of its longest strings.

Dado um array de strings, retorne outro array contendo todas as suas strings mais longas.
---Comentários/ Comments---
Make an algorithm that takes the value of the largest string in the array and then returns 
an array with all strings of the same length.

Faça um algoritmo que pegue o valor da maior string da array e depois retorne uma array 
com todas as strings com o mesmo tamanho
***/

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
