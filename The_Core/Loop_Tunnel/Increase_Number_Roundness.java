package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
Define an integer's roundness as the number of trailing zeroes in it.
Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.

Defina um arredondamento de número inteiro como o número de zeros à direita nele.
Dado um inteiro n, verifique se é possível aumentar o arredondamento de n trocando alguns dos seus dígitos.
---Comentários/ Comments---
Make an algorithm that returns if it is possible to make numbers with more zeros to the right.

Faça um algoritmo que retorne se é possível  fazer números com mais zeros a direita.
***/

public class Increase_Number_Roundness {
    public static void main(String[] args) {
        System.out.println(increaseNumberRoundness(11000));
    }

    static boolean increaseNumberRoundness(int n) {
        boolean b = false;
        String str = String.valueOf(n);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0' && !b) b = true;
            if(str.charAt(i) != '0' && b) return true;
        }

        return false;
    }
}
