package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
You're given two integers, n and m. Find position of the rightmost bit in which they differ in their binary representations 
(it is guaranteed that such a bit exists), counting from right to left.
Return the value of 2position_of_the_found_bit (0-based).

Você recebe dois inteiros, ne m. Encontre a posição do bit mais à direita em que elas diferem em suas representações binárias (contadas da direita para a esquerda).

Retorna o valor da segunda posição do bit encontrado (baseado em 0).
---Comentários/ Comments---
Make an algorithm that takes the two data, turn them into binary base numbers and return two high numbers to the rightmost 
different number.

Faça um algoritmo que pegue os dois dados, transforme-os em números de base binária e retorne dois elevado a posião do número
mais a direita diferente.
***/

public class Different_Rightmost_Bit {
    public static void main(String[] args){
        System.out.println(differentRightmostBit(42, 22));
    }

    static int differentRightmostBit(int n, int m) {
        return (n^m) & -(n^m) ;
    }

}
