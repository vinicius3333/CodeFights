package CodeFights.Intro.Edge_of_the_Ocean;

public class adjacentElementsProduct {
    public static void main(String[] args){
        System.out.println(adjacentElementProduct(new int[]{-23, 4, -3, 8, -12}));
    }

    static int adjacentElementProduct(int[] inputArray){
        int max = -1000;

        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < inputArray.length; j++){
                if(inputArray[i] * inputArray[j] > max && Math.abs(i - j) == 1) max = inputArray[i] * inputArray[j];
            }
        }
        return max;
    }
}
