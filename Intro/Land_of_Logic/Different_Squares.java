package CodeFights.Intro.Land_of_Logic;

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
