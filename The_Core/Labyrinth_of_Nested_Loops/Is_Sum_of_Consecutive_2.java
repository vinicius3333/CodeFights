package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
Find the number of ways to express n as sum of some (at least two) consecutive positive integers.

Encontre o número de maneiras de expressar n como a soma de alguns (pelo menos dois) inteiros positivos consecutivos.
---Comentários/ Comments---
Make an algorithm to return how many times it is possible to make the number with the sum of other numbers.

Faça um algoritmo para retorne quantas vezes é possível fazer o número com a soma de outros números.
***/

public class Is_Sum_of_Consecutive_2 {
    public static void main(String[] args) {
        System.out.println(isSumOfConsecutive2(9));
    }

    static int isSumOfConsecutive2(int n) {
        int res = 0;

        for(int i = 1; i < n; i++){
            int number = n, sub = i;

            while(number > 0){
                number -= sub;
                sub++;
            }
            if(number == 0) res++;
        }

        return res;
    }

}
