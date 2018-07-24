package CodeFights.Intro.Smooth_Sailing;

/*** 
---Pergunta/ Question---
Ticket numbers usually consist of an even number of digits. A ticket number is considered 
lucky if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.

Geralmente, os números dos tickets consistem em um número par de dígitos. Um número de bilhete
é considerado sortudo se a soma da primeira metade dos dígitos for igual à soma da segunda parte.
Dado um número de ticket n, determine se ele é sortudo ou não.
---Comentários/ Comments---
Make an algorithm that compares the sum of the first half and the second part

Faça um algoritmo que compare a soma da primeira metade e a segunda parte
***/

import java.util.stream.IntStream;

public class isLucky {
    public static void main(String[] args){
        System.out.println(isLucky(239017));
    }

    static boolean isLucky(int n){
        int sum = 0;
        String strN = String.valueOf(n);

        for(int i = 0; i < strN.length()/2; i++)
            sum += strN.toCharArray()[i] - strN.toCharArray()[strN.length()-1-i];

        return sum == 0;
    }

}
