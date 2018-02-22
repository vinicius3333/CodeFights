package CodeFights.Intro.Insland_of_Knowledge;

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
