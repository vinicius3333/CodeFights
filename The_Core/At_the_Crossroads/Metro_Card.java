package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
You just bought a public transit card that allows you to ride the Metro for a certain number of days.

Here is how it works: upon first receiving the card, the system allocates you a 31-day pass, which equals the number of days in
January. The second time you pay for the card, your pass is extended by 28 days, i.e. the number of days in February (note that 
leap years are not considered), and so on. The 13th time you extend the pass, you get 31 days again.
You just ran out of days on the card, and unfortunately you've forgotten how many times your pass has been extended so far.
However, you do remember the number of days you were able to ride the Metro during this most recent month. Figure out the number 
of days by which your pass will now be extended, and return all the options as an array sorted in increasing order.

Você acabou de comprar um cartão de transporte público que permite que você ande no metrô por um determinado número de dias.

Veja como funciona: ao receber o cartão pela primeira vez, o sistema aloca um passe de 31 dias, que é igual ao número de dias em
janeiro. Na segunda vez que você paga pelo cartão, seu passe é prorrogado por 28 dias, ou seja, o número de dias em fevereiro 
(observe que anos bissextos não são considerados) e assim por diante. A 13 ª vez que você estender o passe, você terá 31 dias 
novamente. Você ficou sem dias no cartão e, infelizmente, esqueceu quantas vezes seu passe foi estendido até o momento. No 
entanto, lembre-se do número de dias que você conseguiu usar o metrô durante o mês mais recente. Descubra o número de dias 
em que seu passe será estendido e retorne todas as opções como um array ordenado em ordem crescente.
---Comentários/ Comments---
Make an algorithm to find out how many days your pass has to have next month.

Faça um algoritmo para descobrir quantos dias o seu passe tem que ter no próximo mês.
***/


public class Metro_Card {
    public static void main(String[] args) {
        System.out.println(metroCard(30));
    }

    static int[] metroCard(int lastNumberOfDays) {
        return lastNumberOfDays == 28 ? new int[]{31} : lastNumberOfDays == 30 ? new int[]{31} : new int[]{28, 30, 31};
    }
}
