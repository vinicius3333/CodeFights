package CodeFights.The_Core.List_Forest_Edge;

public class First_Reverse_Try {

    public static void main(String[] args) {
        System.out.println(firstReverseTry(new int[]{1,2,3,4,5}));
    }

    static int[] firstReverseTry(int[] arr) {
        if(arr.length == 0) return arr;
        int aux = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = aux;
        return arr;
    }

}
