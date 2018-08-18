package CodeFights.Intro.Diving_Deeper;

/*** 
---Pergunta/ Question---
Given a string, find the number of different characters in it.

Dada uma string, encontre o número de caracteres diferentes nela.
---Comentários/ Comments---
Make an algorithm to find how many characters are different in a String

Faça um algoritmo para encontrar quantos caracteres sao diferentes em uma String
***/

import java.util.HashSet;

public class differentSymbolsNaive {
    public static void main(String[] args) {
        System.out.println(differentSymbolsNaive("abcda"));
    }

    static int differentSymbolsNaive(String s){
        HashSet<Character> set = new HashSet<>();
        for(char i : s.toCharArray()){
            set.add(i);
        }
        return set.size();
    }
}
