package CodeFights.Intro.Rainbow_of_Clarity;

public class chessKnight {
    public static void main(String[] args) {
        System.out.println(chessKnight("a1"));
    }

    static int chessKnight(String cell) {
        int count = 0;
        int a = cell.charAt(0)-96;
        int b = cell.charAt(1)-48;

        if(a-2 > 0 && b-1 > 0 && a-2 <= 16 && b-1 <= 16){
            count++;
        }
        if(a-1 > 0 && b-2 > 0 && a-1 <= 16 && b-2 <= 16){
            count++;
        }
        if(a+1 > 0 && b-2 > 0 && a+1 <= 16 && b-2 <= 16){
            count++;
        }
        if(a+2 > 0 && b-1 > 0 && a+2 <= 16 && b-1 <= 16){
            count++;
        }
        if(a+1 > 0 && b+2 > 0 && a+1 <= 16 && b+2 <= 16){
            count++;
        }
        if(a+2 > 0 && b+1 > 0 && a+2 <= 16 && b+1 <= 16){
            count++;
        }
        if(a-1 > 0 && b+2 > 0 && a-1 <= 16 && b+2 <= 16){
            count++;
        }
        if(a-2 > 0 && b+1 > 0 && a-2 <= 16 && b+1 <= 16){
            count++;
        }

        return count;
    }

}
