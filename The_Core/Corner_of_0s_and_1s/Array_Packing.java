package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
You are given an array of up to four non-negative integers, each less than 256.
Your task is to pack these integers into one number M in the following way:
The first element of the array occupies the first 8 bits of M;
The second element occupies next 8 bits, and so on.
Return the obtained integer M.

Você recebe uma matriz de até quatro inteiros não negativos, cada um com menos de 256.

Sua tarefa é empacotar esses números inteiros em um número M da seguinte maneira:

O primeiro elemento do array ocupa os primeiros 8 bits de M;
O segundo elemento ocupa os próximos 8 bits e assim por diante.
Retornar o inteiro obtido M.
---Comentários/ Comments---
Make an algorithm that takes all the numbers in an array, converts them to binary numbers, and then joins them and converts them back 
to decimal places.

Faça um algoritmo que pegue todos os números de uma array, converta-os para números binários e depois junte-os e converta novamente para
casa decimal.
***/

public class Array_Packing {
    public static void main(String[] args) {
        System.out.println(arrayPacking(new int[]{24, 85, 0}));
    }

    static int arrayPacking(int[] a) {
        String[] bin = new String[a.length];
        String binS = "";
        int j = 0;

        for(int i = a.length-1; i >= 0; i--){
            bin[i] = Integer.toString(a[j], 2);
            j++;
        }

        for(int i = 0; i < bin.length; i++){
            while(bin[i].length() < 8){
                bin[i] = 0 + bin[i];
            }
        }

        for(String i : bin){
            binS += i;
        }

        int n = Integer.parseInt(binS, 2);

        return n;
    }
}
