package CodeFights.Intro.Rains_of_Reason;

import java.util.Arrays;

public class Array_Replace {
    public static void main(String[] args){
        System.out.print(arrayReplace(new int[]{1,2,1}, 1, 3));
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem){
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] == elemToReplace){
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
}
