package CodeFights.Intro.Diving_Deeper;

/*** 
---Pergunta/ Question---
Given array of integers, remove each kth element from it.

Dada matriz de inteiros, remova cada k-ésimo elemento dele.
---Comentários/ Comments---
Make an algorithm that every k-th remove the element from the array.

Faça um algoritmo que a cada k-ésimo remova o elemento da array.
***/

import java.util.ArrayList;
import java.util.Arrays;

public class extractEachKth {
    public static void main(String[] args) {
        System.out.println(extractEachKth(new int[]{5, 7, 11, 4, 10, -9, -1, 5, -2, 1, 11, -3, 4, 4, -3}, 3));
    }

    static int[] extractEachKth(int[] inputArray, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < inputArray.length; i++){
            if((i+1)%k != 0) list.add(inputArray[i]);
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
