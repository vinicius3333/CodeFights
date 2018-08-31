package CodeFights.Intro.Rainbow_of_Clarity;

/*** 
---Pergunta/ Question---
Given a string, return your defined encoding as follows:
First, the string is divided into the smallest possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"] Then, each substring with length greater than one is replaced by 
a concatenation of its length and the repeated character for example, substring "bbb" is replaced by "3b".
Finally, all new strings are concatenated together in the same order and a new string is returned.

Dada uma string, retorne sua codificação definida da seguinte forma:
Em primeiro lugar, a cadeia é dividida no menor número possível de substrings separadas que consistem em caracteres idênticos
por exemplo, "aabbbc" é dividido em ["aa", "bbb", "c"]. Então, cada substring com comprimento maior que um é substituída por
uma concatenação de seu comprimento e o caractere repetido, por exemplo, substring "bbb" é substituído por "3b".
Finalmente, todas as novas strings são concatenadas juntas na mesma ordem e uma nova string é retornada.
---Comentários/ Comments---
Make an algorithm that takes the substring of a String, put the number of times the character repeats, as long as the number has to be
greater than one to add in the new String.

Faça um algoritmo que pegue a substring de uma String, coloque a quantidade de vezes que o caracter se repete, contanto o número tem 
que ser maior que um para adicionar na nova String.
***/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lineEncoding {
    public static void main(String[] args) {
        System.out.println(lineEncoding("aabbbc"));
    }

    static String lineEncoding(String s) {
        StringBuilder enconding = new StringBuilder();
        char lastChar = s.charAt(0);
        int ocurrences = 1;

        for(int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == lastChar){
                ocurrences++;
            } else{
                enconding.append(ocurrences > 1 ? ocurrences + "" + lastChar : lastChar);
                lastChar = ch;
                ocurrences = 1;
            }
        }

        enconding.append(ocurrences > 1 ? ocurrences + "" + lastChar : lastChar);
        return enconding.toString();
    }
}
