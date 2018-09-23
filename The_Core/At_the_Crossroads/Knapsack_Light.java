package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 and
is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is 
maxW and you can't come back for the items later? Note that there are only two items and you can't bring more than one item of 
each type, i.e. you can't take two first items or two second items.

Você encontrou dois itens em um baú de tesouro! O primeiro item pesa peso1 e vale a pena valor1, e o segundo item pesa peso2 e
vale a pena value2. Qual é o valor máximo total dos itens que você pode levar com você, supondo que sua capacidade máxima de peso
seja maxW e você não pode voltar para os itens mais tarde? Note que existem apenas dois itens e você não pode trazer mais de um
item cada tipo, ou seja, você não pode levar dois primeiros itens ou dois segundos itens.
---Comentários/ Comments---
Make an algorithm to determine how much weight you can carry.

Faça um algoritmo para determinar quanto de peso você consegue carregar.
***/

public class Knapsack_Light {
    public static void main(String[] args){
        System.out.println(knapsackLight(3, 6, 13, 4, 19));
    }

    static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        return weight1 + weight2 <= maxW ? value1+value2 : weight1 > maxW && weight2 > maxW ? 0 :(value1 > value2 ? (weight1 <= maxW ? value1 : value2) : (weight2 <= maxW ? value2 : value1));
    }

}
