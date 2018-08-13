package CodeFights.Intro.Through_the_Fog;

/*** 
---Pergunta/ Question---
Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighboring 
numbers is equal (note that 0 and n - 1 are neighboring, too). Given n and firstNumber, find the number which is written in the
radially opposite position to firstNumber.

Considere números inteiros de 0 a n - 1 escritos ao longo do círculo de tal maneira que a distância entre quaisquer dois vizinhos
números são iguais (note que 0 e n - 1 são vizinhos também). Dado n e firstNumber, encontre o número que está escrito no
posição radialmente oposta ao firstNumber.
---Comentários/ Comments---
Make an algorithm that finds the number radially opposite the number of the firstNumber

Faça um algoritmo que encontre o número radialmente oposto ao número da váriavel firstNumber
***/

public class Circle_of_Numbers {
    public static void main(String[] args){
        System.out.println(circleOfNumbers(6,3));
    }

    static int circleOfNumbers(int n, int firstNumber){
        return firstNumber + (n/2) >= n ? firstNumber - (n/2) : firstNumber + (n/2);
    }
}
