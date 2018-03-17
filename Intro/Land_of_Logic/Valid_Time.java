package CodeFights.Intro.Land_of_Logic;

public class Valid_Time {
    public static void main(String[] args) {
        System.out.println(validTime("25:51"));
    }

    static boolean validTime(String time) {
        return Integer.parseInt(time.substring(0,2)) < 24 && Integer.parseInt(time.substring(3,5)) < 60;
    }

}
