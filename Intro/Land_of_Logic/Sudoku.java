package CodeFights.Intro.Land_of_Logic;

import java.util.ArrayList;

public class Sudoku {
    public static void main(String[] args) {
        System.out.println(sudoku(new int[][]{ {1,3,2,5,4,6,9,8,7},
        {4,6,5,8,7,9,3,2,1},
        {7,9,8,2,1,3,6,5,4},
        {9,2,1,4,3,5,8,7,6},
        {3,5,4,7,6,8,2,1,9},
        {6,8,7,1,9,2,5,4,3},
        {5,7,6,9,8,1,4,3,2},
        {2,4,3,6,5,7,1,9,8},
        {8,1,9,3,2,4,7,6,5}}));
    }

    static  boolean sudoku(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> cow = new ArrayList<>();
        ArrayList<Integer> line = new ArrayList<>();

        if(grid.length != grid[0].length) return false;

        for(int i = 0; i < grid.length; i+=3){
            for(int j = 0; j < grid.length; j+=3){

                for(int i1 = i; i1 < 3+i; i1++){
                    for(int j1 = j; j1 < 3+j; j1++){
                        if(list.contains(grid[i1][j1])){
                            return false;
                        }
                        list.add(grid[i1][j1]);
                    }
                }
                list.clear();
            }

        }

        for(int i = 0; i < grid.length; i++){
            for(int i1 = 0; i1 < grid.length; i1++){
                if(cow.contains(grid[i][i1])){
                    return false;
                }
                cow.add(grid[i][i1]);
            }

            for(int j = 0; j < grid.length; j++){

                if(line.contains(grid[j][i])){
                    return false;
                }
                line.add(grid[j][i]);
            }
            line.clear();
            cow.clear();
        }

        return true;
    }

}
