package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Dado um array de inteiros, substitua todas as ocorrências de elemToReplace por substitutionElem.
---Comentários/ Comments---
Make an algorithm that returns the algorithm with the values exchanged.

Faça um algoritmo que retorne o algoritmo com os valores trocados.
***/

public class Array_Replace {

    public static void main(String[] args) {
        System.out.println(arrayReplace(new int[]{1,2,3}, 1, 3));
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] newArr = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++)
            newArr[i] = inputArray[i] == elemToReplace ? substitutionElem : inputArray[i];
        return newArr;
    }
}
