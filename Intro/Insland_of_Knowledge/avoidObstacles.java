package CodeFights.Intro.Insland_of_Knowledge;

/*** 
---Pergunta/ Question---
You are given an array of integers representing coordinates of obstacles situated on a straight line.
Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make 
jumps of the same length represented by some integer. Find the minimal length of the jump enough to avoid all the obstacles.

Você recebe uma matriz de inteiros representando coordenadas de obstáculos situados em uma linha reta.
Suponha que você esteja pulando do ponto com a coordenada 0 para a direita. Você só tem permissão para fazer saltos do mesmo 
comprimento representados por algum inteiro. Encontre o comprimento mínimo do salto o suficiente para evitar todos os obstáculos.
---Comentários/ Comments---
Make an algorithm that finds the smallest number to bypass all obstacles

Faça um algoritmo que encontre o menor número para desviar de todos os obstáculos
***/

import java.util.ArrayList;
import java.util.Collections;

public class avoidObstacles {
    public static void main(String[] args) {
        System.out.println(avoidObstacles(new int[]{1, 4, 10, 6, 2}));
    }

    static int avoidObstacles(int[] inputArray){
        int t = 0;
        int r = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < inputArray.length; i++){
            list.add(inputArray[i]);
        }
        Collections.sort(list);
        for(int i = 1; i <= Collections.max(list)+1; i++){
            t=0;
            for(int j = 0; j < list.size(); j++){
                if(list.get(j)%i == 0){
                    j = list.size();
                } else if(list.get(j)%i != 0){
                    t++;
                    if(t == inputArray.length){
                        r = i;
                        return i;
                    }
                }
            }
        }
        return r;
    }
}
