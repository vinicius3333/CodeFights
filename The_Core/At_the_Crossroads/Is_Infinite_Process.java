package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
Given integers a and b, determine whether the following pseudocode results in an infinite loop
while a is not equal to b do
  increase a by 1
  decrease b by 1
Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.

Dado inteiros aeb, determine se o seguinte pseudocódigo resulta em um loop infinito
enquanto a não é igual a b fazer
   aumentar um por 1
   diminuir b por 1
Suponha que o programa seja executado em uma máquina virtual que pode armazenar números longos arbitrários e executar para sempre.
---Comentários/ Comments---
Make an algorithm that returns whether the process is infinite or not, according to the rules.

Faça um algoritmo que retorne se o processo é infinito ou não, de acordo com as regras.
***/

public class Is_Infinite_Process {
    public static void main(String[] args) {
        System.out.println(isInfiniteProcess(0, 1));
    }

    static boolean isInfiniteProcess(int a, int b) {
        return !(b >= a && (b - a) % 2 == 0);
    }
}
