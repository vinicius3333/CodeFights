package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

public class Pages_Numbering_With_Ink {
    public static void main(String[] args) {
        System.out.println(pagesNumberingWithInk(1, 5));
    }

    static int pagesNumberingWithInk(int current, int numberOfDigits) {
        int dig = 0, a = 0;
        for(int i = current; i < 1200; i++){
            int aux = String.valueOf(i).length();
            dig += aux;
            a = i;
            System.out.println(a);
            if(dig + aux > numberOfDigits || dig >= numberOfDigits) break;
        }

        return a;
    }
}
