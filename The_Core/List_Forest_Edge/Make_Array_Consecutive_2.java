package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size.
Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the
previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number 
of additional statues needed.

Ratiorg obteve estátuas de diferentes tamanhos como um presente do CodeMaster para seu aniversário, cada estátua tendo um tamanho 
inteiro não negativo. Como ele gosta de tornar as coisas perfeitas, ele quer organizá-las do menor para o maior, de modo que cada 
estátua seja maior do que a anterior exatamente por 1. Ele pode precisar de algumas estátuas adicionais para conseguir isso. Ajude-o 
a descobrir o número mínimo de estátuas adicionais necessárias.
---Comentários/ Comments---
Make an algorithm that returns the number of times we need to reshape the array.

Faça um algoritmo que retorne a quantidade de vezes que precisamos remodelar a array.
***/

import java.util.Collections;
import java.util.HashSet;

public class Make_Array_Consecutive_2 {
    public static void main(String[] args) {
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
