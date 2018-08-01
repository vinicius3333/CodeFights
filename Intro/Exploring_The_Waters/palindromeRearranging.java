package CodeFights.Intro.Exploring_The_Waters;

/*** 
---Pergunta/ Question---
Given a string, find out if its characters can be rearranged to form a palindrome.

Dada uma string, descubra se seus personagens podem ser reorganizados para formar um palíndromo.
---Comentários/ Comments---
Make an algorithm that discovers whether a rearranged String can be a palindrome

Faça um algoritmo que descubra se uma String rearranjada pode ser um palíndromo
***/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class palindromeRearranging {
    public static void main(String[] args){
        System.out.println(palindromeRearranging("aabbbc"));
    }

    static boolean palindromeRearranging(String inputString){
        int[] t = new int[inputString.length()];
        int c = 0, c2 = 0;
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < inputString.length(); i++){
            list.add(inputString.toCharArray()[i]);
            if(list.contains(inputString.toCharArray()[i])){
                t[inputString.indexOf(inputString.toCharArray()[i])]++;
            }
        }
        for(int i  = 0; i < t.length; i++){
            if(t[i]%2 == 1 && t[i] != 0){
                c++;
            }
            else if(t[i]%2 == 0 && t[i] != 0){
                c2++;
            }
        }
        System.out.println(Arrays.toString(t));
        System.out.println(c);
        System.out.println(c2);
        if(c > 1 && c > c2) return false;
        return true;
    }
}
