package CodeFights.Intro.Edge_of_the_Ocean;

/*** 
---Pergunta/ Question---
After they became famous, the CodeBots all decided to move to a new building and live together. 
The building is represented by a rectangular matrix of rooms. Each cell in the matrix contains 
an integer that represents the price of the room. Some rooms are free (their cost is 0), but that's 
probably because they are haunted, so all the bots are afraid of them. That is why any room that is 
free or is located anywhere below a free room in the same column is not considered suitable for the
bots to live in.
Help the bots calculate the total price of all the rooms that are suitable for them.

Depois que ficaram famosos, os CodeBots decidiram mudar para um novo prédio e morar juntos. 
O edifício é representado por uma matriz retangular de salas. Cada célula na matriz contém 
um inteiro que representa o preço da sala. Alguns quartos são gratuitos (seu custo é 0), mas
isso é provavelmente porque eles são assombrados, então todos os bots têm medo deles. É por 
isso que qualquer sala que é gratuita ou está localizada em qualquer lugar abaixo de uma sala
livre na mesma coluna não é considerada adequada para os robôs viverem.
Ajude os bots a calcular o preço total de todos os quartos que são adequados para eles.
---Comentários/ Comments---
Make an algorithm that calculates the elements of an array, but the values ​​below the number 0 must not be added

Fazer um algoritmo que calcule os elementos de uma matriz, contudo os valores em baixo do numero 0 não deve ser somado
***/

public class matrixElementsSum {
    public static void main(String[] args){
        System.out.println(matrixElementsSum(new int[][]{new int[]{1, 1, 1, 0},
                                                                  {0, 5, 0, 1},
                                                                  {2, 1, 3, 10}}));
    }

    static int matrixElementsSum(int[][] matrix){
        int c = 0, length;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    length = i;
                    while(length < matrix.length-1){
                        matrix[i+1][j] = 0;
                        length++;
                    }
                }
                else c += matrix[i][j];
            }
        }
        return c;
    }
}
