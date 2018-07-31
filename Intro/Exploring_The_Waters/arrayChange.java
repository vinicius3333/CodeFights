package CodeFights.Intro.Exploring_The_Waters;

/*** 
---Pergunta/ Question---
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. 
Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Você recebe uma matriz de inteiros. Em cada movimento, você tem permissão para aumentar exatamente um de seus elementos em um.
Encontre o número mínimo de movimentos necessários para obter uma sequência estritamente crescente da entrada.
---Comentários/ Comments---
Make an algorithm that leaves the array in ascending order

Faça um algoritmo que deixe a array em ordem crescente
***/

public class arrayChange {
    public static void main(String[] args){
        System.out.println(arrayChange(new int[]{1,1,1}));
    }
    
    static int arrayChange(int[] inputArray){
        int d = 0;
        for(int i = 0; i < inputArray.length-1; i++){
            if(inputArray[i] >= inputArray[i+1]){
                d += (inputArray[i] - inputArray[i+1]) + 1;
                inputArray[i+1] += (inputArray[i] - inputArray[i+1]) + 1;
            }
        }
        return d;
    }
}
