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

public class Swap_Adjacents_Bits {
    public static void main(String[] args){
        System.out.println(swapAdjacentBits(13));
    }

    static int swapAdjacentBits(int n) {
        return ((0b01010101010101010101010101010101 & n) << 1) + ((0b10101010101010101010101010101010 & n) >> 1) ;
    }

}
