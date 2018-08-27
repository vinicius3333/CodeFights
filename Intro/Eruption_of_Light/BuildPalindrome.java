package CodeFights.Intro.Eruption_of_Light;

/*** 
---Pergunta/ Question---
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make
it a palindrome.

Dada uma string, encontre a string mais curta possível que pode ser obtida adicionando caracteres ao final da string inicial para
torná-la um palíndromo.
---Comentários/ Comments---
Make an algorithm to create a palindrome with the given String.

Faça um algoritmo para criar um palíndromo com a String dada.
***/

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
