package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
Reverse the order of the bits in a given integer.

Inverta a ordem dos bits de um número inteiro.
---Comentários/ Comments---
Make an algorithm that converts the bits of the integer number.

Faça um algoritmo que converta os bits do numéro inteiro.
***/

public class Mirror_Bits {
    public static void main(String[] args) {
        System.out.println(mirrorBits(97));
    }

    static int mirrorBits(int a) {
        return Integer.parseInt(new StringBuffer(Integer.toBinaryString(a)).reverse().toString(), 2);
    }
}
