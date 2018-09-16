package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same 
amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual
pieces of candy cannot be split.

n crianças tem m pedaços de doces. Eles querem comer o máximo de doces que puderem, mas cada criança deve comer exatamente o mesmo
quantidade de doces como qualquer outra criança. Determine quantos pedaços de doce serão comidos por todas as crianças juntas.
Individual pedaços de doce não podem ser divididos.
---Comentários/ Comments---
Make an algorithm that returns the sum of the numbers that have been divided.

Faça um algoritmo que retorne a soma dos números que foram divididos.
***/

public class Candies {
    public static void main(String[] args) {
        System.out.println(candies(3, 10));
    }

    static int candies(int n, int m) {
        return (m/n)*n;
    }
}
