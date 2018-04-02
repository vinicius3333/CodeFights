package CodeFights.The_Core.At_the_Crossroads;

public class Reach_Next_Level {
    public static void main(String[] args){
        System.out.println(reachNextLevel(10, 15, 5));
    }

    static boolean reachNextLevel(int experience, int threshold, int reward) {
        return experience + reward >= threshold;
    }

}
