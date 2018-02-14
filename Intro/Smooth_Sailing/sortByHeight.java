package CodeFights.Intro.Smooth_Sailing;

public class sortByHeight {
    public static void main(String[] args){
        System.out.println(sortByHeight(new int[]{1,3,2,4,-1,6,8,3,5}));
    }

    static int[] sortByHeight(int[] a){
        int[] aux = new int[a.length];

        for(int i = 0; i < a.length-1; i++){
            for(int j = 1; j < a.length-i; j++){
                if(a[i] > a[j+i] && a[j+i] != -1 && a[i] != -1) {
                    aux[i] = a[i];
                    a[i] = a[j+i];
                    a[j+i] = aux[i];
                }
            }
        }
        return a;
    }
}
