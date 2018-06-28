package CodeFights.The_Core.Book_Market;

public class Is_Tandem_Repeat {

    public static void main(String[] args) {
        System.out.println(isTandemRepeat("tandemtandem"));
    }

    static boolean isTandemRepeat(String inputString) {
        return inputString.substring(0,inputString.length()/2).equals(inputString.substring(inputString.length()/2));
    }
}
