package CodeFights.Intro.Rains_of_Reason;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class variableName {
    public static void main(String[] args){
        System.out.print(variableName("var_1__Int"));
    }

    static boolean variableName(String name){
        String regex = "[a-zA-Z_]\\w*";
        return name.matches(regex);
    }
}
