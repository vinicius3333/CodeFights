package CodeFights.Intro.Rains_of_Reason;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Character.valueOf;

public class chessBoardCellColor {
    public static void main(String[] args){
        System.out.print(chessBoardCellColor("A2", "A5"));
    }

    static boolean chessBoardCellColor(String cell1, String cell2){
        char c = valueOf(cell1.charAt(0));
        char c2 = valueOf(cell2.charAt(0));
        int t = valueOf(cell1.charAt(1));
        int t2 = valueOf(cell2.charAt(1));
        System.out.print(((int)c) + t - (((int)c2)+t2));
        if((Math.abs(((int)c) + t)-(((int)c2)+t2))%2==0){
            return true;
        } return false;
    }
}
