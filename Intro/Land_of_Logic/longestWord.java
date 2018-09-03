package CodeFights.Intro.Land_of_Logic;

/*** 
---Pergunta/ Question---
Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Defina uma palavra como uma sequência de letras inglesas consecutivas. Encontre a palavra mais longa da string dada.
---Comentários/ Comments---
Make an algorithm to return the String with the largest size within a sentence.

Faça um algoritmo para retornar a String com o maior tamanho dentro de uma frase.
***/

import java.util.Arrays;

public class longestWord {
    public static void main(String[] args) {
        System.out.println(longestWord("Ready,[[[ steady, go!"));
    }

    static String longestWord(String text) {
        String[] str = text.split("\\W+");
        String maior = "";

        for(int i = 0; i < str.length; i++){
            if(str[i].length() > maior.length()){
                maior = str[i];
            }
        }

        return maior;
    }
}
