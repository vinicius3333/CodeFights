package CodeFights.Intro.Land_of_Logic;

/*** 
---Pergunta/ Question---
CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to
figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program
that sums up all the numbers which appear in the given input. Help Ratiorg by writing a function that returns the sum of numbers that 
appear in the given inputString.

O CodeMaster acaba de retornar das compras. Ele escaneou o cheque dos itens que comprou e deu a string resultante para Ratiorg para
descobrir o número total de itens comprados. Já que o Ratiorg é um bot ele definitivamente vai automatizá-lo, então ele precisa de um 
programa que resume todos os números que aparecem na entrada dada. Ajude Ratiorg escrevendo uma função que retorne a soma dos números 
que aparecem na entrada inputString.
---Comentários/ Comments---
Make an algorithm that adds all the digits of the given String.

Faça um algoritmo que some todos os dígitos da String dada.
***/

import java.util.Arrays;

public class sumUpNumbers {
    public static void main(String[] args) {
        System.out.println(sumUpNumbers(" oranges, 3milk 66cartons ( litres)"));
    }

    static int sumUpNumbers(String inputString) {
        int sum = 0;
        boolean b = false;
        StringBuilder strB = new StringBuilder("");

        if(inputString.matches("\\s+")) return 0;

        if(inputString.matches(".*[a-zA-Z].*")) {
            String[] str = inputString.split("\\s+", 1);
            str = inputString.split("\\D+");
            for(String i : str){
                try{
                    sum += Integer.parseInt(i);
                } catch(java.lang.NumberFormatException e){
                }
            }
        } else{
            String[] str = inputString.split("\\D+");
            for(String i : str) {
                strB.append(i);
            }
            sum = Integer.parseInt(String.valueOf(strB));
        }
        return sum;
    }

}
