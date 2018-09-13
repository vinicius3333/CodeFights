package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
You are given a two-digit integer n. Return the sum of its digits.

Você recebe um inteiro de dois dígitos n. Retorna a soma de seus dígitos.
---Comentários/ Comments---
Make an algorithm that returns the sum of the two digits of a number.

Faça um algoritmo que retorne a soma dos dois dígitos de um número.
***/

public class Add_Two_Digits {
    public static void main(String[] args){
        System.out.println(addTwoDigits(24));
    }

    static int addTwoDigits(int n) {
        return Integer.parseInt(String.valueOf(n).substring(0,1)) + Integer.parseInt(String.valueOf(n).substring(1,2));
    }

}
