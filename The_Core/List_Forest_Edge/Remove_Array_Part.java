package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
Remove a part of a given array between given 0-based indexes l and r (inclusive).

Remova uma parte de uma determinada matriz entre os índices baseados em 0 le e r (inclusive).
---Comentários/ Comments---
Make an algorithm that removes a part of the array.

Faça um algoritmo que remova uma parte da array.
***/

import java.util.Arrays;

public class Remove_Array_Part {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeArrayPart(new int[]{2, 3, 2, 3, 4, 5}, 2, 4)));
    }

    static int[] removeArrayPart(int[] inputArray, int l, int r) {
        int[] newArr = new int[inputArray.length - (r-l+1)];
        int i, j = 0;
        for(i = 0; i < inputArray.length; i++){
            if(i < l || i> r){
                newArr[j] = inputArray[i];
                j++;
            }
        }
        return newArr;
    }
}
