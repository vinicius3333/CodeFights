package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
Presented with the integer n, find the 0-based position of the second rightmost zero bit in its binary representation (it is guaranteed
that such a bit exists), counting from right to left. Return the value of 2position_of_the_found_bit.

Apresentado com o inteiro n, encontre a posição baseada em 0 do segundo bit zero mais à direita em sua representação binária (é garantido 
que tal bit existe), contando da direita para a esquerda. Retorne o valor de 2position_of_the_found_bit.
---Comentários/ Comments---
Make an algorithm that returns the value of the second 0 of the integer bit.

Faça um algoritmo que retorne o valor do segundo 0 do bit do número inteiro.
***/

public class Second_Rightmost_Zero_Bit {
    public static void main(String[] args) {
        System.out.println(secondRightmostZeroBit(37));
    }

    static int secondRightmostZeroBit(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
