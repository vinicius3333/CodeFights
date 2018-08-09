package CodeFights.Intro.Rains_of_Reason;

/*** 
---Pergunta/ Question---
Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.
Check if the given string is a correct variable name.

Os nomes das variáveis corretas consistem apenas em letras inglesas, dígitos e sublinhados e não podem começar com um dígito.
Verifique se a string fornecida é um nome de variável correto.
---Comentários/ Comments---
Make an algorithm to check if a String is a suitable name for a variable

Fazer  um algoritmo para verificar se uma String é um nome adequado a uma variável
***/

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
