package CodeFights.The_Core.Intro_Gates;

public class Phone_Call {
    public static void main(String[] args) {
        System.out.println(phoneCall(3,1,2,20));
    }

    static int phoneCall(int min1, int min2_10, int min11, int s) {
        int t = 0, t2 = 0, t3 = 0;

        if(s >= min1){
            s -= min1;
            t++;
        }

        while(s > min2_10 && t2 < 9){
            s -= min2_10;
            t2++;
        }

        while(s >= min11 && t2 == 9){
            s -= min11;
            t3++;
        }

        System.out.printf("t1 = %d, t2 = %d, t3 = %d\n", t,t2,t3);

        return t + t2 + t3;
    }

}
