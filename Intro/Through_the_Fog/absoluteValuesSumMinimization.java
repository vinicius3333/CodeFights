package CodeFights.Intro.Through_the_Fog;

public class absoluteValuesSumMinimization {
    public static void main(String[] args){
        System.out.print(absoluteValuesSumMinimization(new int[]{2,4,5,7}));
    }

    static int absoluteValuesSumMinimization(int[] a){
        if(a.length % 2 == 0) {
            return (a[a.length/2]) > (a[a.length/2 - 1]) ? a[a.length/2-1] : a[a.length/2];
        }
        else{
            return a[a.length / 2];
        }
    }
}
