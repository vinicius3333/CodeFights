package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
Given an integer n, return the largest number that contains exactly n digits.

Dado um inteiro n, retorna o maior número que contém exatamente n dígitos.
---Comentários/ Comments---
Make an algorithm that returns as many n-digits as possible.

Faça um algoritmo que retorne o maior número possível com a quantiade de n dígitos.
***/

public class Largest_Number {
    public static void main(String[] args) {
        System.out.println(largestNumber(3));
    }

    static int largestNumber(int n) {
        String str = "";

        while(n-- > 0){
            str+="9";
        }
        return Integer.parseInt(str);
    }
}
