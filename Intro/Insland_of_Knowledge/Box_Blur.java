package CodeFights.Intro.Insland_of_Knowledge;

/*** 
---Pergunta/ Question---
Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let 
this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every 
pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.
Return the blurred image as an integer, with the fractions rounded down.

Ontem à noite você festejou um pouco demais. Agora há uma foto em preto e branco de você que está prestes a se tornar viral! Você não pode deixar
isso arruína sua reputação, portanto, você deseja aplicar o algoritmo de desfoque de caixa à foto para ocultar seu conteúdo.
Os pixels na imagem de entrada são representados como inteiros. O algoritmo distorce a imagem de entrada da seguinte maneira:
pixel x na imagem de saída tem um valor igual ao valor médio dos valores de pixel do quadrado 3 × 3 que tem seu centro em x, incluindo x propriamente dito. Todos os pixels na borda de x são removidos.
Retorna a imagem borrada como um inteiro, com as frações arredondadas para baixo.
---Comentários/ Comments---
Make an algorithm that adds the numbers of a 3 x 3 area of ​​an array and returns a new array with the new sum

Faça um algoritmo que some os números de uma area 3 x 3 de uma matriz e retorne uma nova matriz com a nova soma
***/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Box_Blur {
    public static void main(String[] args){
        System.out.println(boxBlur(new int[][]{{36,0,18,9},
                                                {27,54,9,0},
                                                {81,63,72,45}}));
    }

    static int[][] boxBlur(int[][] image){
        int[][] sum2 = new int[image.length-2][image[0].length-2];
        int sum3;
        for(int i = 0; i < (image.length)-2; i++){
            for(int j = 0; j < (image[0].length) - 2; j++){
                sum3 = 0;
                for(int q = 0+i; q < 3+i; q++){
                    for(int t = 0+j; t < 3+j; t++) {
                        sum3 += image[q][t];
                    }
                }
                sum2[i][j] = sum3/9;
            }
        }
        return sum2;
    }
}
