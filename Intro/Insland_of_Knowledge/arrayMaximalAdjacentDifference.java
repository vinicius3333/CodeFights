package CodeFights.Intro.Insland_of_Knowledge;

public class arrayMaximalAdjacentDifference {
    public static void main(String[] args){
        System.out.println(arrayMaximalAdjacentDifference(new int[]{-1, 4, 10, 3, -2}));
    }

    static int arrayMaximalAdjacentDifference(int[] inputArray){
        int sum = 0;
        for(int i = 0; i < inputArray.length - 1; i++){
            if(Math.abs(inputArray[i] - inputArray[i+1]) > sum){   //Verifica se a diferença de dois elementos da array
                sum = Math.abs(inputArray[i] - inputArray[i+1]);   //adjacente é maior que o ultimo valor
            }
        }
        return sum;
    }
}
