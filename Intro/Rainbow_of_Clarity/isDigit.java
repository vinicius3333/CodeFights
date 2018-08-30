package CodeFights.Intro.Rainbow_of_Clarity;

/*** 
---Pergunta/ Question---
Determine if the given character is a digit or not.

Determine se o caractere dado é um dígito ou não.
---Comentários/ Comments---
Make an algorithm to determine if the character is a digit.

Faça um algoritmo para determinar se o caracter é um digito.
***/

public class isDigit {
    public static void main(String[] args) {
        System.out.println(isDigit('-'));
    }

    static boolean isDigit(char symbol) {
        return Character.isDigit(symbol);
    }
}
