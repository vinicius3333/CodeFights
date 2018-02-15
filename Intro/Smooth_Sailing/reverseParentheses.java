package CodeFights.Intro.Smooth_Sailing;

public class reverseParentheses {
    public static void main(String[] args){
        System.out.println(reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }

    static String reverseParentheses(String s){
        for(int i = 0; i < s.length(); i++) {
            if(s.toCharArray()[i] == ')') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
                String reversed = "";
                while(s.toCharArray()[i] != '(') {
                    reversed += s.toCharArray()[i];
                    s = s.substring(0, i) + s.substring(i + 1);
                    i --;
                }
                s = s.substring(0, i) + reversed + s.substring(i + 1);
                i += reversed.length() - 1;
            }
        }
        return s;
    }
}
