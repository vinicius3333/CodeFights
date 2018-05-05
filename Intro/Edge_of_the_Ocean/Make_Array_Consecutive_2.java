package CodeFights.Intro.Edge_of_the_Ocean;

/*** 
---Pergunta/ Question---
Ratiorg got statues of different sizes as a present
from CodeMaster for his birthday, each statue having an non-negative integer size. 
Since he likes to make things perfect, he wants to arrange them from smallest to largest
so that each statue will be bigger than the previous one exactly by 1. 
He may need some additional statues to be able to accomplish that. 
Help him figure out the minimum number of additional statues needed.

Ratiorg obteve estátuas de tamanhos diferentes como um presente
do CodeMaster para seu aniversário, cada estátua tendo um tamanho inteiro não negativo.
Desde que ele gosta de fazer as coisas perfeitas, ele quer organizá-las do menor para o maior
para que cada estátua seja maior que a anterior exatamente por 1.
Eu posso precisar de algumas estátuas adicionais para conseguir isso.
Ajude-o a descobrir o número mínimo de estátuas adicionais necessárias.
---Comentários/ Comments---
Make an algorithm that checks how many statues are missing from the beginning to the end of the array.

Faça um algoritmo que verifique quantas estátuas estão faltando desde o início até o final da array.
***/

import java.util.Collections;
import java.util.HashSet;

public class Make_Array_Consecutive_2 {
    public static void main(String[] args){
        System.out.println(makeArrayConsecutive2(new int[]{6,2,3,8}));
    }

    static int makeArrayConsecutive2(int[] statues) {
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < statues.length; i++){
            set.add(statues[i]);
        }
        int min = Collections.min(set);
        int max = Collections.max(set);

        for(int i = min; i < max; i++){
            if(!set.contains(i)) c++;
        }

        return c;
    }
}
