package CodeFights.Intro.Diving_Deeper;

/*** 
---Pergunta/ Question---
Find the leftmost digit that occurs in a given string.

Encontre o dígito mais à esquerda que ocorre em uma determinada string.
---Comentários/ Comments---
Make an algorithm to find the leftmost number of the String

Faça um algoritmo para encontrar o número mais a esquerda possível da String
***/

public class firstDigit {
    public static void main(String[] args) {
        System.out.println(firstDigit("var_1__Int"));
    }

    static char firstDigit(String inputString){
        for(int i = 0; i < inputString.length(); i++){
            if(Character.isDigit(inputString.toCharArray()[i])){
                return inputString.toCharArray()[i];
            }
        }
        return '0';
    }
}
