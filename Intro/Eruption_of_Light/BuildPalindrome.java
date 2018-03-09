package CodeFights.Intro.Eruption_of_Light;

public class BuildPalindrome {
    public static void main(String[] args) {
        System.out.println(buildPalindrome("abcdc"));
    }

    static String buildPalindrome(String st) {
        int i = 0;
        while(!st.equals(new StringBuffer(st).reverse().toString())){
            st = new StringBuilder(st).insert(st.length()-i,st.charAt(i)).toString();
            i++;
        }
        return st;
    }
}
