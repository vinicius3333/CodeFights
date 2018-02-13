package CodeFights.Intro.Edge_of_the_Ocean;

public class matrixElementsSum {
    public static void main(String[] args){
        System.out.println(matrixElementsSum(new int[][]{new int[]{1, 1, 1, 0},
                                                                  {0, 5, 0, 1},
                                                                  {2, 1, 3, 10}}));
    }

    static int matrixElementsSum(int[][] matrix){
        int c = 0;
        int[][] y = new int[matrix.length + 7][matrix.length + 7];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    y[i][j] = 1;
                    y[i+1][j] = 1;
                    y[i+2][j] = 1;
                    y[i+3][j] = 1;
                    y[i+4][j] = 1;
                    y[i+5][j] = 1;
                    y[i+6][j] = 1;
                }
                if(matrix[i][j] > 0 && y[i][j] == 0 && y[i+1][j] == 0){
                    //System.out.println("Soma");
                    c += matrix[i][j];
                }
            }
        }
        return c;
    }
}
