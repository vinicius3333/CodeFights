package CodeFights.Intro.Insland_of_Knowledge;

/*** 
---Pergunta/ Question---
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Dada uma matriz de inteiros, encontre a diferença absoluta máxima entre quaisquer dois dos seus elementos adjacentes.
---Comentários/ Comments---
Make an algorithm that returns the greatest value of the difference of the adjacent numbers of an Array

Faça um algoritmo que retorne o maior valor da diferença dos números adjacentes de uma Array
***/

public class arrayMaximalAdjacentDifference {
    public static void main(String[] args){
        System.out.println(arrayMaximalAdjacentDifference(new int[]{-1, 4, 10, 3, -2}));
    }

    static int arrayMaximalAdjacentDifference(int[] inputArray){
        int sum = 0;
        for(int i = 0; i < inputArray.length - 1; i++){
            if(Math.abs(inputArray[i] - inputArray[i+1]) > sum){   //Verifica se a diferença de dois elementos da array
                sum = Math.abs(inputArray[i] - inputArray[i+1]);   //adjacente é maior que o ultimo valor
            }
        }
        return sum;
    }
}
