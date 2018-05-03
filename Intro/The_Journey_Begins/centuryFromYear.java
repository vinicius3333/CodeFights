package CodeFights.Intro.The_Journey_Begins;

/*** 
---Pergunta/ Question---
Given a year, return the century it is in. The first century spans from the year 1
up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

Dado um ano, retorne o século em que se encontra. O primeiro século se estende desde o ano 1
até e incluindo o ano 100, o segundo - do ano 101 até e incluindo o ano 200, etc.
---Comentários/ Comments---
Just an algorithm that returns the century of the year.

Apenas escreva um algoritmo que retorne o século do respectivo ano.
***/

public class centuryFromYear {

    public static void main(String[] args){
        System.out.println(centuryFromYear(2));
    }

    static int centuryFromYear(int year){
        return year%100 != 0 ? (year+100)/100 : year/100;    
    }                                 
}                                     
