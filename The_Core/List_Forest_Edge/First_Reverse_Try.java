package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
Reversing an array can be a tough task, especially for a novice programmer. Mary just started coding, so she would like to start 
with something basic at first. Instead of reversing the array entirely, she wants to swap just its first and last elements.
Given an array arr, swap its first and last elements and return the resulting array.

Reverter um array pode ser uma tarefa difícil, especialmente para um programador iniciante. Mary acabou de começar a codificar,
então ela gostaria de começar com algo básico no começo. Em vez de reverter completamente o array, ela quer trocar apenas seus
primeiros e últimos elementos.
Dado um arr array, troque seus primeiros e últimos elementos e retorne o array resultante.
---Comentários/ Comments---
Make an algorithm that returns the reverse array.

Faça um algoritmo que retorne a array reversa.
***/

public class First_Reverse_Try {

    public static void main(String[] args) {
        System.out.println(firstReverseTry(new int[]{1,2,3,4,5}));
    }

    static int[] firstReverseTry(int[] arr) {
        if(arr.length == 0) return arr;
        int aux = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = aux;
        return arr;
    }

}
