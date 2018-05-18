package CodeFights.The_Core.List_Forest_Edge;

import java.util.Arrays;

public class Replace_Middle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{7, 2, 2, 5, 10, 7}));
    }

    static int[] replaceMiddle(int[] arr) {
        if(arr.length%2==0){
            int meio = arr.length/2, sum = arr[meio] + arr[meio-1];
            int[] newArr = new int[arr.length-1];

            for(int i = 0; i < newArr.length; i++){
                if(i == meio-1) newArr[i] = sum;
                else if(i < meio) newArr[i] = arr[i];
                else newArr[i] = arr[i+1];
            }
            return newArr;
        }
        return arr;
    }
}
