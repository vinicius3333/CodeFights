package CodeFights.Intro.Edge_of_the_Ocean;

/*** 
---Pergunta/ Question---
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing 
sequence by removing no more than one element from the array.

Dada uma seqüência de inteiros como uma matriz, determine se é possível obter um número estritamente crescente
sequência, removendo não mais do que um elemento da matriz.
---Comentários/ Comments---
Make an algorithm to check if an array can be in ascending order by removing an element from it

Faça um algoritmo para verificar se uma array pode ficar em ordem crescente removendo um elemento da mesma
***/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class almostIncreasingSequence {
    public static void main(String[] args){
        System.out.println(almostIncreasingSequence(new int[]{1, 3, 2}));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        int n = 0;

        for(int i = 0; i < sequence.length - 1; i++){
            if(sequence[i] - sequence[i+1] >= 0){
                n++;
                if(i - 1 >= 0 && i + 2 <= sequence.length - 1
                    && sequence[i] - sequence[i+2] >= 0
                    && sequence[i-1] - sequence[i+1] >= 0){
                    return false;
                }
            }
        }
        return n <= 1;
    }
}
