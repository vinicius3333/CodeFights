package CodeFights.Intro.Exploring_The_Waters;

public class arrayChange {
    public static void main(String[] args){
        System.out.println(arrayChange(new int[]{1,1,1}));
    }
    /***
    ALGORITMO PARA RETORNAR A SOMA DE TODAS AS ALTERAÇÕES DE UMA ARRAY
    ***/
    static int arrayChange(int[] inputArray){
        int d = 0;
        for(int i = 0; i < inputArray.length-1; i++){
            if(inputArray[i] >= inputArray[i+1]){
                d += (inputArray[i] - inputArray[i+1]) + 1;
                inputArray[i+1] += (inputArray[i] - inputArray[i+1]) + 1;
            }
        }
        return d;
    }
}
