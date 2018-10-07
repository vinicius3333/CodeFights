package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
You're given two integers, n and m. Find position of the rightmost pair of equal bits in their binary representations (it is 
guaranteed that such a pair exists), counting from right to left. Return the value of 2position_of_the_found_pair (0-based).

Você recebe dois inteiros, ne m. Encontre a posição do par mais à direita de bits iguais em suas representações binárias (é
garantido que tal par existe), contando da direita para a esquerda. Retorna o valor da segunda posição do par encontrado 
(baseado em 0).
---Comentários/ Comments---
Make an algorithm that converts the two numbers to binary base and then find the position of the equal bit more to the right and
return 2 to the position.

Faça um algoritmo que converta os dois números para base binária e depois encontre a posição do bit igual mais a direita e retorne
2 elevado a posição.
***/

public class Equal_Pair_of_Bits {
    public static void main(String[] args) {
        System.out.println(equalPairOfBits(10, 11));
    }

    static int equalPairOfBits(int n, int m) {
        return ~(n ^ m) & -(~(n ^ m)) ;
    }
}
