package CodeFights.Intro.The_Journey_Begins;

/*** 
---Pergunta/ Question---
Given the string, check if it is a palindrome.
*A palindrome is a string that reads the same left-to-right and right-to-left.*

Dada uma string, verifique se ela é um palíndromo.
*Um palíndromo é uma string que é igual lida tanto da esquerda pra direita quanto da direita pra esquerda.*
---Comentários/ Comments---
Just create an algorithm that checks that the string is equal to it's reverse.

Apenas crie um algoritmo que verifique se a string é igual a ela reverse.
***/

public class checkPalindrome {
    public static void main(String[] args){
        System.out.println(checkPalindrome("abbaa"));
    }

    static boolean checkPalindrome(String inputString) {
        return inputString.equals(new StringBuffer(inputString).reverse().toString());
    }
}
