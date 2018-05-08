package CodeFights.The_Core.List_Forest_Edge;

public class Array_Replace {

    public static void main(String[] args) {
        System.out.println(arrayReplace(new int[]{1,2,3}, 1, 3));
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] newArr = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++)
            newArr[i] = inputArray[i] == elemToReplace ? substitutionElem : inputArray[i];
        return newArr;
    }
}
