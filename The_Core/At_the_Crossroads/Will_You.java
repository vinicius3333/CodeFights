package CodeFights.The_Core.At_the_Crossroads;

public class Will_You {
    public static void main(String[] args) {
        System.out.println(willYou(true, true, true));
    }

    static boolean willYou(boolean young, boolean beautiful, boolean loved) {
        return (young && beautiful && !loved) || (loved && (!young || !beautiful));
    }
}
