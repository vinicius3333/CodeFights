package CodeFights.The_Core.Book_Market;

public class Is_Case_Insensitive_Palindrome {
    public static void main(String[] args) {
        System.out.println(isCaseInsensitivePalindrome("AaBaa"));
    }

    static boolean isCaseInsensitivePalindrome(String inputString) {
        String newInputStirng = inputString.toLowerCase();
        return newInputStirng.equals(String.valueOf(new StringBuffer(newInputStirng).reverse()));
    }
}
