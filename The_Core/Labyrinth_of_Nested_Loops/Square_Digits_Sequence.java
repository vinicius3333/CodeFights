package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
Consider a sequence of numbers a0, a1, ..., an, in which an element is equal to the sum of squared digits of the previous
element. The sequence ends once an element that has already been in the sequence appears again. Given the first element a0, find 
the length of the sequence.

Considere uma sequência de números a0, a1, ..., an, em que um elemento é igual à soma dos dígitos quadrados do elemento anterior.
A sequência termina quando um elemento que já está na seqüência aparece novamente. Dado o primeiro elemento a0, encontre o
comprimento da sequência.
---Comentários/ Comments---
Make an algorithm to find the sequence length of the number a0.

Faça um algoritmo para descobrir o tamanho da sequência do número a0.
***/

import java.util.ArrayList;

public class Square_Digits_Sequence {

    public static void main(String[] args) {
        System.out.println(squareDigitsSequence(16));
    }

    static int squareDigitsSequence(int a0) {
        int cur = a0;
        ArrayList<Integer> was = new ArrayList<>();

        while (!was.contains(cur)) {
            was.add(cur);
            int next = 0;
            while (cur > 0) {
                next += (cur % 10) * (cur % 10);
                cur /= 10;
            }
            cur = next;
        }

        return was.size() + 1;
    }
}
