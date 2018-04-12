package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Range_Bit_Count {
    public static void main(String[] args) {
        System.out.println(rangeBitCount(2, 7));
    }

    static int rangeBitCount(int a, int b) {
        String[] arr = new String[b - a + 1];
        int j = 0, count = 0;

        for(int i = a; i <= b; i++){
            arr[j] = Integer.toBinaryString(i);
            j++;
        }

        for(String i : arr){
            for(int q = 0; q < i.length(); q++){
                if(i.charAt(q) == '1') count++;
            }
        }

        return count;
    }

}
