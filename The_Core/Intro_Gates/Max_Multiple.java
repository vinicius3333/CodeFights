package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
Given a divisor and a bound, find the largest integer N such that:
    N is divisible by divisor.
    N is less than or equal to bound.
    N is greater than 0.
It is guaranteed that such a number exists.

Dado um divisor e um limite, encontre o maior inteiro N tal que:
     N é divisível por divisor.
     N é menor ou igual a limite.
     N é maior que 0.
É garantido que esse número existe.
---Comentários/ Comments---
Make an algorithm that returns the largest number divisible by the "divisor" variable and does not pass the "bound" variable number.

Faça um algoritmo que retorne o maior número divisivel pela variável "divisor" e que não passe o número da variável "bound".
***/

public class Add_Two_Digits {
    public static void main(String[] args){
        System.out.println(maxMultiple(3,10));
    }

    static int maxMultiple(int divisor, int bound) {
        int greater = 0;
        for(int i = 2; i <= bound; i++){
            if(i%divisor==0 && i > greater){
                greater = i;
            }
        }
        return greater;
    }
}
