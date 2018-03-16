package CodeFights.Intro.Land_of_Logic;

import java.util.Arrays;

public class longestWord {
    public static void main(String[] args) {
        System.out.println(longestWord("Ready,[[[ steady, go!"));
    }

    static String longestWord(String text) {
        String[] str = text.split("\\W+");
        String maior = "";

        for(int i = 0; i < str.length; i++){
            if(str[i].length() > maior.length()){
                maior = str[i];
            }
        }

        return maior;
    }
}
