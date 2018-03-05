package CodeFights.Intro.Diving_Deeper;

public class arrayMaxConsecutiveSum {
    public static void main(String[] args) {
        System.out.println(arrayMaxConsecutiveSum(new int[]{1,3,2,4}, 3));
    }

    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int m = 0;
        for(int i = 0; i <= inputArray.length-k; i++){
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += inputArray[j+i];
                if (sum > m) {
                    m = sum;
                }
            }
        }
        return m;
    }
}
