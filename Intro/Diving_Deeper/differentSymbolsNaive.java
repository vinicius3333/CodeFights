package CodeFights.Intro.Diving_Deeper;

import java.util.HashSet;

public class differentSymbolsNaive {
    public static void main(String[] args) {
        System.out.println(differentSymbolsNaive("abcda"));
    }

    static int differentSymbolsNaive(String s){
        HashSet<Character> set = new HashSet<>();
        for(char i : s.toCharArray()){
            set.add(i);
        }
        return set.size();
    }
}
