package CodeFights.Intro.Rains_of_Reason;

/*** 
---Pergunta/ Question---
Check if all digits of the given integer are even.

Verifique se todos os dígitos do inteiro dado são par.
---Comentários/ Comments---
Make an algorithm to check if all the digits of a number are even

Faça um algoritmo para verificar se todos os digitos de um número são pares
***/

public class evenDigitsOnly {
    public static void main(String[] args){
        System.out.print(evenDigitsOnly(642386));
    }

    static boolean evenDigitsOnly(int n){
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(Integer.parseInt(String.valueOf(ch[i]))%2 != 0){
                return false;
            }
        }
        return true;
    }
}
