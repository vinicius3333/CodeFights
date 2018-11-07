package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
We define the weakness of number x as the number of positive integers smaller than x that have more divisors than x.
It follows that the weaker the number, the greater overall weakness it has. For the given integer n, you need to answer two questions:
what is the weakness of the weakest numbers in the range [1, n]?
how many numbers in the range [1, n] have this weakness?
Return the answer as an array of two elements, where the first element is the answer to the first question, and the second element is 
the answer to the second question.

Nós definimos a fraqueza do número x como o número de inteiros positivos menores que x que têm mais divisores que x.
Segue-se que quanto mais fraco o número, maior a fraqueza geral que ele tem. Para o inteiro dado n, você precisa responder duas perguntas:
Qual é a fraqueza dos números mais fracos no intervalo [1, n]?
Quantos números no intervalo [1, n] têm essa fraqueza?
Retorna a resposta como um array de dois elementos, onde o primeiro elemento é a resposta para a primeira pergunta, e o segundo elemento 
é a resposta para a segunda questão.
---Comentários/ Comments---
Make an algorithm that returns an Array with the weakest numbers.

Faça um algoritmo que retorna uma Array com os números mais fracos.
***/

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Weak_Numbers {
    public static void main(String[] args){
        System.out.println(weakness(9));
    }

    static int[] weakNumbers(int n) {
        ArrayList<Integer> weak = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            weak.add(weakness(i));
        }

        final int max = Collections.max(weak);
        final int c = weak.stream().filter(i -> i == max).collect(Collectors.toList()).size();

        return new int[]{max,c};
    }

    static int weakness(int n){
        int s = 0;
        if(n==1)
            return 0;

        for(int i = 1; i <= n; i++){
            if(divisors(i) > divisors(n)) s++;
        }

        return s;
    }

    static int divisors(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        int s = 0;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) s++;
        }

        return s+2;
    }
}
