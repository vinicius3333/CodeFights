package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
Determine if the given number is a power of some non-negative integer.

Determine se o número fornecido é uma potência de um número inteiro não negativo.
---Comentários/ Comments---
Make an algorithm that returns if the number is the result of some exponential number.

Faça um algoritmo que retorne se o número é o resultado de algum número exponencial.
***/

public class Is_Power {
    public static void main(String[] args){
        System.out.println(isPower(125));
    }

    static boolean isPower(int n) {
        for(int i = 1; i <= 400; i++){
            for(int j = 2; j <= 10; j++){
                if((int)Math.pow(i,j)==n)return true;
            }
        }
        return false;
    }

}
