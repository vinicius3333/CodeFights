package CodeFights.The_Core.Intro_Gates;

public class Add_Two_Digits {
    public static void main(String[] args){
        System.out.println(maxMultiple(3,10));
    }

    static int maxMultiple(int divisor, int bound) {
        int greater = 0;
        for(int i = 2; i <= bound; i++){
            if(i%divisor==0 && i > greater){
                greater = i;
            }
        }
        return greater;
    }
}
