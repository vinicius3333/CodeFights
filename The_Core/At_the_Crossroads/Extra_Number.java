package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
You're given three integers, a, b and c. It is guaranteed that two of these integers are equal to each other. What is the value of the
third integer?

Você recebe três inteiros, a, bec. É garantido que dois desses números inteiros são iguais entre si. Qual é o valor do
terceiro inteiro?
---Comentários/ Comments---
Make an algorithm that returns between the three numbers, which is similar to no other.

Faça um algoritmo que retorne entre os três números, o qual não é semelhante a nenhum outro.
***/

public class Extra_Number {
    public static void main(String[] args){
        System.out.println(extraNumber(2, 7, 2));
    }

    static  int extraNumber(int a, int b, int c){
        return a == b ? c : (b == c ? a : b);
    }
}
