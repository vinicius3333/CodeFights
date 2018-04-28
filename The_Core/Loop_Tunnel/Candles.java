package CodeFights.The_Core.Loop_Tunnel;

public class Candles {
    public static void main(String[] args){
        System.out.println(candles(5,2));
    }

    static int candles(int candlesNumber, int makeNew) {
        int leftovers = 0, result = 0;

        while(candlesNumber > 0){
            System.out.println(candlesNumber + " " + leftovers);
            result += candlesNumber;
            leftovers += candlesNumber;
            candlesNumber -= candlesNumber;
            while(leftovers >= makeNew){
                candlesNumber++;
                leftovers -= makeNew;
            }
        }
        return result;
    }

}
