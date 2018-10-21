package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
Given an integer size, return array of length size filled with 1s.

Dado um tamanho inteiro, retorne uma matriz de tamanho de tamanho preenchida com 1s.
---Comentários/ Comments---
Make an algorithm that returns an array with the number 1 in all indexes.

Faça um algoritmo que retorna um array com o número 1 em todos os indexes.
***/

import java.util.Arrays;

public class Create_Array {

    public static void main(String[] args) {
        System.out.println(createArray(3));
    }

    static int[] createArray(int size) {
        int[] arr = new int[size];
        Arrays.fill(arr, 1);
        return arr;
    }


}
