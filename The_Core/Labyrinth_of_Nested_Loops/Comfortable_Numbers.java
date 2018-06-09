package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

public class Comfortable_Numbers {
    public static void main(String[] args) {
        System.out.println(comfortableNumbers(10, 12));
    }

    static int comfortableNumbers(int l, int r) {
        int pairs = 0;

        for(int i = l; i < r; i++){
            for(int j = i+1; j <= r; j++){
                if(isComfortable(i,j) && isComfortable(j,i)) pairs++;
            }
        }

        return pairs;
    }

    static boolean isComfortable(int a, int b){
        return a - addDigits(a) <= b && b <= a + addDigits(a);
    }

    static int addDigits(int num){
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num = (int)Math.floor(num/10);
        }
        return sum;
    }
}
