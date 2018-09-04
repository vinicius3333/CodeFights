package CodeFights.Intro.Land_of_Logic;

/*** 
---Pergunta/ Question---
Check if the given string is a correct time representation of the 24-hour clock.

Verifique se a string fornecida é uma representação de hora correta do relógio de 24 horas.
---Comentários/ Comments---
Make an algorithm to find out if the String is in the correct temp format.

Faça um algoritmo para descobrir se a String está no formato de temp correto.
***/

public class Valid_Time {
    public static void main(String[] args) {
        System.out.println(validTime("25:51"));
    }

    static boolean validTime(String time) {
        return Integer.parseInt(time.substring(0,2)) < 24 && Integer.parseInt(time.substring(3,5)) < 60;
    }

}
