package CodeFights.Intro.Edge_of_the_Ocean;

/*** 
---Pergunta/ Question---
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Dada uma matriz de números inteiros, encontre o par de elementos adjacentes que possui o maior produto e retorne esse produto.
---Comentários/ Comments---
Make an algorithm to find the largest product among the adjacent elements of an array.

Faça um algoritmo para encontrar o maior produto entre os elementos adjacentes de uma array.
***/

public class adjacentElementsProduct {
    
    public static void main(String[] args){
        System.out.println(adjacentElementProduct(new int[]{-23, 4, -3, 8, -12}));
    }

    static int adjacentElementsProduct(int[] inputArray) {
        int prod = inputArray[0] * inputArray[1];

        for(int i = 1; i < inputArray.length-1; i++){
                int temp = inputArray[i] * inputArray[i+1];
                if(temp > prod) prod = temp;
        }
        return prod;
    }
}
