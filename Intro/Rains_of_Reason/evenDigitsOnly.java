package CodeFights.Intro.Rains_of_Reason;

public class evenDigitsOnly {
    public static void main(String[] args){
        System.out.print(evenDigitsOnly(642386));
    }

    static boolean evenDigitsOnly(int n){
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(Integer.parseInt(String.valueOf(ch[i]))%2 != 0){
                return false;
            }
        }
        return true;
    }
}
