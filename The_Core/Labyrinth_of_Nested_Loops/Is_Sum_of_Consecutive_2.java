package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

public class Is_Sum_of_Consecutive_2 {
    public static void main(String[] args) {
        System.out.println(isSumOfConsecutive2(9));
    }

    static int isSumOfConsecutive2(int n) {
        int res = 0;

        for(int i = 1; i < n; i++){
            int number = n, sub = i;

            while(number > 0){
                number -= sub;
                sub++;
            }
            if(number == 0) res++;
        }

        return res;
    }

}
