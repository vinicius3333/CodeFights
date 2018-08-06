package CodeFights.Intro.Insland_of_Knowledge;

/*** 
---Pergunta/ Question---
In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in 
it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to
create a Minesweeper game setup.

No popular jogo Campo Minado você tem um tabuleiro com algumas minas e as que não contêm minas têm um número em
isso indica o número total de minas nas células vizinhas. Começando com algum arranjo de minas que queremos
crie uma configuração de jogo de Campo Minado.
---Comentários/ Comments---
Make a Minesweeper algorithm

Faça um algoritmo de campo minado
***/

import java.util.Arrays;

public class Minesweeper {
    public static void main(String[] args){
        System.out.println(minesweeper(new boolean[][]{{true,true,true,true},
                                                       {true,true,true,true},
                                                      {true,true,true,true}}));
    }

    static int[][] minesweeper(boolean[][] matrix){
        int[][] arr = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] && i+j==0){
                    arr[i][j+1]++;
                    arr[i+1][j]++;
                    arr[i+1][j+1]++;
                } else if(matrix[i][j] && i==matrix.length-1 && j==matrix[i].length-1){
                    arr[i-1][j]++;
                    arr[i][j-1]++;
                    arr[i-1][j-1]++;
                } else if(matrix[i][j] && i > 0 && j == 0 && i < matrix.length-1) {
                    arr[i][j+1]++;
                    arr[i+1][j]++;
                    arr[i-1][j]++;
                    arr[i-1][j+1]++;
                    arr[i+1][j+1]++;
                } else if(matrix[i][j] && i==j && i != matrix.length-1 && j != matrix[i].length-1){
                        arr[i+1][j]++;
                        arr[i][j+1]++;
                        arr[i][j-1]++;
                        arr[i+1][j-1]++;
                        arr[i+1][j+1]++;
                        arr[i-1][j]++;
                        arr[i-1][j-1]++;
                        arr[i-1][j+1]++;
                } else if(matrix[i][j] && i == 0 && j > 0 && j < matrix[i].length-1){
                        arr[i][j-1]++;
                        arr[i][j+1]++;
                        arr[i+1][j+1]++;
                        arr[i+1][j-1]++;
                        arr[i+1][j]++;
                } else if(matrix[i][j] && j == matrix[i].length-1 && i == 0){
                    arr[i][j-1]++;
                    arr[i+1][j]++;
                    arr[i+1][j-1]++;
                } else if(matrix[i][j] && i > 0 && j > 0 && i != matrix.length-1 && j != matrix[i].length-1){
                    arr[i+1][j]++;
                    arr[i][j+1]++;
                    arr[i][j-1]++;
                    arr[i+1][j-1]++;
                    arr[i+1][j+1]++;
                    arr[i-1][j]++;
                    arr[i-1][j-1]++;
                    arr[i-1][j+1]++;
                }
                else if(matrix[i][j] && j == matrix[i].length-1 && i > 0 && i < matrix.length-1){
                    arr[i+1][j]++;
                    arr[i+1][j-1]++;
                    arr[i][j-1]++;
                    arr[i-1][j-1]++;
                    arr[i-1][j]++;
                } else if(matrix[i][j] && i == matrix.length-1 && j==0){
                    arr[i-+1][j]++;
                    arr[i][j+1]++;
                    arr[i-1][j+1]++;
                } else if(matrix[i][j] && i == matrix.length-1 && j > 0 && j < matrix[i].length-1){
                    arr[i-1][j]++;
                    arr[i][j+1]++;
                    arr[i-1][j-1]++;
                    arr[i-1][j+1]++;
                    arr[i][j-1]++;
                }
            }
        }
        return arr;
    }
}
