package CodeFights.The_Core.At_the_Crossroads;

public class Tennis_Set {
    public static void main(String[] args) {
        System.out.println(tennisSet(3, 6));
    }

    static boolean tennisSet(int score1, int score2) {
        return ((score1 < 5 && score2 == 6) || ((score1 >= 7 && score2 >= 5) && Math.abs(score1 - score2) <= 2) || (score2 < 5 && score1 == 6) || ((score1 >= 5 && score2 >= 7) && Math.abs(score1 - score2) <= 2)) && score1 != score2;
    }
}
