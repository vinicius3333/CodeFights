package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
Given an integer n, find the minimal k such that
k = m! (where m! = 1 * 2 * ... * m) for some integer m;
k >= n.
In other words, find the smallest factorial which is not less than n.

Dado um inteiro n, encontre o mínimo k tal que
k = m! (onde m! = 1 * 2 * ... * m) para algum inteiro m;
k> = n.
Em outras palavras, encontre o menor fatorial que não seja menor que n.
---Comentários/ Comments---
Make an algorithm to find the smallest factorial greater than n.

Faça um algoritmo para encontrar o menor fatorial maior que n.
***/

public class Least_Factorial {
    public static void main(String[] args) {
        System.out.println(leastFactorial(17));
    }

    static int leastFactorial(int n) {
        return (n > 1 ? (n >= 6 ? (n >= 24 ? (n >= 120 ? 120 : 120) : 24) : 6) : 1) ;
    }

}
