package CodeFights.The_Core.At_the_Crossroads;

public class Metro_Card {
    public static void main(String[] args) {
        System.out.println(metroCard(30));
    }

    static int[] metroCard(int lastNumberOfDays) {
        return lastNumberOfDays == 28 ? new int[]{31} : lastNumberOfDays == 30 ? new int[]{31} : new int[]{28, 30, 31};
    }
}
