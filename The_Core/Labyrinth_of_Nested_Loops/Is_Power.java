package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

public class Is_Power {
    public static void main(String[] args){
        System.out.println(isPower(125));
    }

    static boolean isPower(int n) {
        for(int i = 1; i <= 400; i++){
            for(int j = 2; j <= 10; j++){
                if((int)Math.pow(i,j)==n)return true;
            }
        }
        return false;
    }

}
