package CodeFights.Intro.Dark_Wilderness;

public class Bishop_and_Pawn {
    public static void main(String[] args) {
        System.out.println(bishopAndPawn("e3","a7"));
    }

    static boolean bishopAndPawn(String bishop, String pawn) {
        return Math.abs((bishop.charAt(0)-97)-(pawn.charAt(0)-97)) == Math.abs((bishop.charAt(1)-48)-(pawn.charAt(1)-48));
    }
}
