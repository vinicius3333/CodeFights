package CodeFights.The_Core.Loop_Tunnel;

public class Count_Sum_of_Two_Representations_2 {
    public static void main(String[] args) {
        System.out.println(countSumOfTwoRepresentations2(6, 2, 4));
    }

    static int countSumOfTwoRepresentations2(int n, int l, int r) {
        int result = 0;

        for(int i = l; i <= r; i++){
            int b = n - i;
            if(b >= l && b <= r && b >= i) result++;
        }

        return result;
    }

}
