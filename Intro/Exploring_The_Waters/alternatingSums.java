package CodeFights.Intro.Exploring_The_Waters;

/*** 
---Pergunta/ Question---
Several people are standing in a row and need to be divided into two teams.The first person goes 
into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
You are given an array of positive integers - the weights of the people. 
Return an array of two integers, where the first element is the total weight of team 1, and the second 
element is the total weight of team 2 after the division is complete.

Várias pessoas estão de pé em fila e precisam ser divididas em duas equipes. A primeira pessoa
entra na equipe 1, a segunda na equipe 2, a terceira na equipe 1 novamente, a quarta na equipe 2 e assim por diante.
Você recebe uma série de inteiros positivos - os pesos das pessoas. Retorna uma matriz de dois
inteiros, em que o primeiro elemento é o peso total da equipe 1 e o segundo elemento é o peso 
total da equipe 2 após a conclusão da divisão.
---Comentários/ Comments---
make an algorithm that puts the sum of the first index of array A in the first index of array B, put the 
sum of the second index of array A in the second index of array B and from the third index of array A the cycle repeats

faça um algoritmo que coloque a soma do primeiro index da array A no primeiro index da array B, coloque a soma do segundo 
index da array A no segundo index da array B e a partir do terceiro index da array A o ciclo se repete
***/

import java.util.Arrays;

public class alternatingSums {
    public static void main(String[] args){
        System.out.println(alternatingSums(new int[]{50, 60, 60, 45, 70}));
    }

    static int[] alternatingSums(int[] a){
        int[] c = new int[2];

        for(int i = 0; i < a.length; i++){
            if(i%2==0) c[0] += a[i];
            else c[1] += a[i];
        }

        return c;
    }
}
