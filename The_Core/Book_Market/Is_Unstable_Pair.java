package CodeFights.The_Core.Book_Market;

public class Is_Unstable_Pair {
    public static void main(String[] args) {
        System.out.println(isUnstablePair("aa", "AAB"));
    }

    static boolean isUnstablePair(String filename1, String filename2) {
        int a = filename1.compareTo(filename2);
        int b = filename1.toLowerCase().compareTo(filename2.toLowerCase());

        return (a < 0 && b > 0) || (a > 0 && b < 0) ;
    }
}
