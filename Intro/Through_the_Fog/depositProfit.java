package CodeFights.Intro.Through_the_Fog;

public class depositProfit {
    public static void main(String[] args){
        System.out.print(depositProfit(100,20,170));
    }

    static int depositProfit(double deposit, double rate, double threshold){
        int c = 0;
        while(deposit < threshold){
            deposit += deposit * (rate/100);
            c++;
        }
        return c;
    }
}
