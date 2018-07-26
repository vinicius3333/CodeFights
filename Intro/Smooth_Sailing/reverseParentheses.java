package CodeFights.Intro.Smooth_Sailing;

/*** 
---Pergunta/ Question---
You have a string s that consists of English letters, punctuation marks, whitespace characters,
and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.
Your task is to reverse the strings contained in each pair of matching parentheses, starting 
from the innermost pair. The results string should not contain any parentheses.

Você tem uma string s que consiste em letras inglesas, sinais de pontuação, caracteres de espaço 
em branco e colchetes. É garantido que os parênteses em s formam uma seqüência de colchetes regular.
Sua tarefa é reverter as strings contidas em cada par de parênteses correspondentes, começando 
pelo par mais interno. A string de resultados não deve conter parênteses.
---Comentários/ Comments---
Make an algorithm that inverts the letters within a parenthesis

Faça um algoritmo que inverta as letras dentro de um parêntese
***/

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
