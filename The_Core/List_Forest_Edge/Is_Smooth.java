package CodeFights.The_Core.List_Forest_Edge;

public class Is_Smooth {
    public static void main(String[] args) {
        System.out.println(isSmooth(new int[]{7, 2, 2, 5, 10, 7}));
    }

    static boolean isSmooth(int[] arr) {
        if(arr.length%2==0){
            if(arr[0] == arr[arr.length-1]){
                return arr[0] == (arr[(arr.length/2)-1] + arr[arr.length/2]);
            }
            return false;
        }
        return arr[0] == arr[arr.length-1] ? (arr[0] == arr[arr.length/2]) : false;
    }

}
