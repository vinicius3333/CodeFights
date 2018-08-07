package CodeFights.Intro.Rains_of_Reason;

/*** 
---Pergunta/ Question---
Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Dado um array de inteiros, substitua todas as ocorrências de elemToReplace por substitutionElem.
---Comentários/ Comments---
Make an algorithm that changes the value of some index of the array to the substitutionElem if it is equal to the elemToReplace

Faça um algoritmo que troque o valor de algum index da array para o substitutionElem se ele for igual ao elemToReplace 
***/

import java.util.Arrays;

public class Array_Replace {
    public static void main(String[] args){
        System.out.print(arrayReplace(new int[]{1,2,1}, 1, 3));
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem){
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] == elemToReplace){
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
}
