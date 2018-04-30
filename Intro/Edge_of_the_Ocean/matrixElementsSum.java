package CodeFights.Intro.Edge_of_the_Ocean;

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
