package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
Given integers n, l and r, find the number of ways to represent n as a sum of two integers A and B such that l ≤ A ≤ B ≤ r.

Dado inteiros n, le r, ache o número de modos para representar n como uma soma de dois inteiros A e B tal que l ≤ A ≤ B ≤ r.
---Comentários/ Comments---
Make an algorithm to show how many times you can add two numbers and result in n.

Faça um algoritmo para mostrar quantas vezes se consegue somar dois números e resultar em n.
***/

public class Count_Sum_of_Two_Representations_2 {
    public static void main(String[] args) {
        System.out.println(countSumOfTwoRepresentations2(6, 2, 4));
    }

    static int countSumOfTwoRepresentations2(int n, int l, int r) {
        int result = 0;

        for(int i = l; i <= r; i++){
            int b = n - i;
            if(b >= l && b <= r && b >= i) result++;
        }

        return result;
    }

}
