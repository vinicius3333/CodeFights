package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
You are standing at a magical well. It has two positive integers written on it: a and b. Each time you cast a magic marble into
the well, it gives you a * b dollars and then both a and b increase by 1. You have n magic marbles. How much money will you make?

Você está em pé em um poço mágico. Ele tem dois inteiros positivos escritos nele: a e b. Cada vez que você lança um mármore mágico
no poço, ele dá a você * b dólares e então ambos aeb aumentam em 1. Você tem n mármores mágicos. Quanto dinheiro você vai ganhar?
---Comentários/ Comments---
Make an algorithm that returns the total dollars you get on the magic wall.

Faça um algoritmo que retorna o total doláres que você consegue na parede mágica.
***/

public class Magical_Well {
    public static void main(String[] args) {
        System.out.println(magicalWell(1,2,2));
    }

    static int magicalWell(int a, int b, int n) {
        int sum = 0;
        while(n-->0){
            sum += a*b;
            a++;
            b++;
        }
        return sum;
    }
}
