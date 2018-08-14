package CodeFights.Intro.Through_the_Fog;

/*** 
---Pergunta/ Question---
Given a sorted array of integers a, find an integer x from a such that the value of
abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x) is the smallest possible (here abs denotes the absolute value).
If there are several possible answers, output the smallest one.

Dada uma matriz ordenada de inteiros a, encontre um inteiro x de tal que o valor de
abs (a [0] - x) + abs (a [1] - x) + ... + abs (a [a.length - 1] - x) é o menor possível (aqui abs indica o valor absoluto).
Se houver várias respostas possíveis, imprima a menor.
---Comentários/ Comments---
Make an algorithm that finds the value of x within array a.

Faça um algoritmo que encontre o valor de x dentro da array a
***/

public class absoluteValuesSumMinimization {
    public static void main(String[] args){
        System.out.print(absoluteValuesSumMinimization(new int[]{2,4,5,7}));
    }

    static int absoluteValuesSumMinimization(int[] a){
        if(a.length % 2 == 0) {
            return (a[a.length/2]) > (a[a.length/2 - 1]) ? a[a.length/2-1] : a[a.length/2];
        }
        else{
            return a[a.length / 2];
        }
    }
}
