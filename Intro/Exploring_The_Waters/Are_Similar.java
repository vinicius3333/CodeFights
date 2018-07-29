package CodeFights.Intro.Exploring_The_Waters;

/*** 
---Pergunta/ Question---
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
Given two arrays a and b, check whether they are similar.

Dois arrays são chamados semelhantes se um pode ser obtido de outro, trocando no máximo um par de elementos em um dos arrays.
Dados dois arrays aeb, verifique se eles são semelhantes.
---Comentários/ Comments---
Make an algorithm that shows if the two arrays have similar numbers

Faça um algoritmo que mostre se as duas arrays tem numeros similares
***/

import java.util.ArrayList;
import java.util.Collections;

public class Are_Similar {
    public static void main(String[] args){
        System.out.println(areSimilar(new int[]{1, 2,2},
                new int[]{1,1}));
    }

    static boolean areSimilar(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i]) list.add(i);
        
        if(list.size() == 2){
            int i = list.get(0), j = list.get(1);
            return a[i] == b[j] && a[j] == b[i];
        }
        return list.size() == 0;
    }
}
