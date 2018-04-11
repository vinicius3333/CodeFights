package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Array_Packing {
    public static void main(String[] args) {
        System.out.println(arrayPacking(new int[]{24, 85, 0}));
    }

    static int arrayPacking(int[] a) {
        String[] bin = new String[a.length];
        String binS = "";
        int j = 0;

        for(int i = a.length-1; i >= 0; i--){
            bin[i] = Integer.toString(a[j], 2);
            j++;
        }

        for(int i = 0; i < bin.length; i++){
            while(bin[i].length() < 8){
                bin[i] = 0 + bin[i];
            }
        }

        for(String i : bin){
            binS += i;
        }

        int n = Integer.parseInt(binS, 2);

        return n;
    }
}
