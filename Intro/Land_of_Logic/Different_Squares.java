package CodeFights.Intro.Land_of_Logic;

/*** 
---Pergunta/ Question---
Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Dada uma matriz retangular contendo apenas dígitos, calcule o número de diferentes quadrados 2 × 2.
---Comentários/ Comments---
Make an algorithm that returns the size of the list with all 2 x 2 elements in the array.

Faça um algoritmo que retorne o tamanho da lista com todos os elementos 2 x 2 da matriz.
***/

import java.util.ArrayList;
import java.util.HashSet;

public class Different_Squares {
    public static void main(String[] args) {
        System.out.println(differentSquares(new int[][]{{1,2,1},{2,2,2},{2,2,2},{1,2,3},{2,2,1}}));
    }

    static int differentSquares(int[][] matrix) {
        String list2;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < matrix.length-1; i++){
            for(int j = 0; j < matrix[i].length-1; j++){
                list2 = "";
                for(int i2 = i; i2 < 2+i; i2++){
                    for(int j2 = j; j2 < 2+j; j2++){
                        list2 += matrix[i2][j2];
                    }
                }
                set.add(list2);
            }
        }

        return set.size();
    }
}
