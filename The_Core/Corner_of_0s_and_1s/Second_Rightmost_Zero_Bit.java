package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
You're given an arbitrary 32-bit integer n. Take its binary representation, split bits into it in pairs (bit number 0 and 1, bit
number 2 and 3, etc.) and swap bits in each pair. Then return the result as a decimal number.

Você recebe um inteiro arbitrário de 32 bits n. Tome sua representação binária, divida os bits em pares (bit número 0 e 1, bit
número 2 e 3, etc.) e troque os bits em cada par. Em seguida, retorne o resultado como um número decimal.
---Comentários/ Comments---
Make an algorithm that converts the number to binary, separates into pairs and then inverts them, in the end converts back to
base 10.

Faça um algoritmo que converta o número em binário, separe em pares e depois inverta-os, no final converta novamente para a 
base 10.
***/

public class Second_Rightmost_Zero_Bit {
    public static void main(String[] args) {
        System.out.println(secondRightmostZeroBit(37));
    }

    static int secondRightmostZeroBit(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
