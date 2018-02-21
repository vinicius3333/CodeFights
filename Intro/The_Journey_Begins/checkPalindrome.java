package CodeFights.Intro.The_Journey_Begins;

public class checkPalindrome {
    public static void main(String[] args){
        System.out.println(checkPalindrome("abbaa"));
    }

    static boolean checkPalindrome(String inputString) {
        char[] ch = inputString.toCharArray();
        int cont = 0;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ch[inputString.length() - (i + 1)]){
                cont++;
            }
        }
        return cont == inputString.length();
    }
}
