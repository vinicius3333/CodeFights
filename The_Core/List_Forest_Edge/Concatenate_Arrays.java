package CodeFights.The_Core.List_Forest_Edge;

public class Concatenate_Arrays {
    public static void main(String[] args){

    }

    static int[] concatenateArrays(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        int i, j = 0;
        for(i = 0; i < a.length; i++, j++) newArr[j] = a[i];
        for(i = 0; i < b.length; i++, j++) newArr[j] = b[i];
        return newArr;
    }
}
