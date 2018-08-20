package CodeFights.Intro.Diving_Deeper;

/*** 
---Pergunta/ Question---
Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Dada matriz de inteiros, encontre a soma máxima possível de alguns dos seus k elementos consecutivos.
---Comentários/ Comments---
Make an algorithm to find the largest sum of two numbers in an array

Faça um algoritmo para descobrir a maior soma de dois números de uma array
***/

public class arrayMaxConsecutiveSum {
    public static void main(String[] args) {
        System.out.println(arrayMaxConsecutiveSum(new int[]{1,3,2,4}, 3));
    }

    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int m = 0;
        for(int i = 0; i <= inputArray.length-k; i++){
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += inputArray[j+i];
                if (sum > m) {
                    m = sum;
                }
            }
        }
        return m;
    }
}
