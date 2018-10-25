package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
Given two arrays of integers a and b, obtain the array formed by the elements of a followed by the elements of b.

Dadas duas matrizes de inteiros aeb, obter o array formado pelos elementos de a seguido pelos elementos de b.
---Comentários/ Comments---
Make an algorithm that returns the join of the two arrays.

Faça um algoritmo que retorne a junção das duas arrays.
***/

public class Concatenate_Arrays {
    public static void main(String[] args){

    }

    static int[] concatenateArrays(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        int i, j = 0;
        for(i = 0; i < a.length; i++, j++) newArr[j] = a[i];
        for(i = 0; i < b.length; i++, j++) newArr[j] = b[i];
        return newArr;
    }
}
