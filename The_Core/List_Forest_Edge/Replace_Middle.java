package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
We define the middle of the array arr as follows:
if arr contains an odd number of elements, its middle is the element whose index number is the same when counting from the 
beginning of the array and from its end;
if arr contains an even number of elements, its middle is the sum of the two elements whose index numbers when counting from
the beginning and from the end of the array differ by one.
Given array arr, your task is to find its middle, and, if it consists of two elements, replace those elements with the value of 
middle. Return the resulting array as the answer.

Nós definimos o meio da matriz arr como segue:
se arr contiver um número ímpar de elementos, seu meio é o elemento cujo número de índice é o mesmo ao contar a partir do
início do array e do seu final;
se arr contiver um número par de elementos, seu meio é a soma dos dois elementos cujos números de índice, quando contados a 
partir do início e do final da matriz, diferem em um.
Dado array arr, sua tarefa é encontrar o meio e, se for composto por dois elementos, substituir esses elementos pelo valor do 
meio. Retorna a matriz resultante como a resposta.
---Comentários/ Comments---
Make an algorithm to change the middle of the array according to the rules.

Faça um algoritmo para trocar o meio da array de acordo com as regras.
***/

import java.util.Arrays;

public class Replace_Middle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{7, 2, 2, 5, 10, 7}));
    }

    static int[] replaceMiddle(int[] arr) {
        if(arr.length%2==0){
            int meio = arr.length/2, sum = arr[meio] + arr[meio-1];
            int[] newArr = new int[arr.length-1];

            for(int i = 0; i < newArr.length; i++){
                if(i == meio-1) newArr[i] = sum;
                else if(i < meio) newArr[i] = arr[i];
                else newArr[i] = arr[i+1];
            }
            return newArr;
        }
        return arr;
    }
}
