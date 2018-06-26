package CodeFights.The_Core.Book_Market;

public class Proper_Noun_Correction {
    public static void main(String[] args) {
        System.out.println(properNounCorrection("pARIS"));
    }

    static String properNounCorrection(String noun) {
        noun = noun.toLowerCase();
        noun = noun.substring(0,1).toUpperCase() + noun.substring(1);
        return noun;
    }
}
