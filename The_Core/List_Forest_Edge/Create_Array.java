package CodeFights.The_Core.List_Forest_Edge;

import java.util.Arrays;

public class Create_Array {

    public static void main(String[] args) {
        System.out.println(createArray(3));
    }

    static int[] createArray(int size) {
        int[] arr = new int[size];
        Arrays.fill(arr, 1);
        return arr;
    }


}
