package codefight;

import java.util.Arrays;

public class SpiralNumbers {
	public static void main(String[] args) {
		System.out.println(spiralNumbers(3));
	}
	
	static int[][] spiralNumbers(int n) {
        int[][] spiral = new int[n][n];
        
        int value = 1;
         
        int minCol = 0;
         
        int maxCol = n-1;
         
        int minRow = 0;
         
        int maxRow = n-1;
         
        while (value <= n*n)
        {
           for (int i = minCol; i <= maxCol; i++)
            {
                spiral[minRow][i] = value;
                     
                value++;
            }
             
            for (int i = minRow+1; i <= maxRow; i++) 
            { 
                spiral[i][maxCol] = value; 
                 
                value++; 
            } 
             
            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = value;
                             
                value++;
            }
             
            for (int i = maxRow-1; i >= minRow+1; i--) 
            {
                spiral[i][minCol] = value;
                 
                value++;
            }
             
            minCol++;
             
            minRow++;
             
            maxCol--;
             
            maxRow--;
        }
        
        return spiral;
	}
}
